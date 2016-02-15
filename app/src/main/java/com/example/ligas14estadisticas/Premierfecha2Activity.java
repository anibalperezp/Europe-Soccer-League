package com.example.ligas14estadisticas;
import java.util.LinkedList;
import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Premierfecha2Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.premier_fecha2);
		inten=new Intent(this, Premierfechaj10Activity.class);
		TextView v1=(TextView)findViewById(R.id.ef2p1);
		TextView v2=(TextView)findViewById(R.id.ef2p2);
		TextView v3=(TextView)findViewById(R.id.ef2p3);
		TextView v4=(TextView)findViewById(R.id.ef2p4);
		TextView v5=(TextView)findViewById(R.id.ef2p5);
		TextView v6=(TextView)findViewById(R.id.ef2p6);
		TextView v7=(TextView)findViewById(R.id.ef2p7);
		TextView v8=(TextView)findViewById(R.id.ef2p8);
		TextView v9=(TextView)findViewById(R.id.ef2p9);
		TextView v10=(TextView)findViewById(R.id.ef2p10);
		LinkedList<Premierfechaj4Activity> list= Bundfechaj9Activity.getInstancia().getListDTOEng(getApplicationContext());
		
		if(list.size()!=0)
		{
			v1.setText(list.get(10).getGoles1());
			v2.setText(list.get(11).getGoles1());
			v3.setText(list.get(12).getGoles1());
			v4.setText(list.get(13).getGoles1());
			v5.setText(list.get(14).getGoles1());
			v6.setText(list.get(15).getGoles1());
			v7.setText(list.get(16).getGoles1());
			v8.setText(list.get(17).getGoles1());
			v9.setText(list.get(18).getGoles1());
			v10.setText(list.get(19).getGoles1());
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
