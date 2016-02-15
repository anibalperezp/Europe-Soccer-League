package com.example.ligas14estadisticas;

import java.util.LinkedList;

import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BBVAfechad30Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.detalles_sf30);
		inten=new Intent(this, BBVAfechaj2Activity.class);
		TextView encabezado=(TextView)findViewById(R.id.rests30);
		TextView g=(TextView)findViewById(R.id.dgs30);
		TextView ta=(TextView)findViewById(R.id.das30);
		TextView tr=(TextView)findViewById(R.id.drs30);
		TextView l=(TextView)findViewById(R.id.dlss30);
		LinkedList<Calciofechaj6Activity> list= Bundfechaj9Activity.getInstancia().getListDTODts(getApplicationContext());
		
		if(list.size()!=0)
		{
			String result=list.get(29).getDetalle();
			String[] r=result.split("/");
			if(r.length!=0 && !list.get(29).getDetalle().equalsIgnoreCase(" "))
			{
				encabezado.setText(r[0]);
				g.setText(r[1]);
				ta.setText(r[2]);
				tr.setText(r[3]);
				l.setText(r[4]);
			}else
				if(r.length==0)
				{
					encabezado.setText(" ");
					g.setText(" ");
					ta.setText(" ");
					tr.setText(" ");
					l.setText(" ");
				}
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