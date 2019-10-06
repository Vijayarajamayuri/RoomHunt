package com.example.roomhunt;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();


    }

    private void addListenerOnButton() {
        final Context context = this;
        Button owner = findViewById(R.id.button3);
        owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, owner.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton1() {
        final Context context = this;
        Button signup = findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SignUp.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton2() {
        final Context context = this;
        Button signup = findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, user_login.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerOnButton3() {
        final Context context = this;
        Button fp = findViewById(R.id.button6);
        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
}
