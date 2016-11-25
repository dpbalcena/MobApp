package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepage);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
/*            case R.id.signup_btn:
                Intent intent3 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent3);
                break;
*/
        }
    }
}

