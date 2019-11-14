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
    FirebaseFirestore db = FirebaseFirestore.getInstance();
   Button loadData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocks);
        loadData=findViewById(R.id.button);
       loadData.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Blocks.this,Apt1.class);
               startActivity(intent);
           }
       });
    }

    private void addListenerOnApt1() {


            }
        }







