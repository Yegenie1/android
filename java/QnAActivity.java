package com.cookandroid.subway;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;

public class QnAActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qna);

        Button btnReturn =(Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        final String[] qna = {"질문을 선택해주세요", "앱으로 주문시 최소 주문 금액이 있나요?","서브웨이 앱을 통한 주문 중  이용 가능한 시간은 언제인가요?","서브웨이의 다양한 혜택과 소식을 받아보고 싶습니다.","30cm 샌드위치의 기준은 무엇인가요?"};
        EditText Edtreq;

        Spinner spinner =(Spinner) findViewById(R.id.spinner1);
        Edtreq=(EditText)findViewById(R.id.Edtreq);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,qna);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==1){
                    try {
                        InputStream inputS =getResources().openRawResource(R.raw.txt1);
                        byte[] txt =new byte[inputS.available()];
                        inputS.read(txt);
                        Edtreq.setText(new String(txt));
                        inputS.close();
                    }catch (IOException e){}
                }
                if (position==2){
                    try {
                        InputStream inputS =getResources().openRawResource(R.raw.txt2);
                        byte[] txt =new byte[inputS.available()];
                        inputS.read(txt);
                        Edtreq.setText(new String(txt));
                        inputS.close();
                    }catch (IOException e){}
                }
                if (position==3){
                    try {
                        InputStream inputS =getResources().openRawResource(R.raw.txt3);
                        byte[] txt =new byte[inputS.available()];
                        inputS.read(txt);
                        Edtreq.setText(new String(txt));
                        inputS.close();
                    }catch (IOException e){}
                }
                if (position==4){
                    try {
                        InputStream inputS =getResources().openRawResource(R.raw.txt4);
                        byte[] txt =new byte[inputS.available()];
                        inputS.read(txt);
                        Edtreq.setText(new String(txt));
                        inputS.close();
                    }catch (IOException e){}
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
