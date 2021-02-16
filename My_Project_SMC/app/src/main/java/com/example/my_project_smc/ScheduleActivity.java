package com.example.my_project_smc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class ScheduleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);
        Button save_Btn=(Button)findViewById(R.id.save_Btn);
        final EditText sch_Edt=(EditText)findViewById(R.id.sch_Edt);

        Intent inIntent=getIntent();
        final String my_schedule=inIntent.getStringExtra("Num1");
        sch_Edt.setText(my_schedule);

        save_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(),Calendar_Activity.class);
                outIntent.putExtra("Mine",sch_Edt.getText().toString());
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });


    }
}
