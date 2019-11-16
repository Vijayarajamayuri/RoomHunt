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
    Button forgot;

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
          forgot=findViewById(R.id.button5);

                //  Intent intent = new Intent(owner.this, Forg.class);
                // startActivity(intent);
                //intent creations
            }
        });
    }



    private void validate(String userName,String Password){
        if((userName.equals("Admin"))&&(Password.equals("123456"))) {
            Intent i = new Intent(owner.this,OwnerLogin.class);
            startActivity(i);
        }
        else{
            Counter--;
            Info.setText("Wrong Password!!-No of attemps remaining:"+String.valueOf(Counter));
            if(Counter==0){
                Click.setEnabled(false);
            }
        }
    }
    private void addListenerOnButton5() {
        final Context context = this;
        Button pr = findViewById(R.id.button11);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(context, PrivateRoom.class);
                startActivity(i);
            }
        });
    }
}

