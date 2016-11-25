package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class SearchLostItemActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitsli;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchlostitempage);

        submitsli = (Button) findViewById(R.id.submit_sli);
        submitsli.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.submit_sli:
                Intent intent11 = new Intent(SearchLostItemActivity.this, MainActivity.class);
                startActivity(intent11);
                break;

         }
    }
}

