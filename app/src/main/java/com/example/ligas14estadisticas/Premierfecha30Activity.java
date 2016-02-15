package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Premierfecha30Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha30);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef30p1);
		TextView v2=(TextView)findViewById(R.id.ef30p2);
		TextView v3=(TextView)findViewById(R.id.ef30p3);
		TextView v4=(TextView)findViewById(R.id.ef30p4);
		TextView v5=(TextView)findViewById(R.id.ef30p5);
		TextView v6=(TextView)findViewById(R.id.ef30p6);
		TextView v7=(TextView)findViewById(R.id.ef30p7);
		TextView v8=(TextView)findViewById(R.id.ef30p8);
		TextView v9=(TextView)findViewById(R.id.ef30p9);
		TextView v10=(TextView)findViewById(R.id.ef30p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(290).getGoles1());
			v2.setText(list.get(291).getGoles1());
			v3.setText(list.get(292).getGoles1());
			v4.setText(list.get(293).getGoles1());
			v5.setText(list.get(294).getGoles1());
			v6.setText(list.get(295).getGoles1());
			v7.setText(list.get(296).getGoles1());
			v8.setText(list.get(297).getGoles1());
			v9.setText(list.get(298).getGoles1());
			v10.setText(list.get(299).getGoles1());
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
