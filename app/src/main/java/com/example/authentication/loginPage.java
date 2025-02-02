package com.example.authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginPage extends AppCompatActivity {
    EditText email,password;
    Button login;
    TextView forgotpassword,signup;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        firebaseAuth= FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.btn_login);
        forgotpassword=findViewById(R.id.txt_forgot);
        signup=findViewById(R.id.txt_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Password = password.getText().toString().trim();

                if (Email.isEmpty()){
                    Toast.makeText(loginPage.this,"Please Enter the Email",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(Password.isEmpty()){
                    Toast.makeText(loginPage.this,"Please Enter Password",Toast.LENGTH_SHORT).show();
                    return;
                }
                firebaseAuth.signInWithEmailAndPassword(Email,Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    if(firebaseAuth.getCurrentUser().isEmailVerified()){
                                        Toast.makeText(loginPage.this, "Signup is Completed", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                    else {
                                        Toast.makeText(loginPage.this,"Please verify your email",Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Toast.makeText(loginPage.this, "Signup Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupintent=new Intent(loginPage.this,signUp.class);
                startActivity(signupintent);
            }
        });

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotpasswordIntent = new Intent(loginPage.this,forgotPassword.class);
                startActivity(forgotpasswordIntent);
            }
        });
    }
}