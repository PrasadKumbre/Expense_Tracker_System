package com.example.expensetrackersystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnSignUp, btnNavigateToLogin;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        db = new DatabaseHelper(this);

        etUsername = findViewById(R.id.etUsernameSignUp);
        etPassword = findViewById(R.id.etPasswordSignUp);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnNavigateToLogin = findViewById(R.id.btnNavigateToLogin);

        btnSignUp.setOnClickListener(v -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            if (db.registerUser(username, password)) {
                Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show();
                finish(); // Go back to LoginActivity
            } else {
                Toast.makeText(this, "Sign Up Failed", Toast.LENGTH_SHORT).show();
            }
        });

        btnNavigateToLogin.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
    }
}
