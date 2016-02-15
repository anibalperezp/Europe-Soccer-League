package com.example.ligas14estadisticas;


import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Bundfechaj10Activity  extends Activity {
	
	private Button savcsdv,ergsgsdgsdg,sdvsfs,dfgdgdgd,dgsdgsdgsdg,sdavsdvsd;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.alemania);
		inten=new Intent(this, Premierfechaj9Activity.class);
		savcsdv=(Button)findViewById(R.id.btnale1);
		ergsgsdgsdg=(Button)findViewById(R.id.btnale2);
		sdvsfs=(Button)findViewById(R.id.btnale3);
		dgsdgsdgsdg=(Button)findViewById(R.id.btnale4);
		dfgdgdgd=(Button)findViewById(R.id.btnale5);
		sdavsdvsd=(Button)findViewById(R.id.btnale7);
		/*final ImageView img = (ImageView) findViewById(R.id.imageViewsliderale);
        //img.setBackgroundResource(R.anim.animale);
        MyAnimationRoutine mar = new MyAnimationRoutine();
        MyAnimationRoutine2 mar2 = new MyAnimationRoutine2();
        Timer t = new Timer(false);
        t.schedule(mar, 100);
        Timer t2 = new Timer(false);
        t2.schedule(mar2, 5000000);*/
		
        savcsdv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BundesHistoriaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        ergsgsdgsdg.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BundesEstadisticActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        sdvsfs.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj23Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		
        dfgdgdgd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj5Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dgsdgsdgsdg.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj6Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        sdavsdvsd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj1Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
	}
	
	/*class MyAnimationRoutine extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewsliderale);
			AnimationDrawable frameAnimation = (AnimationDrawable)
					img.getBackground();
			frameAnimation.start();
		}
	}
	class MyAnimationRoutine2 extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewsliderale);
			AnimationDrawable frameAnimation = (AnimationDrawable)
					img.getBackground();
			frameAnimation.stop();
		}
	}*/

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}
