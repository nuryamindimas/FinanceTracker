package com.dimas.financetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnggaranku;
    private ArrayList<Anggaranku> list =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnggaranku=findViewById(R.id.rv_anggaranku);
        rvAnggaranku.setHasFixedSize(false);

        list.addAll(AnggarankuData.getListData());

        showRecycler();

    }

    private void showRecycler() {
        rvAnggaranku.setLayoutManager(new LinearLayoutManager(this));
        AnggarankuAdapter anggarankuAdapter = new AnggarankuAdapter(this);
        anggarankuAdapter.setListAnggaran(list);
        rvAnggaranku.setAdapter(anggarankuAdapter);
        anggarankuAdapter.notifyDataSetChanged();
    }
}