package com.example.roomhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Apt2 extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apt2);
        final TextView nameTV1 = findViewById(R.id.nameTV);
        final TextView emailTV1 = findViewById(R.id.emailTV);
        final TextView Gender1 = findViewById(R.id.Gender);
        final TextView Phone_number1 = findViewById(R.id.Phone_number);
        final TextView TypeofroomShared1 = findViewById(R.id.TypeofroomShared);

        DocumentReference docRef1 = db.collection("Tenant").document("Apt2");
        docRef1.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        nameTV1.setText(document.getString("Tenant Name"));
                        emailTV1.setText(document.getString("Email"));
                        Gender1.setText(document.getString("Gender"));
                        Phone_number1.setText(document.getString("Phone number"));
                        TypeofroomShared1.setText(document.getString("Type of room shared"));
                        Toast.makeText(Apt2.this, document.getString("Email") + " " + document.getString("Specifications"), Toast.LENGTH_SHORT).show();
                        Log.d("", "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d("", "No such document");
                    }
                } else {
                    Log.d("", "get failed with ", task.getException());
                }
            }
        });
    }





}



