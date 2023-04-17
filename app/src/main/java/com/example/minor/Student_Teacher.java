package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Student_Teacher extends AppCompatActivity {

    TextView txt1;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_teacher);
        txt1=findViewById(R.id.txt1);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        Intent intent =new Intent(Student_Teacher.this,Student_Register.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        Intent intent2=new Intent(Student_Teacher.this,Teacher_Register.class);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}