package com.example.intentdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent= getIntent();//获取启动SecondActivity的Intent
        String data=intent.getStringExtra("extra_data");//获取传递的数据
        Log.d("SecondActivity",data);

        Button button2=(Button) findViewById(R.id.Button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("data_return","hello FirstActivity");
                setResult(RESULT_OK,intent);//向上一个活动返回数据
                finish();//摧毁当前活动
            }
        });
    }
}
