package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class SearchFoundItemActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitsfi;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchfounditempage);

        submitsfi = (Button) findViewById(R.id.submit_sfi);
        submitsfi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.submit_sfi:
                Intent intent10 = new Intent(SearchFoundItemActivity.this, MainActivity.class);
                startActivity(intent10);
                break;

        }
    }
}

