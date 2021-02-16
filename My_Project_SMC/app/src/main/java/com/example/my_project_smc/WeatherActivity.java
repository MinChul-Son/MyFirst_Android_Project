package com.example.my_project_smc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_search);

        Button weather_Back_Btn=(Button)findViewById(R.id.weather_Back_Btn);
        Button search_Btn=(Button) findViewById(R.id.search_Btn);
        final EditText edt_weather=(EditText)findViewById(R.id.weather_Edt);

        search_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weather_intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query="+edt_weather.getText().toString()+"날씨"));
                startActivity(weather_intent2);

            }
        });
        weather_Back_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
