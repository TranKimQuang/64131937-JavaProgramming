package com.example.listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> PoemList;
    ListView lvPoem;
    ArrayAdapter<String> adapterPoem;
    Button btnAddPoem;
    EditText editTextPoemName;
    @SuppressLint("WrongViewCast")
    void getControl(){
        lvPoem = findViewById(R.id.LvPoem);
        btnAddPoem = findViewById(R.id.btnAdd);
        editTextPoemName = findViewById(R.id.editPoem);

    }
    ArrayList<String> getData(){
        ArrayList<String> listPoemName = new ArrayList<String>();
        listPoemName.add("Bánh trôi nước");
        listPoemName.add("Đất nước");
        listPoemName.add("Tây tiến");
        listPoemName.add("Việt bắc");
        return listPoemName;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControl();
        PoemList = getData();

        adapterPoem =new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,PoemList);

        lvPoem.setAdapter(adapterPoem);

        adapterPoem.notifyDataSetChanged();

        lvPoem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                XuLiNhanVaoViTriThu(position);
            }
        });
        btnAddPoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenBai = editTextPoemName.getText().toString();
                PoemList.add(PoemName);
                adapterPoem.notifyDataSetChanged();
            }
        });
    }
    void XuLiNhanVaoViTriThu(int pos) {
        String item = PoemList.get(pos);
        Toast.makeText(getApplicationContext(),item,Toast.LENGTH_SHORT).show();
    }

}