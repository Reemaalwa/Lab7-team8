package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText userName;
    EditText password;
    TextView result;

    public LoginActivity() {}

    public LoginActivity(Context context) {}

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        userName = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        result = findViewById(R.id.result);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String validationResult = validate(userName.getText().toString(), password.getText().toString());
                result.setText(validationResult);
                result.setVisibility(View.VISIBLE); // Make the result TextView visible
            }
        });
    }

    public String validate(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            return "Login was successful";
        } else {
            return "Invalid login!";
        }
    }
}
