package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Premierfecha25Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha25);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef25p1);
		TextView v2=(TextView)findViewById(R.id.ef25p2);
		TextView v3=(TextView)findViewById(R.id.ef25p3);
		TextView v4=(TextView)findViewById(R.id.ef25p4);
		TextView v5=(TextView)findViewById(R.id.ef25p5);
		TextView v6=(TextView)findViewById(R.id.ef25p6);
		TextView v7=(TextView)findViewById(R.id.ef25p7);
		TextView v8=(TextView)findViewById(R.id.ef25p8);
		TextView v9=(TextView)findViewById(R.id.ef25p9);
		TextView v10=(TextView)findViewById(R.id.ef25p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(240).getGoles1());
			v2.setText(list.get(241).getGoles1());
			v3.setText(list.get(242).getGoles1());
			v4.setText(list.get(243).getGoles1());
			v5.setText(list.get(244).getGoles1());
			v6.setText(list.get(245).getGoles1());
			v7.setText(list.get(246).getGoles1());
			v8.setText(list.get(247).getGoles1());
			v9.setText(list.get(248).getGoles1());
			v10.setText(list.get(249).getGoles1());
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
