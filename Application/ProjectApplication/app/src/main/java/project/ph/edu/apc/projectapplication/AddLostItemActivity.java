package project.ph.edu.apc.projectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by School on 11/20/2016.
 */

public class AddLostItemActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitali;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addlostitempage);

        submitali = (Button) findViewById(R.id.submit_ali);
        submitali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.submit_ali:
                Intent intent9 = new Intent(AddLostItemActivity.this, MainActivity.class);
                startActivity(intent9);
                break;

         }
    }
}

