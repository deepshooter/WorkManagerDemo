package com.deepshooter.workmanagerdemo.chainworkrequest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkOne extends Worker {

    private static final String TAG = "ChainRequest";

    public WorkOne(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.i(TAG, "doWork: Work One Finished ");

        return Result.SUCCESS;
    }
}
