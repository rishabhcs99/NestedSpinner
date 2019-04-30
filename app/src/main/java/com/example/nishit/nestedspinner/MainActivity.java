package com.example.nishit.nestedspinner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=(Spinner) findViewById(R.id.spinner2);
        spinner2=(Spinner) findViewById(R.id.spinner3);
        //button=(Button)findViewById(R.id.button);



        String nums[]={"1","2","3","4","5","6","7","8","9"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,nums);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String itemSelected =String.valueOf(spinner1.getSelectedItem());
                String muls[]=new String[9];
                for(int x=0;x<9;x++)
                {
                    muls[x]= String.valueOf(((x+1)*(Integer.parseInt(itemSelected))));
                }
                ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,muls);
                spinner2.setAdapter(adapter2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
/*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemSelected =String.valueOf(spinner1.getSelectedItem());
                String muls[]=new String[9];
                for(int x=0;x<9;x++)
                {
                    muls[x]= String.valueOf(((x+1)*(Integer.parseInt(itemSelected))));
                }
                ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,muls);
                spinner2.setAdapter(adapter2);
            }
        });

        */

    }
}
