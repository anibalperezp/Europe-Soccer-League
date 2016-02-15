package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.EditText;

public class Bundfechaj15Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiasa6);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		inten=new Intent(this, BBVAfechaj23Activity.class);
		final LinkedList<Calciofechaj10Activity> list= Bundfechaj9Activity.getInstancia().getListDTOMga(getApplicationContext());
		EditText ed=(EditText)findViewById(R.id.rowa6);
		ed.setText(list.get(5).getMgs());
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
