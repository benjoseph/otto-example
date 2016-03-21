package com.josephben.android.ottoexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.top_fragment, new TopFragment())
                .commit();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.bottom_fragment,new BottomFragment())
                .commit();
    }

}
