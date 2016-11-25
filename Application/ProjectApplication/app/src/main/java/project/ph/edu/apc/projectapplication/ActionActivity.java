package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class ActionActivity extends AppCompatActivity implements View.OnClickListener {

    Button signupbtn;
    Button loginbtn;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionpage);
        signupbtn = (Button) findViewById(R.id.signuppage);
        loginbtn = (Button) findViewById(R.id.loginpage);
        signupbtn.setOnClickListener(this);
        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.loginpage:
                Intent intent = new Intent(ActionActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.signuppage:
                Intent intent1 = new Intent(ActionActivity.this, SignupActivity.class);
                startActivity(intent1);
                break;
        }

    }
}

