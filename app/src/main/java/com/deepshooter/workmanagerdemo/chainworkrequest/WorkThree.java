package com.deepshooter.workmanagerdemo.chainworkrequest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkThree extends Worker {

    private static final String TAG = "ChainRequest";

    public WorkThree(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.i(TAG, "doWork: Work Three Finished");

        return Result.SUCCESS;
    }
}
