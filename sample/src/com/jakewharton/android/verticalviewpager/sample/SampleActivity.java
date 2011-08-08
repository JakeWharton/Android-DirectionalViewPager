package com.jakewharton.android.verticalviewpager.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.jakewharton.android.verticalviewpager.VerticalViewPager;

public class SampleActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        VerticalViewPager pager = (VerticalViewPager)findViewById(R.id.pager);
        pager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager()));
    }
}
