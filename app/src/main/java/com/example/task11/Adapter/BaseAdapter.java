package com.example.task11.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task11.Activity.MainActivity;
import com.example.task11.Model.Member;
import com.example.task11.Network.BaseServer;
import com.example.task11.R;
import java.util.ArrayList;

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BaseServer {

    @Override
    public int getItemCount() {
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    protected String getServer(){
        if(IS_TESTER){
            return SERVER_DEVELOPMENT;
        }
        return SERVER_DEPLOYMENT;
    }

    protected static boolean isEmpty(final String s){
        return s==null || s.trim().isEmpty();
    }
}