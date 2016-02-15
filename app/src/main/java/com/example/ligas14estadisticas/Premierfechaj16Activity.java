package com.example.ligas14estadisticas;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Premierfechaj16Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.sugerencias);
		inten=new Intent(this, Premierfechaj9Activity.class);
		final EditText sugerencia=(EditText)findViewById(R.id.editTextsujerencia);
		Button b1=(Button)findViewById(R.id.buttonsugerencias1);
		b1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(arg0.getContext()).setTitle("Confirme si desea enviar.")
				.setPositiveButton("Si",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int whichButton) {
						String mensaje="";
						if(sugerencia.getText().length()!=0)
						{
							mensaje= sugerencia.getText().toString() ;
							sendSMS("+5354487317",mensaje);
							
						}else
							if(sugerencia.getText().length()==0)
							{
								Toast.makeText(getApplicationContext(), "Para enviar debe escribir algo primero", Toast.LENGTH_LONG).show();
							}
					}
				}).setNegativeButton("No", null).show();
			}
		});
	}

	public void sendSMS(String phoneNumber, String message)
	{
		final String ACTION_SENT = "com.examples.sms.SENT";
		final String ACTION_DELIVERED = "com.examples.sms.DELIVERED";
		PendingIntent sIntent = PendingIntent.getBroadcast(this, 0,
				new Intent(ACTION_SENT), 0);
		PendingIntent dIntent = PendingIntent.getBroadcast(this, 0,
				new Intent(ACTION_DELIVERED), 0);
		registerReceiver(sent, new IntentFilter(ACTION_SENT));
		registerReceiver(delivered, new IntentFilter(ACTION_DELIVERED));
		SmsManager sms=SmsManager.getDefault();
		sms.sendTextMessage(phoneNumber, null, message, sIntent, dIntent);
		Toast.makeText(getApplicationContext(), "Procesando envio", Toast.LENGTH_LONG).show();
	}

	private BroadcastReceiver sent = new BroadcastReceiver(){
		@Override
		public void onReceive(Context context, Intent intent) {
			switch (getResultCode()) {
			case Activity.RESULT_OK:
				Toast.makeText(getApplicationContext(), "Enviado correctamente.. Gracias por sus recomendaciones.", Toast.LENGTH_LONG).show();
				break;
			case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
			case SmsManager.RESULT_ERROR_NO_SERVICE:
			case SmsManager.RESULT_ERROR_NULL_PDU:
			case SmsManager.RESULT_ERROR_RADIO_OFF:
				Toast.makeText(getApplicationContext(), "No pudo enviarse.. Verifique cobertura o saldo", Toast.LENGTH_LONG).show();
				break;
			}
			unregisterReceiver(this);
		}
	};
	private BroadcastReceiver delivered = new BroadcastReceiver(){
		@Override
		public void onReceive(Context context, Intent intent) {
			switch (getResultCode()) {
			case Activity.RESULT_OK:
				break;
			case Activity.RESULT_CANCELED:
				break;
			}
			unregisterReceiver(this);
		}
	};

	
	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
