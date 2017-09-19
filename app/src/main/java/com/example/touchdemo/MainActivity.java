package com.example.touchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvposition=(TextView)findViewById(R.id.textView);
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }

    public boolean onTouchEvent(MotionEvent event) {
        int action=event.getAction();
        float x=event.getX();
        float y=event.getY();

        switch (action){
//            case MotionEvent.ACTION_DOWN:
//                Log.i("TEST","onTouchEvent:down X="+x+",Y="+y);
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.i("TEST","onTouchEvent:up X="+x+",Y="+y);
//                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TEST","onTouchEvent:move X="+x+",Y="+y);
                tvposition.setText("X="+x+",Y="+y);
                return true;
//                break;
        }

        //Log.i("TEST","onTouchEvent");
        //默认返回为false，表示自身方法中没有做完，需要向上传递
//        return super.onTouchEvent(event);
//        如果认为在方法中事情做完了，可以返回true
          return true;
    }

}
