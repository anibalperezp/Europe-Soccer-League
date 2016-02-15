package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Calciofechaj18Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiasi5);
		inten=new Intent(this, BBVAfechaj24Activity.class);
		final LinkedList<Premierfechaj2Activity> list= Bundfechaj9Activity.getInstancia().getListDTOMgi(getApplicationContext());
		EditText ed=(EditText)findViewById(R.id.rowi5);
		ed.setText(list.get(4).getMgs());
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
