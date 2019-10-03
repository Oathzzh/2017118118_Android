package com.example.work4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello2 extends AppCompatActivity {
    private static final String TAG="Hello2";
    private static int objCount=0;
    private int mobjCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        objCount++;
        mobjCount=objCount;
        Log.d("Hello2",this.toString());
        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Hello2.this,Hello1.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: "+mobjCount);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: "+mobjCount);
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: "+mobjCount);
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: "+mobjCount);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: "+mobjCount);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart: "+mobjCount);
    }
}
