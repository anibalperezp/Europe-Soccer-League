package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Premierfecha4Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha4);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef4p1);
		TextView v2=(TextView)findViewById(R.id.ef4p2);
		TextView v3=(TextView)findViewById(R.id.ef4p3);
		TextView v4=(TextView)findViewById(R.id.ef4p4);
		TextView v5=(TextView)findViewById(R.id.ef4p5);
		TextView v6=(TextView)findViewById(R.id.ef4p6);
		TextView v7=(TextView)findViewById(R.id.ef4p7);
		TextView v8=(TextView)findViewById(R.id.ef4p8);
		TextView v9=(TextView)findViewById(R.id.ef4p9);
		TextView v10=(TextView)findViewById(R.id.ef4p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(30).getGoles1());
			v2.setText(list.get(31).getGoles1());
			v3.setText(list.get(32).getGoles1());
			v4.setText(list.get(33).getGoles1());
			v5.setText(list.get(34).getGoles1());
			v6.setText(list.get(35).getGoles1());
			v7.setText(list.get(36).getGoles1());
			v8.setText(list.get(37).getGoles1());
			v9.setText(list.get(38).getGoles1());
			v10.setText(list.get(39).getGoles1());
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
