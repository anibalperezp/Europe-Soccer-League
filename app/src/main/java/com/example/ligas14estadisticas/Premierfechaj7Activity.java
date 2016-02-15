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
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Premierfechaj7Activity  extends Activity 
{
	private Button sadfadf, efgfdsv; 
	private float vlq=0;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.registro);
		inten=new Intent(this, Premierfechaj9Activity.class);
		
		sadfadf=(Button)findViewById(R.id.btnayuda);
		efgfdsv=(Button)findViewById(R.id.btnpacks);
		
		sadfadf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btn_ayuda2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj1Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		efgfdsv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btn_packs2);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj5Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		final String[] bbva =new String[]{"Atlético de Madrid","FC Barcelona","Real Madrid",
				"Athletic Club","Sevilla","Villarreal","Real Sociedad","Valencia","Celta de Vigo",
				"Levante","Málaga","Rayo Vallecano","Getafe","RCD Espanyol","Granada",
				"Elche","Almería","Deportivo de La Coruña","Eibar","Córdoba"};
		
		final String[] bund =new String[]{"Bayern Múnich","Borussia Dortmund","Schalke 04",
				"Bayer Leverkusen","Wolfsburgo","Borussia M'gladbach","Mainz 05","Augsburgo",
				"Hoffenheim","Hannover 96","Hertha BSC","Werder Bremen","Eintracht Frankfurt",
				"Friburgo","Stuttgart","Hamburgo","Colonia","Paderborn"};
		
		final String[] calc =new String[]{"Juventus","Roma","Nápoles","AC Milan",
				"Fiorentina","Inter de Milán","Lazio","Hellas Verona","Atalanta","Sampdoria",
				"Udinese","Génova","Cagliari","Chievo Verona","Sassuolo","Empoli",
				"Cesena","Palermo","Parma","Torino"};
		
		final String[] prem =new String[]{"Manchester City","Liverpool","Chelsea",
				"Arsenal","Everton","Tottenham","Manchester United","Southampton","Stoke City",
				"Newcastle United","Crystal Palace","Swansea City","West Ham United","Sunderland","Aston Villa",
				"Hull City","West Bromwich Albion","Burnley","Leicester City","Queens Park Rangers"};
		
		final EditText nombre=(EditText)findViewById(R.id.editTextNombre);
		final EditText direccion=(EditText)findViewById(R.id.editTextDireccion);
		final CheckBox chligesp=(CheckBox)findViewById(R.id.checkBoxbbva);
		final CheckBox chligespnews=(CheckBox)findViewById(R.id.checkBoxbbvanews);
		final CheckBox chligbund=(CheckBox)findViewById(R.id.checkBoxbundes);
		final CheckBox chligbundnews=(CheckBox)findViewById(R.id.checkBoxbundesnews);
		final CheckBox chligcalcio=(CheckBox)findViewById(R.id.checkBoxcalcio);
		final CheckBox chligcalcionews=(CheckBox)findViewById(R.id.checkBoxcalcionews);
		final CheckBox chligprem=(CheckBox)findViewById(R.id.checkBoxpremier);
		final CheckBox chligpremnews=(CheckBox)findViewById(R.id.checkBoxpremiernews);
		final CheckBox news=(CheckBox)findViewById(R.id.checkBoxnews);
		final TextView value=(TextView)findViewById(R.id.rvc);
		value.setText(String.valueOf(vlq));
		Button btn=(Button)findViewById(R.id.button1);
		final Spinner cmbbbva = (Spinner)findViewById(R.id.spinnerbbva);
		final Spinner cmbbund = (Spinner)findViewById(R.id.spinnerbundes);
		final Spinner cmbcalc = (Spinner)findViewById(R.id.spinnercalcio);
		final Spinner cmbprem= (Spinner)findViewById(R.id.spinnerpemier);
		
		ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bbva);
		ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,bund);
		ArrayAdapter<String> adaptador3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, calc);
		ArrayAdapter<String> adaptador4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, prem);
		
		adaptador1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cmbbbva.setAdapter(adaptador1);
		adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cmbbund.setAdapter(adaptador2);
		adaptador3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cmbcalc.setAdapter(adaptador3);
		adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cmbprem.setAdapter(adaptador4);
		
		chligesp.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 5;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-5;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligespnews.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 4;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-4;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligbund.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 5;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-5;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligbundnews.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 4;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-4;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligcalcio.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 5;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-5;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligcalcionews.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 4;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-4;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligprem.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 5;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-5;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		chligpremnews.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 4;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-4;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		news.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					vlq=vlq + 7;
					value.setText(String.valueOf(vlq));
				}else
					if(isChecked==false)
					{
						vlq=vlq-7;
						value.setText(String.valueOf(vlq));
					}
			}
		});
		
		btn.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(arg0.getContext()).setTitle("Confirme si desea registrarse.")
				.setPositiveButton("Si",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int whichButton) {
						String mensaje="";
						if(nombre.getText().length()!=0 && direccion.getText().length()!=0)
						{
							mensaje= nombre.getText().toString() + " " +  "dir: " + direccion.getText().toString() + " ";
							
							if(chligesp.isChecked()==true || chligespnews.isChecked()==true || chligbund.isChecked()==true || chligbundnews.isChecked()==true || chligcalcio.isChecked()==true || chligcalcionews.isChecked()==true || chligprem.isChecked()==true || chligpremnews.isChecked()==true)
							{
								if(chligesp.isChecked()==true)
								{
									mensaje+= " " +  "liga " + "esp";
								}
								if(chligespnews.isChecked()==true)
								{
									mensaje+=" " + "news " + "esp" ;
								}
								if(chligbund.isChecked()==true)
								{
									mensaje+= " " +  "liga " + "bund";
								}
								if(chligbundnews.isChecked()==true)
								{
									mensaje+= " " + "news " + "bund" ;
								}
								if(chligcalcio.isChecked()==true)
								{
									mensaje+= " " +  "liga " + "calcio";
								}
								if(chligcalcionews.isChecked()==true)
								{
									mensaje+= " " + "news " + "calcio" ;
								}
								if(chligprem.isChecked()==true)
								{
									mensaje+= " " +  "liga " + "ing";
								}
								if(chligpremnews.isChecked()==true)
								{
									mensaje+=" " + "news " + "ing" ;
								}
								if(news.isChecked()==true)
								{
									mensaje+= " news internac " ;
								}
								sendSMS("+5354487317",mensaje);
							}
							else
								if(chligesp.isChecked()==false && chligespnews.isChecked()==false && chligbund.isChecked()==false && chligbundnews.isChecked()==false && chligcalcio.isChecked()==false && chligcalcionews.isChecked()==false && chligprem.isChecked()==false && chligpremnews.isChecked()==false && news.isChecked()==false)
								{
									Toast.makeText(getApplicationContext(), "Para registrase seleccione antes los servicios que desea activar.", Toast.LENGTH_LONG).show();
								}
						}else
							if(nombre.getText().length()==0  || direccion.getText().length()==0 )
							{
								Toast.makeText(getApplicationContext(), "No pudo enviarse.. Verifique sus datos personales.", Toast.LENGTH_LONG).show();
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
		//Monitor status of the operation
		registerReceiver(sent, new IntentFilter(ACTION_SENT));
		registerReceiver(delivered, new IntentFilter(ACTION_DELIVERED));
		//Send the message

		SmsManager sms=SmsManager.getDefault();
		sms.sendTextMessage(phoneNumber, null, message, sIntent, dIntent);
		Toast.makeText(getApplicationContext(), "Procesando registro", Toast.LENGTH_LONG).show();

	}

	private BroadcastReceiver sent = new BroadcastReceiver(){
		@Override
		public void onReceive(Context context, Intent intent) {
			switch (getResultCode()) {
			case Activity.RESULT_OK:
				Toast.makeText(getApplicationContext(), "Enviado correctamente, en minutos le atenderemos", Toast.LENGTH_LONG).show();
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
				//Handle delivery success
				break;
			case Activity.RESULT_CANCELED:
				//Handle delivery failure
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
