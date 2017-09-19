package com.example.touchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


/**
 * Created by admin on 2017/9/10.
 */

public class TouchEventForViewActivity extends AppCompatActivity {

    View view;
    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touchforview);

        //关联控件
        initControl();

        //在控件上注册监听
        view.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View v, MotionEvent event){
                if(event.getAction()==MotionEvent.ACTION_MOVE){
                    int x=(int)event.getX();
                    int y=(int)event.getY();
                    textView.setText("X="+x+",Y="+y);
                }
                return true;
            }
        });
    }

    private void initControl(){
        view=findViewById(R.id.view);
        textView=(TextView)findViewById(R.id.tvPosition);
    }
}
