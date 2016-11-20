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

    Button ali;
    Button afi;
    Button sli;
    Button sfi;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionpage);

        ali = (Button) findViewById(R.id.addlostpage);
        ali.setOnClickListener(this);
        afi = (Button) findViewById(R.id.addfoundpage);
        afi.setOnClickListener(this);
        sli = (Button) findViewById(R.id.searchlostpage);
        sli.setOnClickListener(this);
        sfi = (Button) findViewById(R.id.searchfoundpage);
        sfi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.addlostpage:
                Intent intent4 = new Intent(ActionActivity.this, AddLostItemActivity.class);
                startActivity(intent4);
                break;
            case R.id.addfoundpage:
                Intent intent5 = new Intent(ActionActivity.this, AddFoundItemActivity.class);
                startActivity(intent5);
                break;
            case R.id.searchlostpage:
                Intent intent6 = new Intent(ActionActivity.this, SearchLostItemActivity.class);
                startActivity(intent6);
                break;
            case R.id.searchfoundpage:
                Intent intent7 = new Intent(ActionActivity.this, SearchFoundItemActivity.class);
                startActivity(intent7);
                break;
        }
    }
}

