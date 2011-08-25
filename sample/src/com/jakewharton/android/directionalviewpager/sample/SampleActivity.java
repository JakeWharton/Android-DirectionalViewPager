package com.jakewharton.android.directionalviewpager.sample;

import com.jakewharton.android.directionalviewpager.DirectionalViewPager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Set up the pager
        final DirectionalViewPager pager = (DirectionalViewPager)findViewById(R.id.pager);
        pager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager()));
        
        //Bind to control buttons
        ((Button)findViewById(R.id.horizontal)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pager.setOrientation(DirectionalViewPager.HORIZONTAL);
			}
		});
        ((Button)findViewById(R.id.vertical)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pager.setOrientation(DirectionalViewPager.VERTICAL);
			}
		});
    }
}
