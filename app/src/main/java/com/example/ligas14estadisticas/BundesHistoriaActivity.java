package com.example.ligas14estadisticas;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BundesHistoriaActivity  extends Activity {
	
	private Button btnTabla;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_historia);
		inten=new Intent(this, Bundfechaj10Activity.class);
		
		btnTabla=(Button)findViewById(R.id.btnaletabla);
		
		btnTabla.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btn_chistory2);
				Intent myIntent =new Intent(arg0.getContext(), BundesHistoriaTablaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
