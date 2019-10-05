package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OwnerLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_login2);
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
    }

    private void addListenerOnButton2() {
        final Context context = this;
        Button block = findViewById(R.id.button20);
        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(context, Blocks.class);
                startActivity(in);
            }
        });
    }

    public void addListenerOnButton3() {
        final Context context = this;
        Button blockB = findViewById(R.id.button21);
        blockB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, BlockB.class);
                startActivity(i);
            }
        });
    }

    public void addListenerOnButton4() {
        final Context context = this;
        Button blockB = findViewById(R.id.button22);
        blockB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context, BlockC.class);
                startActivity( intent);
            }
        });
    }
}

