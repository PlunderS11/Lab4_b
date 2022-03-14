package com.example.tuan4b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView;
        ArrayList<HangDienTu> arrayList;
        AdapterHangDIenTu adapter;

        gridView = findViewById(R.id.gridCustom);

        arrayList = new ArrayList<>();
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.giacchuyen,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS4",4,"69000","(15)",R.drawable.daynguon,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.dauchuyendoipsps,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.dauchuyendoi,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.carbusbtops,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.daucam,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.giacchuyen,"(20)"));
        arrayList.add(new HangDienTu("Cáp chuyển từ cổng USB sang PS2",4,"69000","(15)",R.drawable.giacchuyen,"(20)"));

        adapter = new AdapterHangDIenTu(MainActivity.this,R.layout.layout_hangdientu,arrayList);
        gridView.setAdapter(adapter);


    }
}