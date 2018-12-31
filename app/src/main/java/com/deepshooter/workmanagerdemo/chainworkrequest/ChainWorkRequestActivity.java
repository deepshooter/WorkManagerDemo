package com.deepshooter.workmanagerdemo.chainworkrequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.deepshooter.workmanagerdemo.R;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

public class ChainWorkRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chainable_work_request);

        chainRequest();

    }


    private void chainRequest(){

        OneTimeWorkRequest oneTimeWorkRequest1 = new OneTimeWorkRequest.Builder(WorkOne.class).build();
        OneTimeWorkRequest oneTimeWorkRequest2 = new OneTimeWorkRequest.Builder(WorkTwo.class).build();
        OneTimeWorkRequest oneTimeWorkRequest3 = new OneTimeWorkRequest.Builder(WorkThree.class).build();

      /*  WorkManager.getInstance()
                .beginWith(oneTimeWorkRequest1)
                .then(oneTimeWorkRequest2)
                .then(oneTimeWorkRequest3)
                .enqueue();*/

        WorkManager.getInstance()
                .beginWith(oneTimeWorkRequest1,oneTimeWorkRequest2)
                .then(oneTimeWorkRequest3)
                .enqueue();

    }
}
