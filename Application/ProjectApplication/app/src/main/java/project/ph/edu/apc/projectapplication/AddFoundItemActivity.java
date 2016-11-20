package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class AddFoundItemActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitafi;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfounditempage);

        submitafi = (Button) findViewById(R.id.submit_afi);
        submitafi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.submit_afi:
                Intent intent8 = new Intent(AddFoundItemActivity.this, MainActivity.class);
                startActivity(intent8);
                break;

        }
    }
}

