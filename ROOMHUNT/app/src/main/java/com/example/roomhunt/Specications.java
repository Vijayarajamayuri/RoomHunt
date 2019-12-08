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

public class Specications extends AppCompatActivity {
    int smoker = 0;
    int ocd = 0;
    int vegetarian = 0;
    String specs ="";
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specications);


    }
    public void onClick2(View v) {
        final Context context = this;

        RadioButton Smoker=findViewById(R.id.radioButton2);
        RadioButton  smokerYes=findViewById(R.id.smokerYes);

        RadioButton  extreme=findViewById(R.id.radioButton5);
        RadioButton  moderate=findViewById(R.id.radioButton6);
        RadioButton  veg=findViewById(R.id.radioButton7);
        RadioButton  nonveg=findViewById(R.id.radioButton8);
        if(smokerYes.isChecked()) {
            smoker =1;
            specs += "SMOKER ";
        }
        if(Smoker.isChecked()) smoker =0;
        if(extreme.isChecked()){
            ocd =1;
            specs += "OCD ";
        }
        if(moderate.isChecked()) ocd =0;
        if(veg.isChecked()){
            vegetarian =1;
            specs +="VEG ";
        }
        if(nonveg.isChecked()) vegetarian =0;

        Map<String, Object> docData = new HashMap<>();
        docData.put("Sharedtype", "shared");


        docData.put("specifications", specs);
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
                Intent intent = new Intent(context, Feedback.class);
                startActivity(intent);


    }
}
