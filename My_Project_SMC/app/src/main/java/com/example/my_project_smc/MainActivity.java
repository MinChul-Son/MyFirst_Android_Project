package com.example.my_project_smc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String save_sch1="",save_sch2="",save_sch3="",save_sch4="",save_sch5="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("오늘의 날씨");

        Button search_weather=(Button)findViewById(R.id.weather_Btn);
        Button cal_Btn=(Button)findViewById(R.id.cal_Btn);
        search_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weather_intent=new Intent(getApplicationContext(),WeatherActivity.class);
                startActivity(weather_intent);
            }
        });
        cal_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText sch1= (EditText)findViewById(R.id.my_Sch);
                EditText sch2= (EditText)findViewById(R.id.my_Sch2);
                EditText sch3= (EditText)findViewById(R.id.my_Sch3);
                EditText sch4= (EditText)findViewById(R.id.my_Sch4);
                EditText sch5= (EditText)findViewById(R.id.my_Sch5);
                Intent cal_intent= new Intent(getApplicationContext(),Calendar_Activity.class);
                cal_intent.putExtra("Sch1",save_sch1);
                cal_intent.putExtra("Sch2",save_sch2);
                cal_intent.putExtra("Sch3",save_sch3);
                cal_intent.putExtra("Sch4",save_sch4);
                cal_intent.putExtra("Sch5",save_sch5);
                startActivityForResult(cal_intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK) {
            save_sch1 = data.getStringExtra("Save_Sch1");
            save_sch2 = data.getStringExtra("Save_Sch2");
            save_sch3 = data.getStringExtra("Save_Sch3");
            save_sch4 = data.getStringExtra("Save_Sch4");
            save_sch5 = data.getStringExtra("Save_Sch5");
        }
    }
}
