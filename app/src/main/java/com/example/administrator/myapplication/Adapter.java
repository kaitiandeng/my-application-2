package com.example.administrator.myapplication;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2016/12/2.
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

        List<String> mstudentname;
        List<String>mstudentnumber;
        Student student;

        @Override
        //绑定item的xml布局
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
        }


        @Override
        //将数据绑定到item里面的TextView
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.tv_studentname.setText(mstudentname.get(position));

            holder.tv_studentnumber.setText(mstudentnumber.get(position));

        }

        @Override
        //复制item？
        public int getItemCount() {
            return mstudentname.size();
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

        //设置一些属性
        class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tv_studentnumber;
            TextView tv_studentname;

            public MyViewHolder(View itemView) {

                super(itemView);

                tv_studentnumber = (TextView) itemView.findViewById(R.id.tv_studentnumber);
                tv_studentname= (TextView) itemView.findViewById(R.id.tv_studentname);

            }
        }
    }
