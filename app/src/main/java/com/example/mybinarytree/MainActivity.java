package com.example.mybinarytree;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    LinearLayout[] ll = new LinearLayout[33];
    CheckBox[] cb = new CheckBox[32];
    EditText[] et = new EditText[32];
    String[] inputArray = new String[32];
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ll[0] = (LinearLayout) findViewById(R.id.linearLayout0);
        ll[1] = (LinearLayout) findViewById(R.id.linearLayout1);
        ll[2] = (LinearLayout) findViewById(R.id.linearLayout2);
        ll[3] = (LinearLayout) findViewById(R.id.linearLayout3);
        ll[4] = (LinearLayout) findViewById(R.id.linearLayout4);
        ll[5] = (LinearLayout) findViewById(R.id.linearLayout5);
        ll[6] = (LinearLayout) findViewById(R.id.linearLayout6);
        ll[7] = (LinearLayout) findViewById(R.id.linearLayout7);
        ll[8] = (LinearLayout) findViewById(R.id.linearLayout8);
        ll[9] = (LinearLayout) findViewById(R.id.linearLayout9);
        ll[10] = (LinearLayout) findViewById(R.id.linearLayout10);
        ll[11] = (LinearLayout) findViewById(R.id.linearLayout11);
        ll[12] = (LinearLayout) findViewById(R.id.linearLayout12);
        ll[13] = (LinearLayout) findViewById(R.id.linearLayout13);
        ll[14] = (LinearLayout) findViewById(R.id.linearLayout14);
        ll[15] = (LinearLayout) findViewById(R.id.linearLayout15);
        ll[16] = (LinearLayout) findViewById(R.id.linearLayout16);
        ll[17] = (LinearLayout) findViewById(R.id.linearLayout17);
        ll[18] = (LinearLayout) findViewById(R.id.linearLayout18);
        ll[19] = (LinearLayout) findViewById(R.id.linearLayout19);
        ll[20] = (LinearLayout) findViewById(R.id.linearLayout20);
        ll[21] = (LinearLayout) findViewById(R.id.linearLayout21);
        ll[22] = (LinearLayout) findViewById(R.id.linearLayout22);
        ll[23] = (LinearLayout) findViewById(R.id.linearLayout23);
        ll[24] = (LinearLayout) findViewById(R.id.linearLayout24);
        ll[25] = (LinearLayout) findViewById(R.id.linearLayout25);
        ll[26] = (LinearLayout) findViewById(R.id.linearLayout26);
        ll[27] = (LinearLayout) findViewById(R.id.linearLayout27);
        ll[28] = (LinearLayout) findViewById(R.id.linearLayout28);
        ll[29] = (LinearLayout) findViewById(R.id.linearLayout29);
        ll[30] = (LinearLayout) findViewById(R.id.linearLayout30);
        ll[31] = (LinearLayout) findViewById(R.id.linearLayout31);
        ll[32] = (LinearLayout) findViewById(R.id.linearLayout32);
        cb[1] = (CheckBox) findViewById(R.id.checkBox1);
        cb[2] = (CheckBox) findViewById(R.id.checkBox2);
        cb[3] = (CheckBox) findViewById(R.id.checkBox3);
        cb[4] = (CheckBox) findViewById(R.id.checkBox4);
        cb[5] = (CheckBox) findViewById(R.id.checkBox5);
        cb[6] = (CheckBox) findViewById(R.id.checkBox6);
        cb[7] = (CheckBox) findViewById(R.id.checkBox7);
        cb[8] = (CheckBox) findViewById(R.id.checkBox8);
        cb[9] = (CheckBox) findViewById(R.id.checkBox9);
        cb[10] = (CheckBox) findViewById(R.id.checkBox10);
        cb[11] = (CheckBox) findViewById(R.id.checkBox11);
        cb[12] = (CheckBox) findViewById(R.id.checkBox12);
        cb[13] = (CheckBox) findViewById(R.id.checkBox13);
        cb[14] = (CheckBox) findViewById(R.id.checkBox14);
        cb[15] = (CheckBox) findViewById(R.id.checkBox15);
        cb[16] = (CheckBox) findViewById(R.id.checkBox16);
        cb[17] = (CheckBox) findViewById(R.id.checkBox17);
        cb[18] = (CheckBox) findViewById(R.id.checkBox18);
        cb[19] = (CheckBox) findViewById(R.id.checkBox19);
        cb[20] = (CheckBox) findViewById(R.id.checkBox20);
        cb[21] = (CheckBox) findViewById(R.id.checkBox21);
        cb[22] = (CheckBox) findViewById(R.id.checkBox22);
        cb[23] = (CheckBox) findViewById(R.id.checkBox23);
        cb[24] = (CheckBox) findViewById(R.id.checkBox24);
        cb[25] = (CheckBox) findViewById(R.id.checkBox25);
        cb[26] = (CheckBox) findViewById(R.id.checkBox26);
        cb[27] = (CheckBox) findViewById(R.id.checkBox27);
        cb[28] = (CheckBox) findViewById(R.id.checkBox28);
        cb[29] = (CheckBox) findViewById(R.id.checkBox29);
        cb[30] = (CheckBox) findViewById(R.id.checkBox30);
        cb[31] = (CheckBox) findViewById(R.id.checkBox31);
        et[1] = (EditText) findViewById(R.id.editText1);
        et[2] = (EditText) findViewById(R.id.editText2);
        et[3] = (EditText) findViewById(R.id.editText3);
        et[4] = (EditText) findViewById(R.id.editText4);
        et[5] = (EditText) findViewById(R.id.editText5);
        et[6] = (EditText) findViewById(R.id.editText6);
        et[7] = (EditText) findViewById(R.id.editText7);
        et[8] = (EditText) findViewById(R.id.editText8);
        et[9] = (EditText) findViewById(R.id.editText9);
        et[10] = (EditText) findViewById(R.id.editText10);
        et[11] = (EditText) findViewById(R.id.editText11);
        et[12] = (EditText) findViewById(R.id.editText12);
        et[13] = (EditText) findViewById(R.id.editText13);
        et[14] = (EditText) findViewById(R.id.editText14);
        et[15] = (EditText) findViewById(R.id.editText15);
        et[16] = (EditText) findViewById(R.id.editText16);
        et[17] = (EditText) findViewById(R.id.editText17);
        et[18] = (EditText) findViewById(R.id.editText18);
        et[19] = (EditText) findViewById(R.id.editText19);
        et[20] = (EditText) findViewById(R.id.editText20);
        et[21] = (EditText) findViewById(R.id.editText21);
        et[22] = (EditText) findViewById(R.id.editText22);
        et[23] = (EditText) findViewById(R.id.editText23);
        et[24] = (EditText) findViewById(R.id.editText24);
        et[25] = (EditText) findViewById(R.id.editText25);
        et[26] = (EditText) findViewById(R.id.editText26);
        et[27] = (EditText) findViewById(R.id.editText27);
        et[28] = (EditText) findViewById(R.id.editText28);
        et[29] = (EditText) findViewById(R.id.editText29);
        et[30] = (EditText) findViewById(R.id.editText30);
        et[31] = (EditText) findViewById(R.id.editText31);

        for(int i=1; i<32; i++)
            cb[i].setOnCheckedChangeListener(new OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    for (int j=1; j<8; j++) {
                        if (cb[j].isChecked()) {
                            et[j].setEnabled(true);
                            ll[j * 2].setVisibility(View.VISIBLE);
                            ll[j * 2 + 1].setVisibility(View.VISIBLE);
                        } else {
                            et[j].setEnabled(false);
                            et[j].setText("");
                            et[j * 2].setText("");
                            et[j * 2 + 1].setText("");
                            cb[j * 2].setChecked(false);
                            cb[j * 2 + 1].setChecked(false);
                            ll[j * 2].setVisibility(View.INVISIBLE);
                            ll[j * 2 + 1].setVisibility(View.INVISIBLE);
                        }
                    }

                    for(int j=8; j<16; j++){
                        if (cb[j].isChecked()) {
                            et[j].setEnabled(true);
                            ll[32].setVisibility(View.VISIBLE);
                            ll[j * 2].setVisibility(View.VISIBLE);
                            ll[j * 2 + 1].setVisibility(View.VISIBLE);
                            if(++cnt==1)
                                Toast.makeText(getApplicationContext(), "Horizontal scroll is activated", Toast.LENGTH_SHORT).show();
                        } else {
                            et[j].setEnabled(false);
                            et[j].setText("");
                            et[j * 2].setText("");
                            et[j * 2 + 1].setText("");
                            cb[j * 2].setChecked(false);
                            cb[j * 2 + 1].setChecked(false);
                            ll[j * 2].setVisibility(View.INVISIBLE);
                            ll[j * 2 + 1].setVisibility(View.INVISIBLE);
                        }

                    }


                    for (int k=16; k<32; k++) {
                        if (cb[k].isChecked()) {
                            et[k].setEnabled(true);
                        } else {
                            et[k].setEnabled(false);
                            et[k].setText("");
                        }
                    }


                }
            });



    }


    public void onButton1Clicked(View v){

        for (int i=1; i<32; i++) {
            if (et[i].getText().toString().length() != 0)
                inputArray[i] = et[i].getText().toString();
        }

        Intent intent = new Intent(this, OutputActivity.class);
        intent.putExtra("nodeArray", inputArray);

        startActivity(intent);

    }

}