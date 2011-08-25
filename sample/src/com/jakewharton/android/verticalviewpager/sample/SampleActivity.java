package com.jakewharton.android.verticalviewpager.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.jakewharton.android.verticalviewpager.OrientationViewPager;

public class SampleActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Set up the pager
        final OrientationViewPager pager = (OrientationViewPager)findViewById(R.id.pager);
        pager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager()));
        
        //Bind to control buttons
        ((Button)findViewById(R.id.horizontal)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pager.setOrientation(OrientationViewPager.HORIZONTAL);
			}
		});
        ((Button)findViewById(R.id.vertical)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pager.setOrientation(OrientationViewPager.VERTICAL);
			}
		});
    }
}
