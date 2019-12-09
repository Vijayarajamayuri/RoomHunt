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
        addListenerOnButton0();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton5();
    }

    private void addListenerOnButton0() {
        final Context context = this;
        Button block = findViewById(R.id.button19);
        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Blocks.class);
                startActivity(i);

            }
        });
    }

    public void addListenerOnButton1() {
        final Context context = this;
        Button blockB = findViewById(R.id.button20);
        blockB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, BlockB.class);
                startActivity(i);
            }
        });
    }

    public void addListenerOnButton2() {
        final Context context = this;
        Button blockB = findViewById(R.id.button21);
        blockB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BlockC.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton3() {
        final Context context = this;
        Button bd = findViewById(R.id.button22);
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Blockd.class);
                startActivity(intent);
            }
        });
    }


    public void addListenerOnButton5() {
        final Context context = this;
        Button buffer = findViewById(R.id.button27);
        buffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context, Blockf.class);
                startActivity( intent);
            }
        });
    }
}

