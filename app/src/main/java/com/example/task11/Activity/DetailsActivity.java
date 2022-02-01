package com.example.task11.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.task11.Adapter.DetailsAdapter;
import com.example.task11.Adapter.MainAdapter;
import com.example.task11.Model.Member;
import com.example.task11.Network.BaseServer;
import com.example.task11.R;
import java.util.ArrayList;

public class DetailsActivity extends BaseActivity{

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        ArrayList<Member> members = prepareMemberList();

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members){
        DetailsAdapter adapter = new DetailsAdapter(this,members);
        recyclerView.setAdapter(adapter);
    }
}