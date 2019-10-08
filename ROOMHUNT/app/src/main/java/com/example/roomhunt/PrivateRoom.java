package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrivateRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_room);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
    }
    private void addListenerOnButton1() {
        final Context context = this;
        Button other = findViewById(R.id.button16);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Specications.class);
                startActivity(intent);
            }
        });
    }
    private void addListenerOnButton2() {
        final Context context = this;
        Button other = findViewById(R.id.button14);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);
            }
        });
    }
    private void addListenerOnButton3() {
        final Context context = this;
        Button other = findViewById(R.id.button15);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);
            }
        });
    }

}
