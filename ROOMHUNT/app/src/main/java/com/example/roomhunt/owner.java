package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class owner extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Click;
    private int Counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);
        Name=(EditText)findViewById(R.id.editText3);
        Password=(EditText)findViewById(R.id.editText4);
        Info=(TextView)findViewById(R.id.textView14);

        Button ownerlogin = findViewById(R.id.button4);
        Info.setText("Enter the login credentials");

        ownerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());

                //  Intent intent = new Intent(owner.this, OwnerLogin.class);
                // startActivity(intent);
                //intent creations
            }
        });
    }



    private void validate(String userName,String Password){
        if((userName.equals("Admin"))&&(Password.equals("1234"))) {
            Intent intent = new Intent(owner.this,OwnerLogin.class);
            startActivity(intent);
        }
        else{
            Counter--;
            Info.setText("Wrong Password!!-No of attemps remaining:"+String.valueOf(Counter));
            if(Counter==0){
                Click.setEnabled(false);
            }
        }
    }
}

