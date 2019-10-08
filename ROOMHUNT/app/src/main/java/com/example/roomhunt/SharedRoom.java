package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SharedRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_room);
        addListenerOnButton1();
        addListenerOnButton2();
    }
    private void addListenerOnButton1() {
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
    private void addListenerOnButton2() {
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
