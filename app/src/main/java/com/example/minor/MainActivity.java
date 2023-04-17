package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txtforgot;
    EditText edtmail,edtpassword;
    Button loginbtn,registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txtforgot=findViewById(R.id.txtforgot);
        edtmail=findViewById(R.id.edtmail);
        edtpassword=findViewById(R.id.edtpassword);
        loginbtn=findViewById(R.id.loginbtn);
        registerbtn=findViewById(R.id.registerbtn);
        Intent intent =new Intent(MainActivity.this,Student_Teacher.class);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Intent forgot=new Intent(MainActivity.this,Forgot_page.class);
        txtforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(forgot);
            }
        });


        Intent inten =new Intent(MainActivity.this,MainDashBoard.class);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inten);

            }
        });

     loginbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String Mail=edtmail.getText().toString().trim();
             String Password=edtpassword.getText().toString().trim();

             if (TextUtils.isEmpty(Mail)){
                 edtmail.setError("E-mail is Required");
             }
             if (TextUtils.isEmpty(Password)){
                 edtpassword.setError("Password is Required");
             }
//             if (Password.length()<6){
//                 edtpassword.setError("Password Should be more then 6 Number");
//             }

         }
     });

    }
}