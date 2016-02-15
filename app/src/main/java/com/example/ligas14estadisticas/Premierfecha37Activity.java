package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Premierfecha37Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha37);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef37p1);
		TextView v2=(TextView)findViewById(R.id.ef37p2);
		TextView v3=(TextView)findViewById(R.id.ef37p3);
		TextView v4=(TextView)findViewById(R.id.ef37p4);
		TextView v5=(TextView)findViewById(R.id.ef37p5);
		TextView v6=(TextView)findViewById(R.id.ef37p6);
		TextView v7=(TextView)findViewById(R.id.ef37p7);
		TextView v8=(TextView)findViewById(R.id.ef37p8);
		TextView v9=(TextView)findViewById(R.id.ef37p9);
		TextView v10=(TextView)findViewById(R.id.ef37p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(360).getGoles1());
			v2.setText(list.get(361).getGoles1());
			v3.setText(list.get(362).getGoles1());
			v4.setText(list.get(363).getGoles1());
			v5.setText(list.get(364).getGoles1());
			v6.setText(list.get(365).getGoles1());
			v7.setText(list.get(366).getGoles1());
			v8.setText(list.get(367).getGoles1());
			v9.setText(list.get(368).getGoles1());
			v10.setText(list.get(369).getGoles1());
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
