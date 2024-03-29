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

public class PrivateRoom extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String specs ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_room);
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
    }
    private void addListenerOnButton2() {
        final Context context = this;
        Button other = findViewById(R.id.button16);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, Object> docData = new HashMap<>();
                docData.put("roomtype", "private");
                docData.put("share","single");


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
        Button other = findViewById(R.id.button15);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Map<String, Object> docData = new HashMap<>();
                docData.put("roomtype", "private");
                docData.put("share","double");


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
                Intent i = new Intent(context, Feedback.class);
                startActivity(i);
            }
        });
    }
    private void addListenerOnButton4() {
        final Context context = this;
        Button other = findViewById(R.id.otherbutton);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, Specications.class);
                startActivity(intent);

            }
        });
    }

}
