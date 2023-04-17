package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Teacher_Register extends AppCompatActivity {
    TextView txt1;
    EditText edtName,edtMail,edtP,edtConfirm,edtB,edtDomains;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_register);

        txt1=findViewById(R.id.txt1);
        edtName=findViewById(R.id.edtName);
        edtMail=findViewById(R.id.edtMail);
        edtP=findViewById(R.id.edtP);
        edtConfirm=findViewById(R.id.edtConfirm);
        edtB=findViewById(R.id.edtB);
        edtDomains=findViewById(R.id.edtDomains);
        btnRegister=findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String Name =edtName.getText().toString().trim();
                 String Mail=edtMail.getText().toString().trim();
                 String Pass= edtP.getText().toString().trim();
                 String CPass=edtConfirm.getText().toString().trim();
                 String B=edtB.getText().toString().trim();
                 String Domains=edtDomains.toString().trim();

                 if (TextUtils.isEmpty(Name)){
                     edtName.setError("Name is Required");
                 }
                 if (TextUtils.isEmpty(Mail)){
                     edtMail.setError("E-mail is Required");
                 }
                 if (TextUtils.isEmpty(Pass)){
                     edtP.setError("Password is Required");
                 }
                 if (TextUtils.isEmpty(CPass)){
                     edtConfirm.setError("Confiem Password is Required");
                 }
                 if (TextUtils.isEmpty(B)){
                     edtB.setError("Branch Name is Required");
                 }
                 if (TextUtils.isEmpty(Domains)){
                     edtDomains.setError("Domain is Required");
                 }
            }
        });





    }
}