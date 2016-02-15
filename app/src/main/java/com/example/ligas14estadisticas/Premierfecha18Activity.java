package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Premierfecha18Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha18);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef18p1);
		TextView v2=(TextView)findViewById(R.id.ef18p2);
		TextView v3=(TextView)findViewById(R.id.ef18p3);
		TextView v4=(TextView)findViewById(R.id.ef18p4);
		TextView v5=(TextView)findViewById(R.id.ef18p5);
		TextView v6=(TextView)findViewById(R.id.ef18p6);
		TextView v7=(TextView)findViewById(R.id.ef18p7);
		TextView v8=(TextView)findViewById(R.id.ef18p8);
		TextView v9=(TextView)findViewById(R.id.ef18p9);
		TextView v10=(TextView)findViewById(R.id.ef18p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(170).getGoles1());
			v2.setText(list.get(171).getGoles1());
			v3.setText(list.get(172).getGoles1());
			v4.setText(list.get(173).getGoles1());
			v5.setText(list.get(174).getGoles1());
			v6.setText(list.get(175).getGoles1());
			v7.setText(list.get(176).getGoles1());
			v8.setText(list.get(177).getGoles1());
			v9.setText(list.get(178).getGoles1());
			v10.setText(list.get(179).getGoles1());
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
