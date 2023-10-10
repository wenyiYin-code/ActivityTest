package com.example.activitytest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceStaete){
        super.onCreate(savedInstanceStaete);
        ActivityCollector.addActivity(this);
        Log.d(TAG, getClass().getSimpleName());
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
