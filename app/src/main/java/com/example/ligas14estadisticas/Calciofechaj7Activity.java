package com.example.ligas14estadisticas;


import java.util.Timer;
import java.util.TimerTask;

//import com.example.ligas14estadisticas.Bundfechaj10Activity.MyAnimationRoutine;
//import com.example.ligas14estadisticas.Bundfechaj10Activity.MyAnimationRoutine2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Calciofechaj7Activity  extends Activity {
	
	private Button fbhsdb,sdfgvbsfddsa,dfgbsdfgs,sdvsdvsdv,dbfsdbsdvb,cxvcvbsdfv;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.england);
		inten=new Intent(this, Premierfechaj9Activity.class);
		
		fbhsdb=(Button)findViewById(R.id.btneng1);
		sdfgvbsfddsa=(Button)findViewById(R.id.btneng2);
		dfgbsdfgs=(Button)findViewById(R.id.btneng3);
		dbfsdbsdvb=(Button)findViewById(R.id.btneng4);
		sdvsdvsdv=(Button)findViewById(R.id.btneng5);
		cxvcvbsdfv=(Button)findViewById(R.id.btneng7);
		/*final ImageView img = (ImageView) findViewById(R.id.imageViewslidereng);
        //img.setBackgroundResource(R.anim.animeng);
        MyAnimationRoutine mar = new MyAnimationRoutine();
        MyAnimationRoutine2 mar2 = new MyAnimationRoutine2();
        Timer t = new Timer(false);
        t.schedule(mar, 100);
        Timer t2 = new Timer(false);
        t2.schedule(mar2, 5000000);*/
		
        fbhsdb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), PremierHistoriaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        sdfgvbsfddsa.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), PremierEstadisticActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dfgbsdfgs.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj22Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		
        sdvsdvsdv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj10Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dbfsdbsdvb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Premierfechaj11Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        cxvcvbsdfv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj4Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
	}

	/*class MyAnimationRoutine extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewslidereng);
			AnimationDrawable frameAnimation = (AnimationDrawable)
					img.getBackground();
			frameAnimation.start();
		}
	}
	class MyAnimationRoutine2 extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewslidereng);
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
