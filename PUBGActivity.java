package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MakananActivity extends AppCompatActivity {

    ListView listView;
    Spinner combo;

    public String Menu_Makanan [] = {" ","263UC = 53.000", "525UC = 95.000", "788UC = 140.000", "1.050UC = 185.000", "1.638UC = 280.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        listView = (ListView) findViewById(R.id.listmakanan);
        combo = (Spinner) findViewById(R.id.combomakanan);

        ArrayAdapter adapter = new ArrayAdapter(MakananActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}