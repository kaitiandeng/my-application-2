package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    RecyclerView mRecyclerView;
    Adapter mAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter=new Adapter();

        mAdapter.initData();

        mRecyclerView.setAdapter(mAdapter);


    }

}
