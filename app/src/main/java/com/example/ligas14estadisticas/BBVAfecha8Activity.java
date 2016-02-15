package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BBVAfecha8Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bbva_fecha8);
		inten=new Intent(this, Bundfechaj3Activity.class);
		TextView v1=(TextView)findViewById(R.id.sf8p1);
		TextView v2=(TextView)findViewById(R.id.sf8p2);
		TextView v3=(TextView)findViewById(R.id.sf8p3);
		TextView v4=(TextView)findViewById(R.id.sf8p4);
		TextView v5=(TextView)findViewById(R.id.sf8p5);
		TextView v6=(TextView)findViewById(R.id.sf8p6);
		TextView v7=(TextView)findViewById(R.id.sf8p7);
		TextView v8=(TextView)findViewById(R.id.sf8p8);
		TextView v9=(TextView)findViewById(R.id.sf8p9);
		TextView v10=(TextView)findViewById(R.id.sf8p10);
		LinkedList<BBVAfechaj10Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEsp(getApplicationContext());
		if(list.size()!=0)
		{
			v1.setText(list.get(70).getGoles1());
			v2.setText(list.get(71).getGoles1());
			v3.setText(list.get(72).getGoles1());
			v4.setText(list.get(73).getGoles1());
			v5.setText(list.get(74).getGoles1());
			v6.setText(list.get(75).getGoles1());
			v7.setText(list.get(76).getGoles1());
			v8.setText(list.get(77).getGoles1());
			v9.setText(list.get(78).getGoles1());
			v10.setText(list.get(79).getGoles1());
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
