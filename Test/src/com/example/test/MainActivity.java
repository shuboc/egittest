package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Time now = new Time(Time.getCurrentTimezone());
		now.setToNow();
		Log.i("monthday", String.valueOf(now.monthDay));
		Log.i("month", String.valueOf(now.month));
		Log.i("year", String.valueOf(now.year));
		Log.i("time", now.format("%k:%M:%S"));
		
		
		Log.i("verbose", "hahahahaha");
		Log.i("verbose", "hahahahaha");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
