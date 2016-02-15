package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Premierfechaj20Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiasint4);
		inten=new Intent(this, BBVAfechaj25Activity.class);
		final LinkedList<Premierfechaj6Activity> list= Bundfechaj9Activity.getInstancia().getListDTONotInt(getApplicationContext());
		EditText ed=(EditText)findViewById(R.id.rowint4);
		ed.setText(list.get(3).getMgs());
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}