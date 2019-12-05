package com.example.roomhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Blocks extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocks);


        DocumentReference docRef = db.collection("Tenant").document("Apt1");


        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        if (document.getBoolean("Availability") == true) {
                            Button apt1 = findViewById(R.id.apt1);
                            apt1.setBackgroundColor(Color.parseColor("#00ff00"));

                        }


                        Toast.makeText(Blocks.this, document.getString("Email") + " " + document.getString("Specifications"), Toast.LENGTH_SHORT).show();
                        Log.d("", "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d("", "No such document");
                    }
                } else {
                    Log.d("", "get failed with ", task.getException());
                }
            }
        });
        DocumentReference docRef3 = db.collection("Tenant").document("Apt3");
        DocumentReference docRef5 = db.collection("Tenant").document("Apt2");

        docRef3.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        if (document.getBoolean("Availability") == true) {
                            Button Apt3 = findViewById(R.id.Apt3);
                            Apt3.setBackgroundColor(Color.parseColor("#00ff00"));
                        } else {
                            Button Apt3 = findViewById(R.id.Apt3);
                            Apt3.setBackgroundColor(Color.parseColor("#ff0000"));
                        }
                        Toast.makeText(Blocks.this, document.getString("Email") + " " + document.getString("Specifications"), Toast.LENGTH_SHORT).show();
                        Log.d("", "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d("", "No such document");
                    }
                } else {
                    Log.d("", "get failed with ", task.getException());
                }
            }
        });
        docRef5.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        if (document.getBoolean("Availability") == true) {
                            Button Apt3 = findViewById(R.id.Apt3);
                            Apt3.setBackgroundColor(Color.parseColor("#00ff00"));
                        } else {
                            Button Apt3 = findViewById(R.id.Apt3);
                            Apt3.setBackgroundColor(Color.parseColor("#ff0000"));
                        }

                    } else {
                        Log.d("", "No such document");
                    }
                } else {
                    Log.d("", "get failed with ", task.getException());
                }
            }
        });

        addListenerOnApt1();
        addListenerOnApt2();

    }
//dialog box for apt3 filled one

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

        Button Apt3 = findViewById(R.id.Apt3);
        Apt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Blocks.this);

                builder.setCancelable(true);
                builder.setTitle("Sorry!This Apartment is currently filled");
                builder.setMessage("Try to see the other availabilities");

                builder.setNegativeButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.show();
            }
        });
    }

    private void addListenerOnApt2() {

        final Context context = this;
        Button apt2 = findViewById(R.id.button2);

        apt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intnt = new Intent(context, Apt2.class);
                startActivity(intnt);
            }
        });

    }
}







