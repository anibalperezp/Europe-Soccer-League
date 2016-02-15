package com.example.ligas14estadisticas;

import java.util.Timer;
import java.util.TimerTask;
//import com.example.ligas14estadisticas.Calciofechaj7Activity.MyAnimationRoutine;
//import com.example.ligas14estadisticas.Calciofechaj7Activity.MyAnimationRoutine2;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Premierfechaj15Activity  extends Activity {
	
	private Button dasdasdad,dasddsdadas,dasdsdadadad,dasasdsdada,dassddasad,dassasdad;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.spain);
		inten=new Intent(this, Premierfechaj9Activity.class);
		
		dasdasdad=(Button)findViewById(R.id.btnesp1);
		dasddsdadas=(Button)findViewById(R.id.btnesp2);
		dasdsdadadad=(Button)findViewById(R.id.btnesp3);
		dassddasad=(Button)findViewById(R.id.btnesp4);
		dasasdsdada=(Button)findViewById(R.id.btnesp5);
		dassasdad=(Button)findViewById(R.id.btnesp7);
		/*final ImageView img = (ImageView) findViewById(R.id.imageViewslideresp);
        //img.setBackgroundResource(R.anim.animesp);
        MyAnimationRoutine mar = new MyAnimationRoutine();
        MyAnimationRoutine2 mar2 = new MyAnimationRoutine2();
        Timer t = new Timer(false);
        t.schedule(mar, 100);
        Timer t2 = new Timer(false);
        t2.schedule(mar2, 5000000);*/
		
        dasdasdad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAHistoriaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dasddsdadas.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAEstadisticActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dasdsdadadad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj24Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		
        dasasdsdada.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj3Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dassddasad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj4Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        dassasdad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj2Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
	}

	/*class MyAnimationRoutine extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewslideresp);
			AnimationDrawable frameAnimation = (AnimationDrawable)
					img.getBackground();
			frameAnimation.start();
		}
	}
	class MyAnimationRoutine2 extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewslideresp);
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
