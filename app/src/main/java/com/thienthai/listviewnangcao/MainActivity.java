package com.thienthai.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
//B5. kết nói giữa Adapter và listView
public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> arrayListTraiCay;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhSa();

        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay,arrayListTraiCay);
        lvTraiCay.setAdapter(adapter);
    }
    private void AnhSa(){
        lvTraiCay = (ListView) findViewById(R.id.lvTraiCay);
        arrayListTraiCay = new ArrayList<>();

        arrayListTraiCay.add(new TraiCay("Ổi", "Ổi Cao Lãnh", R.drawable.traicay1));
        arrayListTraiCay.add(new TraiCay("Bơ", "Ổi Cao Lãnh", R.drawable.traicay2));
        arrayListTraiCay.add(new TraiCay("Khế", "Ổi Cao Lãnh", R.drawable.traicay3));
        arrayListTraiCay.add(new TraiCay("Kiwi", "Ổi Cao Lãnh", R.drawable.traicay5));
        arrayListTraiCay.add(new TraiCay("khớm", "Ổi Cao Lãnh", R.drawable.traicay6));
        arrayListTraiCay.add(new TraiCay("Dừa", "Ổi Cao Lãnh", R.drawable.traicay7));
        arrayListTraiCay.add(new TraiCay("Nho mỹ", "Ổi Cao Lãnh", R.drawable.traicay8));
        arrayListTraiCay.add(new TraiCay("Ổi", "Ổi Cao Lãnh", R.drawable.traicay1));
        arrayListTraiCay.add(new TraiCay("Bơ", "Ổi Cao Lãnh", R.drawable.traicay2));
        arrayListTraiCay.add(new TraiCay("Khế", "Ổi Cao Lãnh", R.drawable.traicay3));
        arrayListTraiCay.add(new TraiCay("Kiwi", "Ổi Cao Lãnh", R.drawable.traicay5));
        arrayListTraiCay.add(new TraiCay("khớm", "Ổi Cao Lãnh", R.drawable.traicay6));
        arrayListTraiCay.add(new TraiCay("Dừa", "Ổi Cao Lãnh", R.drawable.traicay7));
        arrayListTraiCay.add(new TraiCay("Nho mỹ", "Ổi Cao Lãnh", R.drawable.traicay8));
        arrayListTraiCay.add(new TraiCay("Ổi", "Ổi Cao Lãnh", R.drawable.traicay1));
        arrayListTraiCay.add(new TraiCay("Bơ", "Ổi Cao Lãnh", R.drawable.traicay2));
        arrayListTraiCay.add(new TraiCay("Khế", "Ổi Cao Lãnh", R.drawable.traicay3));
        arrayListTraiCay.add(new TraiCay("Kiwi", "Ổi Cao Lãnh", R.drawable.traicay5));
        arrayListTraiCay.add(new TraiCay("khớm", "Ổi Cao Lãnh", R.drawable.traicay6));
        arrayListTraiCay.add(new TraiCay("Dừa", "Ổi Cao Lãnh", R.drawable.traicay7));
        arrayListTraiCay.add(new TraiCay("Nho mỹ", "Ổi Cao Lãnh", R.drawable.traicay8));
        arrayListTraiCay.add(new TraiCay("Ổi", "Ổi Cao Lãnh", R.drawable.traicay1));
        arrayListTraiCay.add(new TraiCay("Bơ", "Ổi Cao Lãnh", R.drawable.traicay2));
        arrayListTraiCay.add(new TraiCay("Khế", "Ổi Cao Lãnh", R.drawable.traicay3));
        arrayListTraiCay.add(new TraiCay("Kiwi", "Ổi Cao Lãnh", R.drawable.traicay5));
        arrayListTraiCay.add(new TraiCay("khớm", "Ổi Cao Lãnh", R.drawable.traicay6));
        arrayListTraiCay.add(new TraiCay("Dừa", "Ổi Cao Lãnh", R.drawable.traicay7));
        arrayListTraiCay.add(new TraiCay("Nho mỹ", "Ổi Cao Lãnh", R.drawable.traicay8));
    }


}