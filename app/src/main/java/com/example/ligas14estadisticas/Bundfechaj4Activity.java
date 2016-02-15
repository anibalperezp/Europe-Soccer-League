package com.example.ligas14estadisticas;
import java.util.LinkedList;

import com.example.ligas14estadisticas.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Bundfechaj4Activity  extends Activity {
	
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.bbva_ranking);
		inten=new Intent(this, Premierfechaj15Activity.class);
		TextView v1=(TextView)findViewById(R.id.ps1);
		TextView v2=(TextView)findViewById(R.id.ps2);
		TextView v3=(TextView)findViewById(R.id.ps3);
		TextView v4=(TextView)findViewById(R.id.ps4);
		TextView v5=(TextView)findViewById(R.id.ps5);
		TextView v6=(TextView)findViewById(R.id.ps6);
		TextView v7=(TextView)findViewById(R.id.ps7);
		TextView v8=(TextView)findViewById(R.id.ps8);
		TextView v9=(TextView)findViewById(R.id.ps9);
		TextView v10=(TextView)findViewById(R.id.ps10);
		TextView v11=(TextView)findViewById(R.id.ps11);
		TextView v12=(TextView)findViewById(R.id.ps12);
		TextView v13=(TextView)findViewById(R.id.ps13);
		TextView v14=(TextView)findViewById(R.id.ps14);
		TextView v15=(TextView)findViewById(R.id.ps15);
		TextView v16=(TextView)findViewById(R.id.ps16);
		TextView v17=(TextView)findViewById(R.id.ps17);
		TextView v18=(TextView)findViewById(R.id.ps18);
		TextView v19=(TextView)findViewById(R.id.ps19);
		TextView v20=(TextView)findViewById(R.id.ps20);
		TextView v21=(TextView)findViewById(R.id.s1);
		TextView v22=(TextView)findViewById(R.id.s2);
		TextView v23=(TextView)findViewById(R.id.s3);
		TextView v24=(TextView)findViewById(R.id.s4);
		TextView v25=(TextView)findViewById(R.id.s5);
		TextView v26=(TextView)findViewById(R.id.s6);
		TextView v27=(TextView)findViewById(R.id.s7);
		TextView v28=(TextView)findViewById(R.id.s8);
		TextView v29=(TextView)findViewById(R.id.s9);
		TextView v30=(TextView)findViewById(R.id.s10);
		TextView v31=(TextView)findViewById(R.id.s11);
		TextView v32=(TextView)findViewById(R.id.s12);
		TextView v33=(TextView)findViewById(R.id.s13);
		TextView v34=(TextView)findViewById(R.id.s14);
		TextView v35=(TextView)findViewById(R.id.s15);
		TextView v36=(TextView)findViewById(R.id.s16);
		TextView v37=(TextView)findViewById(R.id.s17);
		TextView v38=(TextView)findViewById(R.id.s18);
		TextView v39=(TextView)findViewById(R.id.s19);
		TextView v40=(TextView)findViewById(R.id.s20);
		TextView el1=(TextView)findViewById(R.id.sl1);
		TextView el2=(TextView)findViewById(R.id.sl2);
		TextView el3=(TextView)findViewById(R.id.sl3);
		TextView el4=(TextView)findViewById(R.id.sl4);
		LinkedList<Calciofechaj4Activity> list= Bundfechaj9Activity.getInstancia().ordenSR(getApplicationContext());
		LinkedList<Premierfechaj14Activity> liste= Bundfechaj9Activity.getInstancia().getListDTORjs(getApplicationContext());
		if(list.size()!=0)
		{
			v1.setText(Float.toString(list.get(0).getPtos()));
			v2.setText(Float.toString(list.get(1).getPtos()));
			v3.setText(Float.toString(list.get(2).getPtos()));
			v4.setText(Float.toString(list.get(3).getPtos()));
			v5.setText(Float.toString(list.get(4).getPtos()));
			v6.setText(Float.toString(list.get(5).getPtos()));
			v7.setText(Float.toString(list.get(6).getPtos()));
			v8.setText(Float.toString(list.get(7).getPtos()));
			v9.setText(Float.toString(list.get(8).getPtos()));
			v10.setText(Float.toString(list.get(9).getPtos()));
			v11.setText(Float.toString(list.get(10).getPtos()));
			v12.setText(Float.toString(list.get(11).getPtos()));
			v13.setText(Float.toString(list.get(12).getPtos()));
			v14.setText(Float.toString(list.get(13).getPtos()));
			v15.setText(Float.toString(list.get(14).getPtos()));
			v16.setText(Float.toString(list.get(15).getPtos()));
			v17.setText(Float.toString(list.get(16).getPtos()));
			v18.setText(Float.toString(list.get(17).getPtos()));
			v19.setText(Float.toString(list.get(18).getPtos()));
			v20.setText(Float.toString(list.get(19).getPtos()));
			v21.setText(list.get(0).getNombre());
			v22.setText(list.get(1).getNombre());
			v23.setText(list.get(2).getNombre());
			v24.setText(list.get(3).getNombre());
			v25.setText(list.get(4).getNombre());
			v26.setText(list.get(5).getNombre());
			v27.setText(list.get(6).getNombre());
			v28.setText(list.get(7).getNombre());
			v29.setText(list.get(8).getNombre());
			v30.setText(list.get(9).getNombre());
			v31.setText(list.get(10).getNombre());
			v32.setText(list.get(11).getNombre());
			v33.setText(list.get(12).getNombre());
			v34.setText(list.get(13).getNombre());
			v35.setText(list.get(14).getNombre());
			v36.setText(list.get(15).getNombre());
			v37.setText(list.get(16).getNombre());
			v38.setText(list.get(17).getNombre());
			v39.setText(list.get(18).getNombre());
			v40.setText(list.get(19).getNombre());
			el1.setText(liste.get(0).getJug());
			el2.setText(liste.get(1).getJug());
			el3.setText(liste.get(2).getJug());
			el4.setText(liste.get(3).getJug());
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
