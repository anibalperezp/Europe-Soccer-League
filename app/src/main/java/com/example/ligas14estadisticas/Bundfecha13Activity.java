package com.example.ligas14estadisticas;

import java.util.LinkedList;

import com.example.ligas14estadisticas.R;
import com.example.ligas14estadisticas.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Bundfecha13Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_fecha13);
		inten=new Intent(this, Bundfechaj5Activity.class);
		TextView v1=(TextView)findViewById(R.id.af13p1);
		TextView v2=(TextView)findViewById(R.id.af13p2);
		TextView v3=(TextView)findViewById(R.id.af13p3);
		TextView v4=(TextView)findViewById(R.id.af13p4);
		TextView v5=(TextView)findViewById(R.id.af13p5);
		TextView v6=(TextView)findViewById(R.id.af13p6);
		TextView v7=(TextView)findViewById(R.id.af13p7);
		TextView v8=(TextView)findViewById(R.id.af13p8);
		TextView v9=(TextView)findViewById(R.id.af13p9);
		LinkedList<BBVAfechaj8Activity> list= Bundfechaj9Activity.getInstancia().getListDTOBund(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(108).getGoles1());
			v2.setText(list.get(109).getGoles1());
			v3.setText(list.get(110).getGoles1());
			v4.setText(list.get(111).getGoles1());
			v5.setText(list.get(112).getGoles1());
			v6.setText(list.get(113).getGoles1());
			v7.setText(list.get(114).getGoles1());
			v8.setText(list.get(115).getGoles1());
			v9.setText(list.get(116).getGoles1());
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
