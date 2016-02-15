package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Calciofechaj12Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiase9);
		inten=new Intent(this, BBVAfechaj22Activity.class);
		final LinkedList<Premierfechaj1Activity> list= Bundfechaj9Activity.getInstancia().getListDTOMge(getApplicationContext());
		EditText ed=(EditText)findViewById(R.id.rowe9);
		ed.setText(list.get(8).getMgs());
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
