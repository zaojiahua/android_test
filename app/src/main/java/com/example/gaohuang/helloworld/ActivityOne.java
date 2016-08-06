package com.example.gaohuang.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_one);

        Log.d("one", "taskid:" + getTaskId());

        Button normal = (Button)findViewById(R.id.button);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inent = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivity(inent);
            }
        });
    }
}
