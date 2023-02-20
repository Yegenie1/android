package com.cookandroid.subway;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


import androidx.annotation.Nullable;

public class OrderActivity extends Activity {

    SharedPreferences sharedPreferences;
    EditText edtRequest;
    RadioGroup rGroup3,rGroup4;
    CheckBox CMeat, Cshrimp, CEggMayo,COmelet, CAvocado, CBacon, CPepperoni,CCheese, CRanch,CMayo,CSwonion,CHoneymu,CSwchilli,CHotchilli,CChipole,Chorse,CSoda,CCoffee,CSoup,CPotato,CChip,CChocochip,CDbchoco,CHsah;
    Button btnSave, btnLoad, btnReset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main);
        setTitle("주문하기");

        initPreferences(); //SharedPreferences 초기화
        initView(); //View 초기화
        btn_Event(); //버튼 클릭 시의 이벤트
        loadState(); //상태를 불러오는 메소드

        Button btnReturn=(Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }


        });

    }
    private void btn_Event() {

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rGroup3.getCheckedRadioButtonId() == 0||rGroup4.getCheckedRadioButtonId() == 0) {
                    Toast.makeText(getApplicationContext(), "메뉴와 빵을 선택해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    saveState(); //상태를 저장하는 메소드
                    Toast.makeText(getApplicationContext(), "주문되었습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadState(); //상태를 불러오는 메소드
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rGroup3.check(0);
                rGroup4.check(0);

                CMeat.setChecked(false);
                Cshrimp.setChecked(false);
                COmelet.setChecked(false);
                CEggMayo.setChecked(false);
                CAvocado.setChecked(false);
                CBacon.setChecked(false);
                CPepperoni.setChecked(false);
                CCheese.setChecked(false);
                CRanch.setChecked(false);
                CMayo.setChecked(false);
                CSwonion.setChecked(false);
                CHoneymu.setChecked(false);
                CSwchilli.setChecked(false);
                CHotchilli.setChecked(false);
                CChipole.setChecked(false);
                Chorse.setChecked(false);
                CSoda.setChecked(false);
                CCoffee.setChecked(false);
                CSoup.setChecked(false);
                CPotato.setChecked(false);
                CChip.setChecked(false);
                CChocochip.setChecked(false);
                CDbchoco.setChecked(false);
                CHsah.setChecked(false);

                edtRequest.setText("");
            }
        });

    }


    private void loadState() {      //상태를 불러오는 메소드

        rGroup3.check(sharedPreferences.getInt("radioGroup3", 0));
        rGroup4.check(sharedPreferences.getInt("radioGroup4", 0));

        CMeat.setChecked(sharedPreferences.getBoolean("CMeat", false));
        Cshrimp.setChecked(sharedPreferences.getBoolean("Cshrimp", false));
        CEggMayo.setChecked(sharedPreferences.getBoolean("CEggMayo", false));
        COmelet.setChecked(sharedPreferences.getBoolean("COmelet", false));
        CAvocado.setChecked(sharedPreferences.getBoolean("CAvocado", false));
        CBacon.setChecked(sharedPreferences.getBoolean("CBacon", false));
        CPepperoni.setChecked(sharedPreferences.getBoolean("CPepperoni", false));
        CCheese.setChecked(sharedPreferences.getBoolean("CCheese", false));
        CRanch.setChecked(sharedPreferences.getBoolean("CRanch", false));
        CMayo.setChecked(sharedPreferences.getBoolean("CMayo", false));
        CSwonion.setChecked(sharedPreferences.getBoolean("CSwonion", false));
        CHoneymu.setChecked(sharedPreferences.getBoolean("CHoneymu", false));
        CSwchilli.setChecked(sharedPreferences.getBoolean("CSwchilli", false));
        CHotchilli.setChecked(sharedPreferences.getBoolean("CHotchilli", false));
        CChipole.setChecked(sharedPreferences.getBoolean("CChipole", false));
        Chorse.setChecked(sharedPreferences.getBoolean("Chorse", false));
        CSoda.setChecked(sharedPreferences.getBoolean("CSoda", false));
        CCoffee.setChecked(sharedPreferences.getBoolean("CCoffee", false));
        CSoup.setChecked(sharedPreferences.getBoolean("CSoup", false));
        CPotato.setChecked(sharedPreferences.getBoolean("CPotato", false));
        CChip.setChecked(sharedPreferences.getBoolean("CChip", false));
        CChocochip.setChecked(sharedPreferences.getBoolean("CChocochip", false));
        CDbchoco.setChecked(sharedPreferences.getBoolean("CDbchoco", false));
        CHsah.setChecked(sharedPreferences.getBoolean("CHsah", false));

        edtRequest.setText(sharedPreferences.getString("name", ""));

    }


    private void saveState() {                                                              //상태를 저장하는 메소드
        SharedPreferences.Editor editor = sharedPreferences.edit();                     //변화를 주는 메소드를 작성하기 전 반드시 editor를 생성
        editor.putInt("radioGroup3", rGroup3.getCheckedRadioButtonId());             //RadioGroup의 경우는 Int 형
        editor.putInt("radioGroup4", rGroup4.getCheckedRadioButtonId());

        editor.putBoolean("CMeat", CMeat.isChecked());                               //CheckBox의 경우는 Boolean 형
        editor.putBoolean("Cshrimp", Cshrimp.isChecked());
        editor.putBoolean("CEggMayo", CEggMayo.isChecked());
        editor.putBoolean("COmelet", COmelet.isChecked());
        editor.putBoolean("CAvocado", CAvocado.isChecked());
        editor.putBoolean("CBacon", CBacon.isChecked());
        editor.putBoolean("CPepperoni", CPepperoni.isChecked());
        editor.putBoolean("CCheese", CCheese.isChecked());
        editor.putBoolean("CRanch", CRanch.isChecked());
        editor.putBoolean("CMayo", CMayo.isChecked());
        editor.putBoolean("CSwonion", CSwonion.isChecked());
        editor.putBoolean("CHoneymu", CHoneymu.isChecked());
        editor.putBoolean("CSwchilli", CSwchilli.isChecked());
        editor.putBoolean("CHotchilli", CHotchilli.isChecked());
        editor.putBoolean("CChipole", CChipole.isChecked());
        editor.putBoolean("Chorse", Chorse.isChecked());
        editor.putBoolean("CSoda", CSoda.isChecked());
        editor.putBoolean("CCoffee", CCoffee.isChecked());
        editor.putBoolean("CSoup", CSoup.isChecked());
        editor.putBoolean("CPotato", CPotato.isChecked());
        editor.putBoolean("CChip", CChip.isChecked());
        editor.putBoolean("CChocochip", CChocochip.isChecked());
        editor.putBoolean("CDbchoco", CDbchoco.isChecked());
        editor.putBoolean("CHsah", CHsah.isChecked());

        editor.putString("name",edtRequest.getText().toString());   //EditText의 경우 String 형
        editor.commit();                                  //commit() 메소드를 호출해야 SharedPreferences에 저장
    }

    private void initPreferences() {                   //SharedPreferences를 초기화하는 메소드
        sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
    }       //SharedPreferences의 저장경로는 해당 단말기 "data/data/[패키지 이름]/shared_prefs/이름.xml"

    private void initView() {
        edtRequest = (EditText)findViewById(R.id.edtRequest);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnLoad = (Button)findViewById(R.id.btnLoad);
        btnReset = (Button)findViewById(R.id.btnReset);

        CMeat=(CheckBox)findViewById(R.id.Meat);
        Cshrimp=(CheckBox)findViewById(R.id.shrimp);
        CEggMayo=(CheckBox)findViewById(R.id.EggMayo);
        COmelet=(CheckBox)findViewById(R.id.Omelet);
        CAvocado=(CheckBox)findViewById(R.id.Avocado);
        CBacon=(CheckBox)findViewById(R.id.Bacon);
        CPepperoni=(CheckBox)findViewById(R.id.Pepperoni);
        CCheese=(CheckBox)findViewById(R.id.Cheese);
        CRanch=(CheckBox)findViewById(R.id.Ranch);
        CMayo=(CheckBox)findViewById(R.id.Mayo);
        CSwonion=(CheckBox)findViewById(R.id.Swonion);
        CHoneymu=(CheckBox)findViewById(R.id.Honeymu);
        CSwchilli=(CheckBox)findViewById(R.id.Swchilli);
        CHotchilli=(CheckBox)findViewById(R.id.Hotchilli);
        CChipole=(CheckBox)findViewById(R.id.Chipotle);
        Chorse=(CheckBox)findViewById(R.id.horse);
        CSoda=(CheckBox)findViewById(R.id.Soda);
        CCoffee=(CheckBox)findViewById(R.id.Coffee);
        CSoup=(CheckBox)findViewById(R.id.Soup);
        CPotato=(CheckBox)findViewById(R.id.Potato);
        CChip=(CheckBox)findViewById(R.id.Chip);
        CChocochip=(CheckBox)findViewById(R.id.Chocochip);
        CDbchoco=(CheckBox)findViewById(R.id.Dbchoco);
        CHsah=(CheckBox)findViewById(R.id.Hash);
        rGroup3=(RadioGroup)findViewById(R.id.Rgroup3);
        rGroup4=(RadioGroup)findViewById(R.id.Rgroup4);
    }
}
