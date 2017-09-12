package com.example.day02demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout activity_main;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.e("qwertyu","-----------");
    }

    private void initView() {
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
    }
}
