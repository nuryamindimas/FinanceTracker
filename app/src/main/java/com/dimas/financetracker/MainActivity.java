package com.dimas.financetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
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

        Button btnTambah = findViewById(R.id.btn_tambah);
        btnTambah.setOnClickListener(this);

    }

    private void showRecycler() {
        rvAnggaranku.setLayoutManager(new LinearLayoutManager(this));
        AnggarankuAdapter anggarankuAdapter = new AnggarankuAdapter(this);
        anggarankuAdapter.setListAnggaran(list);
        rvAnggaranku.setAdapter(anggarankuAdapter);
        anggarankuAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tambah:
                Intent moveIntent = new Intent(MainActivity.this, TambahTransaksi.class);
                startActivityForResult(moveIntent,12);
                break;
        }
    }
}