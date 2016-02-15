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

public class Bundfecha15Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_fecha15);
		inten=new Intent(this, Bundfechaj5Activity.class);
		TextView v1=(TextView)findViewById(R.id.af15p1);
		TextView v2=(TextView)findViewById(R.id.af15p2);
		TextView v3=(TextView)findViewById(R.id.af15p3);
		TextView v4=(TextView)findViewById(R.id.af15p4);
		TextView v5=(TextView)findViewById(R.id.af15p5);
		TextView v6=(TextView)findViewById(R.id.af15p6);
		TextView v7=(TextView)findViewById(R.id.af15p7);
		TextView v8=(TextView)findViewById(R.id.af15p8);
		TextView v9=(TextView)findViewById(R.id.af15p9);
		LinkedList<BBVAfechaj8Activity> list= Bundfechaj9Activity.getInstancia().getListDTOBund(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(126).getGoles1());
			v2.setText(list.get(127).getGoles1());
			v3.setText(list.get(128).getGoles1());
			v4.setText(list.get(129).getGoles1());
			v5.setText(list.get(130).getGoles1());
			v6.setText(list.get(131).getGoles1());
			v7.setText(list.get(132).getGoles1());
			v8.setText(list.get(133).getGoles1());
			v9.setText(list.get(134).getGoles1());
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

