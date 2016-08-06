package com.example.gaohuang.helloworld;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);

        Log.d("create", "create");
        Log.d("create", this.toString());

        Button normal = (Button)findViewById(R.id.button);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ThirdActivity.this, AnotherActivity.class);
//                startActivity(intent);
                Intent inent = new Intent(ThirdActivity.this, AnotherActivity.class);
                startActivity(inent);
            }
        });

        Button dialog = (Button)findViewById(R.id.button_dialog);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onStart(){
        super.onStart();
        Log.d("start", "start");
    }

    public void onResume(){
        super.onResume();
        Log.d("resume", "resume");
    }

    public void onPause(){
        super.onPause();
        Log.d("pause", "pause");
    }

    public void onStop(){
        super.onStop();
        Log.d("stop", "stop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("destroy", "destroy");
    }

    public void onRestart(){
        super.onRestart();
        Log.d("restart", "restart");
    }
}
