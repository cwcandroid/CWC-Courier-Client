package com.cwc.courierclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CWCCourierClientLoginActivity extends Activity {
	Button btnLogin, btnRegister;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        btnLogin=(Button)findViewById(R.id.button1);
        btnRegister=(Button)findViewById(R.id.button2);
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TO DO: User input validation
				// TO DO: Client Authentication and handle different error cases
				
				
				// If authentication successful
				Intent i=new Intent(CWCCourierClientLoginActivity.this, CWCCourierClientMainScreenActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				
			}
		});
        
        btnRegister.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(CWCCourierClientLoginActivity.this, CWCCourierClientRegistrationActivity.class);
				startActivity(i);
			}
		});
        
        
        
    }
}