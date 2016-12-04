package ph.edu.apc.roadtweet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class InputActivity extends AppCompatActivity {

    private static final int SIGN_IN_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


    FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputLocation = (EditText) findViewById(R.id.inputLocation);
                EditText input = (EditText) findViewById(R.id.input);

                if (inputLocation.getText().toString().isEmpty()) {
                    inputLocation.setError("Please input your location");
                    return;
                } else if (input.getText().toString().isEmpty()) {
                    input.setError("Please input your roadtweet");
                    return;
                }else{
                    // Read the input field and push a new instance
                    // of ChatMessage to the Firebase database
                    FirebaseDatabase.getInstance()
                            .getReference()
                            .push()
                            .setValue(new ChatMessage(inputLocation.getText().toString(), input.getText().toString(),
                                    FirebaseAuth.getInstance()
                                            .getCurrentUser()
                                            .getDisplayName())
                            );

                    // Clear the input
                    inputLocation.setText("");
                    input.setText("");
                    startActivity(new Intent(InputActivity.this, MainActivity.class));
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_sign_out) {
            AlertDialog alertDialog = new AlertDialog.Builder(InputActivity.this).create();
            alertDialog.setTitle("Sign Out");
            alertDialog.setMessage("Are you sure you want to Sign Out?");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            startActivityForResult(
                                    AuthUI.getInstance().createSignInIntentBuilder().build(),
                                    SIGN_IN_REQUEST_CODE );
                        }
                    });
            alertDialog.show();
        }
        return true;
    }
}
