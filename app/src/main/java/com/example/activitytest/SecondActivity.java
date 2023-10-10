package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d(TAG, "task id is " + getTaskId());

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
//                intent.putExtra("data_return","hello firstactivity");
//                setResult(RESULT_OK,intent);
//                finish();
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data_return","hello firstactivity");
        setResult(RESULT_OK,intent);
        finish();
    }
}