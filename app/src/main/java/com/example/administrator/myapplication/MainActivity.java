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

    Student student;
    RecyclerView mRecyclerView;
    Adapter mAdapter;
    List<String>mstudentname;
    List<String>mstudentnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(mAdapter=new Adapter());


    }
    protected void initData()
       {

                student = new Student();

           student.add();

                mstudentnumber = new ArrayList<>();
                mstudentname = new ArrayList<>();

                 for(int i = 0;i<student.studentnumber.size();i++) {
                         mstudentname.add(student.studentname.get(i));
                         mstudentnumber.add(student.studentnumber.get(i));
                     }
             }


}
