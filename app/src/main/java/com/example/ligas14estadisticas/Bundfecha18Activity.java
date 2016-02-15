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

public class Bundfecha18Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bundes_fecha18);
		inten=new Intent(this, Bundfechaj5Activity.class);
		TextView v1=(TextView)findViewById(R.id.af18p1);
		TextView v2=(TextView)findViewById(R.id.af18p2);
		TextView v3=(TextView)findViewById(R.id.af18p3);
		TextView v4=(TextView)findViewById(R.id.af18p4);
		TextView v5=(TextView)findViewById(R.id.af18p5);
		TextView v6=(TextView)findViewById(R.id.af18p6);
		TextView v7=(TextView)findViewById(R.id.af18p7);
		TextView v8=(TextView)findViewById(R.id.af18p8);
		TextView v9=(TextView)findViewById(R.id.af18p9);
		LinkedList<BBVAfechaj8Activity> list= Bundfechaj9Activity.getInstancia().getListDTOBund(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(153).getGoles1());
			v2.setText(list.get(154).getGoles1());
			v3.setText(list.get(155).getGoles1());
			v4.setText(list.get(156).getGoles1());
			v5.setText(list.get(157).getGoles1());
			v6.setText(list.get(158).getGoles1());
			v7.setText(list.get(159).getGoles1());
			v8.setText(list.get(160).getGoles1());
			v9.setText(list.get(161).getGoles1());
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

