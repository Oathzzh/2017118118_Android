package com.example.multithread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int UPDATE_TEXT = 1;

    private TextView text;
    private int count;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_TEXT:
                    count++;
                    text.setText("计数：" + count);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        Button counter = (Button) findViewById(R.id.start);
        counter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Timer timer = new Timer();
                        TimerTask task = new TimerTask() {
                            @Override
                            public void run() {
                                Message message = new Message();
                                message.what = UPDATE_TEXT;
                                handler.sendMessage(message);
                            }
                        };
                        timer.schedule(task, 0, 100);
                        try {
                            Thread.sleep(1000);

                            timer.cancel();
                        } catch (InterruptedException e) {
                        }
                    }
                }).start();
            default:
                break;
        }
    }
}
