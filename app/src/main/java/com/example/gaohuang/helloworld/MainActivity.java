package com.example.gaohuang.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "toast", Toast.LENGTH_SHORT).show();

//                结束这个activity
//                finish();

//                使用显示的方法打开一个activity
                Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
//                intent.putExtra("maindata", "mainactivity");

//                使用隐式的方法打开一个activity
//                Intent intent = new Intent("ACTION_START");
//                intent.addCategory("android.intent.category.DEFAULT2");

//                打开浏览器
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));

//                打开拨号
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);

//                希望从下一个活动返回的时候携带数据
                startActivityForResult(intent, 1);
            }
        });
        Log.d("xiaota", "init.................");
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(RESULT_OK == resultCode){
                    String temStr = data.getStringExtra("data");
                    Log.d("mainactivity", temStr);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "add item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "remove item", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

        return true;
    }
}
