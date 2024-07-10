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

public class signUp extends AppCompatActivity {
    EditText email, password, confirmPassword;
    Button signup;
    TextView signin;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firebaseAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_password);
        confirmPassword = findViewById(R.id.txt_cpassword);
        signup = findViewById(R.id.btn_signup);
        signin = findViewById(R.id.txt_signin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Password = password.getText().toString().trim();
                String Cpassword = confirmPassword.getText().toString().trim();

                if (Email.isEmpty()) {
                    Toast.makeText(signUp.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (Password.isEmpty()) {
                    Toast.makeText(signUp.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (Password.length() <= 6) {
                    Toast.makeText(signUp.this, "Password must be at least 6 characters long", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!Cpassword.equals(Password)) {
                    Toast.makeText(signUp.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.createUserWithEmailAndPassword(Email, Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(signUp.this, "Signup is Completed", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(signUp.this, "Signup Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}
