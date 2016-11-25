package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        login = (Button) findViewById(R.id.login_btn);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.login_btn:
                Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}

