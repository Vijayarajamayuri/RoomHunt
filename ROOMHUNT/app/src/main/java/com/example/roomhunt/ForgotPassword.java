package com.example.roomhunt;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    private EditText editEmail;
    private Button btnResetPass;
    private Button buttonBack;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        editEmail = (EditText) findViewById(R.id.edt_reset_email);
        btnResetPass = (Button) findViewById(R.id.btn_reset_password);
        buttonBack = (Button) findViewById(R.id.btn_back);
        mAuth = FirebaseAuth.getInstance();
    }
}








