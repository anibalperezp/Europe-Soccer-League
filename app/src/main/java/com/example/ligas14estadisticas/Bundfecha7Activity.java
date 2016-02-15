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

public class Bundfecha7Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_fecha7);
		inten=new Intent(this, Bundfechaj5Activity.class);
		TextView v1=(TextView)findViewById(R.id.af7p1);
		TextView v2=(TextView)findViewById(R.id.af7p2);
		TextView v3=(TextView)findViewById(R.id.af7p3);
		TextView v4=(TextView)findViewById(R.id.af7p4);
		TextView v5=(TextView)findViewById(R.id.af7p5);
		TextView v6=(TextView)findViewById(R.id.af7p6);
		TextView v7=(TextView)findViewById(R.id.af7p7);
		TextView v8=(TextView)findViewById(R.id.af7p8);
		TextView v9=(TextView)findViewById(R.id.af7p9);
		LinkedList<BBVAfechaj8Activity> list= Bundfechaj9Activity.getInstancia().getListDTOBund(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(54).getGoles1());
			v2.setText(list.get(55).getGoles1());
			v3.setText(list.get(56).getGoles1());
			v4.setText(list.get(57).getGoles1());
			v5.setText(list.get(58).getGoles1());
			v6.setText(list.get(59).getGoles1());
			v7.setText(list.get(60).getGoles1());
			v8.setText(list.get(61).getGoles1());
			v9.setText(list.get(62).getGoles1());
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

