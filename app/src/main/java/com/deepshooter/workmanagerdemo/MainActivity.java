package com.deepshooter.workmanagerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deepshooter.workmanagerdemo.chainworkrequest.ChainWorkRequestActivity;
import com.deepshooter.workmanagerdemo.onetimerequest.OneTimeRequestActivity;
import com.deepshooter.workmanagerdemo.periodicrequest.PeriodicWorkRequestActivity;

public class MainActivity extends AppCompatActivity {

    private Button mOneTimeRequest,mPeriodicRequest,mChainRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setValues();
    }
    private void initView(){

        mOneTimeRequest = findViewById(R.id.oneTimeRequest);
        mPeriodicRequest = findViewById(R.id.periodicRequest);
        mChainRequest = findViewById(R.id.chainRequest);

    }

    private void setValues(){

        mOneTimeRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OneTimeRequestActivity.class));
            }
        });

        mPeriodicRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PeriodicWorkRequestActivity.class));
            }
        });


        mChainRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChainWorkRequestActivity.class));
            }
        });
    }
}
