package com.example.work6_contacts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private String[] data = {"apple:1231251", "Banana:1341325", "Orange:16416537"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        Button button = (Button) findViewById(R.id.add);
        Button button1 = (Button) findViewById(R.id.delete);
        Button button2 = (Button) findViewById(R.id.update);
        editText = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                String inputText = editText.getText().toString();
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "您未输入任何信息", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, inputText + "已添加到通讯录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("警告！");
                dialog.setMessage("你确定要删除此联系人吗？");
                dialog.setCancelable(false);
                dialog.setPositiveButton("删除", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
            case R.id.update:
                break;
            default:
                break;
        }
    }
}
