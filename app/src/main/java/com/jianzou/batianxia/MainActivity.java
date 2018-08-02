package com.jianzou.batianxia;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button button;
    SunCustomView sumView;

    private String mCurrentTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
        initView();
    }

    private void initView()
    {
        mCurrentTime = "12:30";
        sumView = (SunCustomView) findViewById(R.id.sun_view);
        button = (Button) findViewById(R.id.btn_set_time);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sumView.setTimes("04:50", "18:50", mCurrentTime);
                button.setText("当前时间：" + mCurrentTime);
            }
        });
    }
}
