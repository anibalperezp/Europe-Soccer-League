package com.example.ligas14estadisticas;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BundesEstadisticActivity  extends Activity {
	
	private Button btnPrincipal, btnVictorias, btnEmpates, btnGoles, btnAmarillas, btnRojas;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_estadistic);
		inten=new Intent(this, Bundfechaj10Activity.class);
		
		btnPrincipal=(Button)findViewById(R.id.btnaleest1);
		btnVictorias=(Button)findViewById(R.id.btnaleest2);
		btnEmpates=(Button)findViewById(R.id.btnaleest3);
		btnGoles=(Button)findViewById(R.id.btnaleest4);
		btnAmarillas=(Button)findViewById(R.id.btnaleest5);
		btnRojas=(Button)findViewById(R.id.btnaleest6);
		
		btnVictorias.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btnPrincipal.setBackgroundResource(R.drawable.est_bundes_victorias);
			}
		});
		
		btnEmpates.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btnPrincipal.setBackgroundResource(R.drawable.est_bundes_empates);
			}
		});
		
		btnGoles.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btnPrincipal.setBackgroundResource(R.drawable.est_bundes_goles);
			}
		});
		
		btnAmarillas.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btnPrincipal.setBackgroundResource(R.drawable.est_bundes_amarillas);
			}
		});
		
		btnRojas.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btnPrincipal.setBackgroundResource(R.drawable.est_bundes_rojas);
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
