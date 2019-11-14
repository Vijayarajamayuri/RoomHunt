package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Apt1 extends AppCompatActivity {

private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apt1);
        listView=findViewById(R.id.listviewid);
    }
}
