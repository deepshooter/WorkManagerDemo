package com.deepshooter.workmanagerdemo.onetimerequest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {

    private static final String TAG = "MyWorker";

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        int number1 = 40;
        int number2 = 30;

        int sum = number1+number2;

        Log.i(TAG, "doWork: Sum = "+sum );

        return Result.SUCCESS;
    }
}
