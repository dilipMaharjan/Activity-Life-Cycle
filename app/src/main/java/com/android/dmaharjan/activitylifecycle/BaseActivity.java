package com.android.dmaharjan.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by dmaharjan on 1/29/17.
 */

public class BaseActivity extends AppCompatActivity {
    private String tag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag = getClass().getSimpleName();
        Log.i(tag, " -- onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, " -- onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, " -- onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "--onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, " -- onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, " -- onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, " -- onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(tag, " -- onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(tag, " -- onRestoreInstanceState");
    }
}
