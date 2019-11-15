package com.example.roomhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SharedRoom extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_room);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
    }
    private void addListenerOnButton1() {
        final Context context = this;
        Button Single= findViewById(R.id.single);
        Single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                    Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);
            }
        });
    }
    private void addListenerOnButton2() {
        final Context context = this;
        Button DoubleRoom = findViewById(R.id.DoubleRoom);
        DoubleRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);
            }
        });
    }
    private void addListenerOnButton3() {
        final Context context = this;
        Button other = findViewById(R.id.Other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override

                    public void onClick(View view) {


                        Intent intent = new Intent(context, Specications.class);
                        startActivity(intent);

            }
        });
    }
}
