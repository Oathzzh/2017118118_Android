package com.example.switchover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorld2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world2);
        Button button1=(Button)findViewById(R.id.button_2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorld2.this,"Now You Are In HelloWorld1",
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HelloWorld2.this,HelloWorld1.class);
                startActivity(intent);
            }
        });
    }
}
