package com.example.switchover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorld1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world1);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorld1.this,"Now You Are In HelloWorld2",
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HelloWorld1.this,HelloWorld2.class);
                startActivity(intent);
            }
        });
    }
}
