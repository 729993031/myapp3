package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class MyActivity extends Activity {
    GridLayout gridLayout;
    String[] chars=new String[]{
            "7","8","9","÷",
            "4","5","6","×",
            "1","2","3","－",
            ".","0","=","+"
    };
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        gridLayout=(GridLayout)findViewById(R.id.root);
        for(int i=0;i<chars.length;i++) {
            Button bn = new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            bn.setPadding(5, 35, 5, 35);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(
                    rowSpec, columSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn, params);
        }
    }
}
