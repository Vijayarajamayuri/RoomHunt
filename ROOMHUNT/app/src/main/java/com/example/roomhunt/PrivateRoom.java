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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrivateRoom extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                Map<String, Object> docData = new HashMap<>();
                docData.put("roomtype", "OTHER");
                docData.put("specifications","smoker");

                db.collection("sample").document("one")
                        .set(docData)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d("TEST", "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w("TEST", "Error writing document", e);
                                return;
                            }
                        });

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

                Map<String, Object> docData = new HashMap<>();
                docData.put("roomtype", "SINGLE");

                db.collection("sample").document("one")
                        .set(docData)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d("TEST", "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w("TEST", "Error writing document", e);
                                return;
                            }
                        });
                Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);
            }
        });
    }
    private void addListenerOnButton3() {
        final Context context = this;
        Button other = findViewById(R.id.button14);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Map<String, Object> docData = new HashMap<>();
                docData.put("roomtype", "DOUBLE");
                docData.put("specifications","smoker");

                db.collection("sample").document()
                        .set(docData)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d("TEST", "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w("TEST", "Error writing document", e);
                                return;
                            }
                        });
                Intent intent = new Intent(context, Specications.class);
                startActivity(intent);
            }
        });
    }

}
