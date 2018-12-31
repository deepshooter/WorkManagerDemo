package com.deepshooter.workmanagerdemo.chainworkrequest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkTwo extends Worker {

    private static final String TAG = "ChainRequest";

    public WorkTwo(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.i(TAG, "doWork: Work Two Started");
        try {
            Thread.sleep(5000);
            Log.i(TAG, "doWork: Work Two Finished");
            return Result.SUCCESS;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return Result.FAILURE;
        }

    }
}
