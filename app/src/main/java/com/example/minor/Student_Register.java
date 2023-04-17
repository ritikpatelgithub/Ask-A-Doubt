package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Student_Register extends AppCompatActivity {
    TextView txt1;
    EditText edtName,edt2,edt3,edt4,edt5,edt6;
    Button Registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);
        txt1=findViewById(R.id.txt1);
        edtName=findViewById(R.id.edtName);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        edt4=findViewById(R.id.edt4);
        edt5=findViewById(R.id.edt5);
        edt6=findViewById(R.id.edt6);
        Registerbtn=findViewById(R.id.Registerbtn);

        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=edtName.getText().toString().trim();
                String Mail=edt2.getText().toString().trim();
               String  Password =edt3.getText().toString().trim();
               String CPassword=edt4.getText().toString().trim();
               String RegdNumber =edt5.getText().toString().trim();
               String Branch =edt6.getText().toString().trim();

               if (TextUtils.isEmpty(Name)){
                   edtName.setError("Name is Required");
               }
               if (TextUtils.isEmpty(Mail)){
                   edt2.setError("Mail Is Required");
               }
               if (TextUtils.isEmpty(Password)){
                   edt3.setError("Password is Required");
               }
               if (TextUtils.isEmpty(CPassword)){
                   edt4.setError("Confirm Pasword is Required");
               }
               if (TextUtils.isEmpty(RegdNumber)){
                   edt5.setError("Regd Number is Required");
               }
               if (TextUtils.isEmpty(Branch)){
                   edt6.setError("Branch name is Required");
               }
            }
        });





    }
}