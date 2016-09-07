package com.example.fumingzhen.text7;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                layout=(LinearLayout)MainActivity.this.getLayoutInflater().inflate(R.layout.linear,null);
                builder.setTitle("提示");
                builder.setView(layout);
                builder.setPositiveButton("确定",new ok1());
                builder.setNegativeButton("取消",new cancel1());
                builder.setNeutralButton("忽略",new hl1());
                builder.create();
                builder.show();
            }
            class ok1 implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    EditText e1=(EditText)layout.findViewById(R.id.editText);
                    EditText e2=(EditText)layout.findViewById(R.id.editText2);
                    String s=e1.getText().toString();
                    String s1=e2.getText().toString();
                    if(s.equals("abc")){
                        if(s1.equals("123")){
                            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"密码错误",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            class cancel1 implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
            class hl1 implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("提示");
                builder.setMessage("请登录");
                builder.setPositiveButton("确定",new ok());
                builder.setNegativeButton("取消",new cancel());
                builder.setNeutralButton("忽略",new hl());
                builder.create();
                builder.show();

            }
            class ok implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
            class cancel implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
            class  hl implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
        });


    }
}
