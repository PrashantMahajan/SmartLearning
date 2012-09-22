package com.peopleskill.smartlearning;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WelcomeScreen extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_welcome_screen, menu);
		return true;
	}
}
