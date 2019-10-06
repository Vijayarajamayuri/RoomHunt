package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class user_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        addListenerOnImageButton();


        addListenerOnButton();


    }
    private void addListenerOnImageButton() {
        final Context context = this;
        ImageButton img = findViewById(R.id.imageButton);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, image.class);
                startActivity(intent);
            }
        });
    }

    private void addListenerOnButton() {
        final Context context = this;
        Button owner = findViewById(R.id.button8);
        owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Availability.class);
                startActivity(intent);
            }
        });
    }
}
