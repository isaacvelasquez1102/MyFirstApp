package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fields> fieldList;
    RecyclerView recyclerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "HOLA MUNDO", Toast.LENGTH_LONG).show();

        fieldList= new ArrayList<>();
        recyclerList = findViewById(R.id.rvId);
        recyclerList.setLayoutManager(new LinearLayoutManager(this));

        fillFields();

        FieldsAdapter adapter = new FieldsAdapter(fieldList);
        recyclerList.setAdapter(adapter);
    }

    public void fillFields(){

        fieldList.add(new Fields("Jose", "Tio", R.drawable.ic_launcher_background));
        fieldList.add(new Fields("Isaac", "Yo", R.drawable.ic_launcher_background));
        fieldList.add(new Fields("Juan", "Primo", R.drawable.ic_launcher_background));
        fieldList.add(new Fields("Eugenio", "Primo", R.drawable.ic_launcher_background));
        fieldList.add(new Fields("Katy", "Tia", R.drawable.ic_launcher_background));
        fieldList.add(new Fields("Lucy", "Tia", R.drawable.ic_launcher_background));
    }
}