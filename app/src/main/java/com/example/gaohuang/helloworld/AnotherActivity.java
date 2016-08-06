package com.example.gaohuang.helloworld;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

//        Intent intent = getIntent();
//        Log.d("intentdata", intent.getStringExtra("maindata"));

        Button button = (Button)findViewById(R.id.another_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inent = new Intent(AnotherActivity.this, ThirdActivity.class);
                startActivity(inent);

            }
        });

        Log.d("create", this.toString());
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("destroy", "destroy");
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data", "anotheractivity backpressed");
        setResult(RESULT_OK, intent);
        finish();
    }
}
