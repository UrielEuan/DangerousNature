package com.nature.naturedangerous;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * Created by Uriel on 21/05/17.
 */

public class splashSS extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_ss);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             Intent intent=new Intent(splashSS.this, Activity_login.class);
                startActivity(intent);
            }
        }, 4000);
    }
}
