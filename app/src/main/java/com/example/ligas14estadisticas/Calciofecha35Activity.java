package com.example.ligas14estadisticas;
import java.util.LinkedList;

import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Calciofecha35Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.calcio_fecha35);
		inten=new Intent(this, Bundfechaj7Activity.class);
		TextView v1=(TextView)findViewById(R.id.if35p1);
		TextView v2=(TextView)findViewById(R.id.if35p2);
		TextView v3=(TextView)findViewById(R.id.if35p3);
		TextView v4=(TextView)findViewById(R.id.if35p4);
		TextView v5=(TextView)findViewById(R.id.if35p5);
		TextView v6=(TextView)findViewById(R.id.if35p6);
		TextView v7=(TextView)findViewById(R.id.if35p7);
		TextView v8=(TextView)findViewById(R.id.if35p8);
		TextView v9=(TextView)findViewById(R.id.if35p9);
		TextView v10=(TextView)findViewById(R.id.if35p10);
		LinkedList<Calciofechaj1Activity> list= Bundfechaj9Activity.getInstancia().getListDTOIta(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(340).getGoles1());
			v2.setText(list.get(341).getGoles1());
			v3.setText(list.get(342).getGoles1());
			v4.setText(list.get(343).getGoles1());
			v5.setText(list.get(344).getGoles1());
			v6.setText(list.get(345).getGoles1());
			v7.setText(list.get(346).getGoles1());
			v8.setText(list.get(347).getGoles1());
			v9.setText(list.get(348).getGoles1());
			v10.setText(list.get(349).getGoles1());
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
