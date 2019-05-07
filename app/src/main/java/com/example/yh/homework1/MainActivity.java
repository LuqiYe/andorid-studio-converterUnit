package com.example.yh.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    TextView mFtoC, mCtoF,mKmValue,mMileValue,mKgValue,mLbValue,mLitreValue,mGallonValue;
    EditText mtestCtoF,mtestFtoC,mKmtoMile,mMiletoKm,mKgtoLb,mLbtoKg,mLtoGal,mGaltoL;
    Button mbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton1 = (Button) findViewById(R.id.button1);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //C @ F
                double C = 0.0, F = 0.0;
                if(mtestCtoF.getText().length() != 0) {
                    C = Double.parseDouble(mtestCtoF.getText().toString());
                    F = (C * 1.8) + 32;
                    mtestCtoF.setText("");
                    mtestFtoC.setText(Double.toString(F));
                }
                else if(mtestFtoC.getText().length() != 0) {
                    F = Double.parseDouble(mtestFtoC.getText().toString());
                    C = (F-32)*1.8;
                    mtestFtoC.setText("");
                    mtestCtoF.setText(Double.toString(C));
                }

                // km and mile
                double km = 0.0, mile = 0.0;
                if(mKmtoMile.getText().length() != 0) {
                    km = Double.parseDouble(mKmtoMile.getText().toString());
                    mile = 1.61*km;
                    mKmtoMile.setText("");
                    mMiletoKm.setText(Double.toString(mile));
                }
                else if(mMiletoKm.getText().length() != 0) {
                    mile = Double.parseDouble(mMiletoKm.getText().toString());
                    km = mile/1.61;
                    mMiletoKm.setText("");
                    mKmtoMile.setText(Double.toString(km));
                }

                // kg and lb
                double kg = 0.0, lb = 0.0;
                if(mKgtoLb.getText().length() != 0) {
                    kg = Double.parseDouble(mKgtoLb.getText().toString());
                    lb = 2.2*kg;
                    mKgtoLb.setText("");
                    mLbtoKg.setText(Double.toString(lb));
                }
                else if(mLbtoKg.getText().length() != 0) {
                    lb = Double.parseDouble(mLbtoKg.getText().toString());
                    kg = lb*0.45;
                    mLbtoKg.setText("");
                    mKgtoLb.setText(Double.toString(kg));
                }

                // L and Gal
                double L = 0.0, Gal = 0.0;
                if(mLtoGal.getText().length() != 0) {
                    L = Double.parseDouble(mLtoGal.getText().toString());
                    Gal = L*0.3;
                    mLtoGal.setText("");
                    mGaltoL.setText(Double.toString(Gal));
                }
                else if(mGaltoL.getText().length() != 0) {
                    Gal = Double.parseDouble(mGaltoL.getText().toString());
                    L = Gal*3.8;
                    mGaltoL.setText("");
                    mLtoGal.setText(Double.toString(L));
                }

            }

        });

        mCtoF = findViewById(R.id.CtoF);
        mFtoC = findViewById(R.id.FtoC);
        mKmValue = findViewById(R.id.kmValue);
        mMileValue = findViewById(R.id.mileValue);
        mKgValue = findViewById(R.id.KgValue);
        mLbValue = findViewById(R.id.LbValue);
        mLitreValue = findViewById(R.id.litreValue);
        mGallonValue = findViewById(R.id.gallonValue);

        mtestCtoF = findViewById(R.id.testCtoF);
        mtestFtoC = findViewById(R.id.testFtoC);
        mKmtoMile = findViewById(R.id.KmtoMile);
        mMiletoKm = findViewById(R.id.MiletoKm);
        mKgtoLb = findViewById(R.id.KgtoLb);
        mLbtoKg = findViewById(R.id.LbtoKg);
        mLtoGal = findViewById(R.id.LtoGal);
        mGaltoL = findViewById(R.id.GaltoL);

        mtestCtoF.addTextChangedListener(CWatcher);
        mtestFtoC.addTextChangedListener(FWatcher);
        mKmtoMile.addTextChangedListener(KmWatcher);
        mMiletoKm.addTextChangedListener(MileWatcher);
        mKgtoLb.addTextChangedListener(KgWatcher);
        mLbtoKg.addTextChangedListener(LbWatcher);
        mLtoGal.addTextChangedListener(LWatcher);
        mGaltoL.addTextChangedListener(GalWatcher);
    }

    // C to F
    private final TextWatcher CWatcher = new TextWatcher() {
        @Override
       public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
       public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mtestCtoF.getText() + "C" + dt.toLocaleString());


        }
    };

    // F to C
    private final TextWatcher FWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
       public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mtestFtoC.getText() + "F" + dt.toLocaleString());

        }
    };

    //km to mile
    private final TextWatcher KmWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mKmtoMile.getText() + "km" + dt.toLocaleString());

        }
    };

    //mile to km
    private final TextWatcher MileWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mMiletoKm.getText() + "mile" + dt.toLocaleString());

        }
    };

    //kg to lb
    private final TextWatcher KgWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mKgtoLb.getText() + "kg" + dt.toLocaleString());

        }
    };

    //lb to kg
    private final TextWatcher LbWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mLbtoKg.getText() + "lb" + dt.toLocaleString());

        }
    };

    // L to Gal
    private final TextWatcher LWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mLtoGal.getText() + "L" + dt.toLocaleString());
        }
    };

    // Gal to L
    private final TextWatcher GalWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Date dt = new Date();
            Log.i("value",mGaltoL.getText() + "gal" + dt.toLocaleString());
        }
    };
};
