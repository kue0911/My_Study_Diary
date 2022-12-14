package com.example.My_Study_Diary;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String getTime = simpleDate.format(date);

        TextView tv_date = findViewById(R.id.tv_date);
        tv_date.setText(getTime);
    }

    public void onClick_menu(View v){
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String getTime = simpleDate.format(date);

        EditText et_title = findViewById(R.id.et_title);
        String getTitle = et_title.getText().toString();

        EditText et_contents = findViewById(R.id.et_contents);
        String getContents = et_contents.getText().toString();

        String file_name = getTime;

        SharedPreferences sharedPreferences = getSharedPreferences(file_name,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("time",getTime);
        editor.putString("title",getTitle);
        editor.putString("contents",getContents);
        editor.putString("emotion",getEmotion);

        editor.commit();

        SharedPreferences sharedPreferences_list = getSharedPreferences("total_list",MODE_PRIVATE);
        SharedPreferences.Editor editor_list = sharedPreferences_list.edit();

        editor_list.putString(getTime,getTime);

        editor_list.commit();

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClick_delete(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("정말로 삭제하시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        builder.setNegativeButton("아니요", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    String getEmotion = "";

    public void onClick_emotion_1(View v) {

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e1);
                imageButton2.setImageResource(R.drawable.e22);
                imageButton3.setImageResource(R.drawable.e33);
                imageButton4.setImageResource(R.drawable.e44);
                imageButton5.setImageResource(R.drawable.e55);
                imageButton6.setImageResource(R.drawable.e66);

                getEmotion = "1";
            }
        });
    }

    public void onClick_emotion_2(View v) {

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e11);
                imageButton2.setImageResource(R.drawable.e2);
                imageButton3.setImageResource(R.drawable.e33);
                imageButton4.setImageResource(R.drawable.e44);
                imageButton5.setImageResource(R.drawable.e55);
                imageButton6.setImageResource(R.drawable.e66);

                getEmotion = "2";
            }
        });
    }

    public void onClick_emotion_3(View v) {

        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e11);
                imageButton2.setImageResource(R.drawable.e22);
                imageButton3.setImageResource(R.drawable.e3);
                imageButton4.setImageResource(R.drawable.e44);
                imageButton5.setImageResource(R.drawable.e55);
                imageButton6.setImageResource(R.drawable.e66);

                getEmotion = "3";
            }
        });
    }

    public void onClick_emotion_4(View v) {

        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e11);
                imageButton2.setImageResource(R.drawable.e22);
                imageButton3.setImageResource(R.drawable.e33);
                imageButton4.setImageResource(R.drawable.e4);
                imageButton5.setImageResource(R.drawable.e55);
                imageButton6.setImageResource(R.drawable.e66);

                getEmotion = "4";
            }
        });
    }

    public void onClick_emotion_5(View v) {

        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e11);
                imageButton2.setImageResource(R.drawable.e22);
                imageButton3.setImageResource(R.drawable.e33);
                imageButton4.setImageResource(R.drawable.e44);
                imageButton5.setImageResource(R.drawable.e5);
                imageButton6.setImageResource(R.drawable.e66);

                getEmotion = "5";
            }
        });
    }

    public void onClick_emotion_6(View v) {

        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
                ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

                imageButton1.setImageResource(R.drawable.e11);
                imageButton2.setImageResource(R.drawable.e22);
                imageButton3.setImageResource(R.drawable.e33);
                imageButton4.setImageResource(R.drawable.e44);
                imageButton5.setImageResource(R.drawable.e55);
                imageButton6.setImageResource(R.drawable.e6);

                getEmotion = "6";
            }
        });
    }

}