package com.nature.naturedangerous;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nature.naturedangerous.view.ContainerActivity;
import com.nature.naturedangerous.view.CreateAccountActivity;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void goCreateAccount(View view){
        Intent intent=new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goContainer(View view){
        Intent intent=new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
