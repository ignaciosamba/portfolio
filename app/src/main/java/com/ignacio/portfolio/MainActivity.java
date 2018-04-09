package com.ignacio.portfolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.android.volley.toolbox.JsonArrayRequest;
import com.ignacio.portfolio.Controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private static String PHONE_NUMBER = "tel: +543513968990";
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.table_layout);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY, Color.parseColor("blue"));

        Button btn_call = findViewById(R.id.btn_phone);
        btn_call.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(PHONE_NUMBER)));
        }
    };
}
