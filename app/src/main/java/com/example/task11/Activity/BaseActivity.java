package com.example.task11.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.task11.Model.Member;
import com.example.task11.Network.BaseServer;
import com.example.task11.R;
import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity implements BaseServer {

    protected String getServer(){
        if(IS_TESTER){
            return SERVER_DEVELOPMENT;
        }
        return SERVER_DEPLOYMENT;
    }

    protected ArrayList<Member> prepareMemberList(){

        ArrayList<Member> members = new ArrayList<>();

        for (int i=0;i<=20;i++){
            members.add(new Member(R.mipmap.ic_profile,"Yahya " + i,"Mahmudiy " + i));
        }

        return members;
    }

    protected static boolean isEmpty(final String s){
        return s==null || s.trim().isEmpty();
    }
}