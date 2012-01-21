package com.cwc.courierclient;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class CWCCourierClientMainScreenActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// setup tabs
		TabHost tabHost = getTabHost();
		TabHost.TabSpec tabSpec;
		Intent intent;

		intent = new Intent().setClass(this, TasksActivity.class);
		tabSpec = tabHost.newTabSpec("tasks").setIndicator("Tasks", null)
				.setContent(intent);
		tabHost.addTab(tabSpec);

		intent = new Intent().setClass(this, HistoryActivity.class);
		tabSpec = tabHost.newTabSpec("history").setIndicator("History", null)
				.setContent(intent);
		tabHost.addTab(tabSpec);

		intent = new Intent().setClass(this, PerformanceActivity.class);
		tabSpec = tabHost.newTabSpec("performance").setIndicator("Performance", null)
				.setContent(intent);
		tabHost.addTab(tabSpec);
	}

}
