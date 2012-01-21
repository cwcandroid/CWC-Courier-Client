package com.cwc.courierclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CWCCourierClientRegistrationActivity extends Activity{
	Button btnLogin, btnSubmit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		btnLogin=(Button)findViewById(R.id.button2);
		btnSubmit=(Button)findViewById(R.id.button1);
		
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(CWCCourierClientRegistrationActivity.this, CWCCourierClientLoginActivity.class);
				startActivity(i);
			}
		});
		
		btnSubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TO DO: user input validation
				// TO DO: Submit request for registration and handle different error cases
				Intent i=new Intent(CWCCourierClientRegistrationActivity.this, CWCCourierClientLoginActivity.class);
				startActivity(i);
			}
		});
		
	}

}
