package com.example.prartisehomeworkrecacler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    PowerfulPeopleAdapter mAdapter;
    private List<PowerfulPerson> mPowerfulPerson = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new PowerfulPeopleAdapter(mPowerfulPerson);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
preparePowerfulPeopleData();
    }
    private void preparePowerfulPeopleData() {

        mPowerfulPerson.add(new PowerfulPerson("Lenin"," 1860-1924",R.drawable.ic_launcher_foreground));
        mPowerfulPerson.add(new PowerfulPerson("Lenin"," 1860-1924",R.drawable.ic_launcher_foreground));
        mPowerfulPerson.add(new PowerfulPerson("Lenin"," 1860-1924",R.drawable.ic_launcher_foreground));
        mPowerfulPerson.add(new PowerfulPerson("Полунин"," 1860-1924",R.drawable.ic_launcher_foreground));

        mAdapter.notifyDataSetChanged();

    }
}