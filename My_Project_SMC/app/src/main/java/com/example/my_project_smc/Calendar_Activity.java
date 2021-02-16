package com.example.my_project_smc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Calendar_Activity extends Activity {
    int my_year,my_month,my_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        CalendarView cal_V=(CalendarView)findViewById(R.id.cal_V);
        final EditText sch_Edt=(EditText)findViewById(R.id.sch_Edt);
        Button back_btn=(Button)findViewById(R.id.back_Btn);
        EditText sch1= (EditText)findViewById(R.id.my_Sch);
        EditText sch2= (EditText)findViewById(R.id.my_Sch2);
        EditText sch3= (EditText)findViewById(R.id.my_Sch3);
        EditText sch4= (EditText)findViewById(R.id.my_Sch4);
        EditText sch5= (EditText)findViewById(R.id.my_Sch5);

        Intent myIntent= getIntent();

        sch1.setText(myIntent.getStringExtra("Sch1"));
        sch2.setText(myIntent.getStringExtra("Sch2"));
        sch3.setText(myIntent.getStringExtra("Sch3"));
        sch4.setText(myIntent.getStringExtra("Sch4"));
        sch5.setText(myIntent.getStringExtra("Sch5"));


        cal_V.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                my_year=i;
                my_month=i1+1;
                my_day=i2;
                Intent sch_intent= new Intent(getApplicationContext(),ScheduleActivity.class);
                sch_intent.putExtra("Num1",my_year+"년 "+my_month+"월 "+my_day+"일의 일정:");
                startActivityForResult(sch_intent,0);

            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText my_sch=(EditText)findViewById(R.id.my_Sch);
                EditText my_sch2=(EditText)findViewById(R.id.my_Sch2);
                EditText my_sch3=(EditText)findViewById(R.id.my_Sch3);
                EditText my_sch4=(EditText)findViewById(R.id.my_Sch4);
                EditText my_sch5=(EditText)findViewById(R.id.my_Sch5);
                Intent backIntent=new Intent(getApplicationContext(),MainActivity.class);
                backIntent.putExtra("Save_Sch1",my_sch.getText().toString());
                backIntent.putExtra("Save_Sch2",my_sch2.getText().toString());
                backIntent.putExtra("Save_Sch3",my_sch3.getText().toString());
                backIntent.putExtra("Save_Sch4",my_sch4.getText().toString());
                backIntent.putExtra("Save_Sch5",my_sch5.getText().toString());
                setResult(RESULT_OK,backIntent);
                finish();
            }
        });



    }

   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){

            String mine=data.getStringExtra("Mine");
            Toast.makeText(getApplicationContext(),"일정 추가 완료",Toast.LENGTH_LONG).show();
            EditText my_sch=(EditText)findViewById(R.id.my_Sch);
            EditText my_sch2=(EditText)findViewById(R.id.my_Sch2);
            EditText my_sch3=(EditText)findViewById(R.id.my_Sch3);
            EditText my_sch4=(EditText)findViewById(R.id.my_Sch4);
            EditText my_sch5=(EditText)findViewById(R.id.my_Sch5);
            if(TextUtils.isEmpty(my_sch.getText().toString())) {
                my_sch.setText(mine);
            }
            else if(TextUtils.isEmpty(my_sch2.getText().toString())){
                my_sch2.setText(mine);
            }
            else if(TextUtils.isEmpty(my_sch3.getText().toString())){
                my_sch3.setText(mine);
            }
            else if(TextUtils.isEmpty(my_sch4.getText().toString())){
                my_sch4.setText(mine);
            }
            else if(TextUtils.isEmpty(my_sch5.getText().toString())){
                my_sch5.setText(mine);
            }
            else{
                Toast.makeText(getApplicationContext(),"일정이 가득찼습니다.",Toast.LENGTH_LONG).show();
            }
        }
    }
}
