package com.example.kairataitpayev.usingintent;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MianActivity extends ActionBarActivity {

    int request_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mian);
    }

    public void onClick(View v)
    {
        //startActivity(new Intent("net.learn2develop.SecondActivity"));
        startActivityForResult(new Intent("net.learn2develop.SecondActivity"), request_Code);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == request_Code)
        {
            if(resultCode == RESULT_OK)
            {
                Toast.makeText(this, cd.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }

    }
}
