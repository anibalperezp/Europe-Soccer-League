package com.example.ligas14estadisticas;
import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class Premierfechaj9Activity extends Activity {

private Button fnnsfsff,sdfgkjbgf,dfgpoijfd,yjkyujkt,sdvfkjbws,vjhvjvjvj,ndfgsdfgs,rtetwwf;
private int backpress=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_main);
		final String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
		rtetwwf=(Button)findViewById(R.id.buttonp1);
		fnnsfsff=(Button)findViewById(R.id.buttonp2);
		sdfgkjbgf=(Button)findViewById(R.id.buttonp3);
		dfgpoijfd=(Button)findViewById(R.id.buttonp4);
		yjkyujkt=(Button)findViewById(R.id.buttonp5);
		sdvfkjbws=(Button)findViewById(R.id.buttonp6);
		vjhvjvjvj=(Button)findViewById(R.id.buttonp7);
		ndfgsdfgs=(Button)findViewById(R.id.buttonp8);
		IntentFilter filter = new IntentFilter(SMS_RECEIVED);
		BroadcastReceiver receiver = new BBVAfechaj9Activity();
		registerReceiver(receiver, filter);
		fnnsfsff.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj15Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		sdfgkjbgf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj10Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		dfgpoijfd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Calciofechaj7Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		yjkyujkt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Calciofechaj8Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		vjhvjvjvj.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj7Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		rtetwwf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj2Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		ndfgsdfgs.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj16Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		sdvfkjbws.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rtetwwf.setBackgroundResource(R.drawable.aps2);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj25Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override 
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{ 
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
	    { 
	        backpress = (backpress + 1);
	        if(backpress==1)
	        {
	        	Toast.makeText(getApplicationContext(), "Pulse nuevamente para salir ", Toast.LENGTH_SHORT).show();
	        }
	        if (backpress>1)
	        {
		        Intent startMain = new Intent(Intent.ACTION_MAIN); 
		        startMain.addCategory(Intent.CATEGORY_HOME); 
		        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		        startActivity(startMain); 
		        backpress=0;
	        }
	        return true; 
	    } 

	    return super.onKeyDown(keyCode, event); 
	} 


}
