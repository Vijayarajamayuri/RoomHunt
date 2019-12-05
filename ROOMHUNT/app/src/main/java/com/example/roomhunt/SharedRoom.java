package com.example.roomhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SharedRoom extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String specs ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_room);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();

    }

    private void addListenerOnButton1() {
        final Context cont = this;
        Button single = findViewById(R.id.single);
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, Object> docData = new HashMap<>();
                docData.put("Sharedtype", "shared");
                docData.put("roomtype", "private");
                docData.put("specifications", "smoker");
                docData.put("specifications", "vegitarian");
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
                Intent i = new Intent(cont, Feedback.class);
                startActivity(i);
            }
        });
    }
    public void addListenerOnButton2(){
        final Context context1 = this;
        Button DoubleRoom = findViewById(R.id.DoubleRoom);
        DoubleRoom.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View view) {
                    Map<String, Object> docData = new HashMap<>();
                    docData.put("Sharedtype", "shared");
                    docData.put("roomtype", "private");
                    docData.put("specifications", "smoker");
                    docData.put("specifications", "vegitarian");
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
                Intent i = new Intent(context1, Feedback.class);
                startActivity(i);

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








