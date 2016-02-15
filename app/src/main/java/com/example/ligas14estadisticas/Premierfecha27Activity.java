package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Premierfecha27Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha27);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef27p1);
		TextView v2=(TextView)findViewById(R.id.ef27p2);
		TextView v3=(TextView)findViewById(R.id.ef27p3);
		TextView v4=(TextView)findViewById(R.id.ef27p4);
		TextView v5=(TextView)findViewById(R.id.ef27p5);
		TextView v6=(TextView)findViewById(R.id.ef27p6);
		TextView v7=(TextView)findViewById(R.id.ef27p7);
		TextView v8=(TextView)findViewById(R.id.ef27p8);
		TextView v9=(TextView)findViewById(R.id.ef27p9);
		TextView v10=(TextView)findViewById(R.id.ef27p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(260).getGoles1());
			v2.setText(list.get(261).getGoles1());
			v3.setText(list.get(262).getGoles1());
			v4.setText(list.get(263).getGoles1());
			v5.setText(list.get(264).getGoles1());
			v6.setText(list.get(265).getGoles1());
			v7.setText(list.get(266).getGoles1());
			v8.setText(list.get(267).getGoles1());
			v9.setText(list.get(268).getGoles1());
			v10.setText(list.get(269).getGoles1());
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
