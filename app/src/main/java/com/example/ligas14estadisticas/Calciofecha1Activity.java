package com.example.ligas14estadisticas;

import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Calciofecha1Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.calcio_fecha1);
		inten=new Intent(this, Bundfechaj7Activity.class);
		TextView v1=(TextView)findViewById(R.id.if1p1);
		TextView v2=(TextView)findViewById(R.id.if1p2);
		TextView v3=(TextView)findViewById(R.id.if1p3);
		TextView v4=(TextView)findViewById(R.id.if1p4);
		TextView v5=(TextView)findViewById(R.id.if1p5);
		TextView v6=(TextView)findViewById(R.id.if1p6);
		TextView v7=(TextView)findViewById(R.id.if1p7);
		TextView v8=(TextView)findViewById(R.id.if1p8);
		TextView v9=(TextView)findViewById(R.id.if1p9);
		TextView v10=(TextView)findViewById(R.id.if1p10);
		LinkedList<Calciofechaj1Activity> list= Bundfechaj9Activity.getInstancia().getListDTOIta(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(0).getGoles1());
			v2.setText(list.get(1).getGoles1());
			v3.setText(list.get(2).getGoles1());
			v4.setText(list.get(3).getGoles1());
			v5.setText(list.get(4).getGoles1());
			v6.setText(list.get(5).getGoles1());
			v7.setText(list.get(6).getGoles1());
			v8.setText(list.get(7).getGoles1());
			v9.setText(list.get(8).getGoles1());
			v10.setText(list.get(9).getGoles1());
		}
		else
			if(list.size()==0)
			{
				Log.d("Error", "No se ha cargado la Base de Dtos");
			}
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
