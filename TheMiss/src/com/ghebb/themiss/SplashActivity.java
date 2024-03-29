package com.ghebb.themiss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.gab.themiss.R;

public class SplashActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
				
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
	            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
	            startActivity(intent);
	            SplashActivity.this.finish();
            }
		}, 2000);
	}
}
