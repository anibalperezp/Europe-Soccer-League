package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.EditText;

public class Premierfechaj17Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiasa10);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		inten=new Intent(this, BBVAfechaj23Activity.class);
		final LinkedList<Calciofechaj10Activity> list= Bundfechaj9Activity.getInstancia().getListDTOMga(getApplicationContext());
		EditText ed=(EditText)findViewById(R.id.rowa10);
		ed.setText(list.get(9).getMgs());
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
