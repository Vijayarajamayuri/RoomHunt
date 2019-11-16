package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Blocks extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocks);
        addListenerOnApt1();
    }


    private void addListenerOnApt1() {

        final Context context = this;
        Button apt1 = findViewById(R.id.apt1);

        apt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intnt = new Intent(context, Apt1.class);
                startActivity(intnt);
            }
        });
    }
}







