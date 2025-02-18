package com.example.singlanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class IntroName extends AppCompatActivity {
    private LinearLayout Tlinear; //전체 화면 linear
    private AlertDialog.Builder builder;
    @Override
    public void onBackPressed() {
        // 기존 뒤로가기 버튼의 기능을 막기위해 주석처리 또는 삭제
        // super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_name);

        final DBToday dbToday = DBToday.getInstance(getApplicationContext());

        final EditText Name = (EditText) findViewById(R.id.nametext);
        Button bt_name = findViewById(R.id.name);
        Tlinear = (LinearLayout)findViewById(R.id.Tlinear); //전체화면 linear

        // edittext말고 다른데 터치시 키보드 창 없앰
        Tlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm=(InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(Name.getWindowToken(), 0);
            }
        });

        //이름 입력후 ManiActivity.java로 이동
        bt_name.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String na = Name.getText().toString();
                builder = new AlertDialog.Builder(IntroName.this);
                // 제목셋팅
                builder.setTitle("*알림*");
                //이름 입력안했을경우
                if(na.equals("")){
                    builder.setMessage("이름을 입력해주세요");
                    builder.setPositiveButton("예",
                            new DialogInterface.OnClickListener() {
                                public void onClick(
                                        DialogInterface dialog, int id) {
                                    // 다이얼로그를 취소한다
                                    dialog.cancel();
                                }
                            });
                    builder.create().show();
                }
                else{
                    dbToday.insertname(na);
                    final Intent intent = new Intent(IntroName.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }

            }
        });


    }
}
