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

public class Bundfechad28Activity extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.detalles_af28);
		inten=new Intent(this, BBVAfechaj1Activity.class);
		TextView encabezado=(TextView)findViewById(R.id.resta28);
		TextView g=(TextView)findViewById(R.id.dga28);
		TextView ta=(TextView)findViewById(R.id.daa28);
		TextView tr=(TextView)findViewById(R.id.dra28);
		TextView l=(TextView)findViewById(R.id.dlsa28);
		LinkedList<BBVAfechaj5Activity> list= Bundfechaj9Activity.getInstancia().getListDTODta(getApplicationContext());
		
		if(list.size()!=0)
		{
			String result=list.get(27).getDetalle();
			String[] r=result.split("/");
			String ew=list.get(27).getDetalle();
			if(r.length!=0 && !list.get(27).getDetalle().equals(" "))
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
