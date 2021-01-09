package ucucite.edu.tinappay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    //Code Go to List of tinapay
    public void gotohome(View view) {
        Intent intent = new Intent(home.this, StartActivity.class);
        startActivity(intent);
    }

    //Code to Exit app
    public void exit(View view) {
        finish();
        System.exit(0);
    }

}