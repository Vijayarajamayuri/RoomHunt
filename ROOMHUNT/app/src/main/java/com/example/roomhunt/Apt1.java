package com.example.roomhunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class Apt1 extends AppCompatActivity {

    private ListView listView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apt1);
        final TextView nameTV =  findViewById(R.id.nameTV);
        final TextView emailTV=findViewById(R.id.emailTV);
        final TextView Gender=findViewById(R.id.Gender);
        final TextView Phone_number=findViewById(R.id.Phone_number);
        final TextView TypeofroomShared=findViewById(R.id.TypeofroomShared);

        DocumentReference docRef = db.collection("Tenant").document("Apt1");
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        nameTV.setText(document.getString("Tenant Name"));
                        emailTV.setText(document.getString("Email"));
                        Gender.setText(document.getString("Gender"));
                        Phone_number.setText(document.getString("Phone number"));
                        TypeofroomShared.setText(document.getString("Type of room shared"));
                        Toast.makeText(Apt1.this,document.getString("Email") +" " +document.getString("Specifications"),Toast.LENGTH_SHORT).show();
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
