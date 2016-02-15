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

public class Calciofechaj8Activity  extends Activity {
	
	private Button lhlhklhj,adfgsdbhd,yhktghn,rhgdsgfwsf,wgfsdfsdf,sdfsadfsafd;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.italia);
		inten=new Intent(this, Premierfechaj9Activity.class);
		
		lhlhklhj=(Button)findViewById(R.id.btnita1);
		adfgsdbhd=(Button)findViewById(R.id.btnita2);
		yhktghn=(Button)findViewById(R.id.btnita3);
		rhgdsgfwsf=(Button)findViewById(R.id.btnita4);
		wgfsdfsdf=(Button)findViewById(R.id.btnita5);
		sdfsadfsafd=(Button)findViewById(R.id.btnita7);
		/*final ImageView img = (ImageView) findViewById(R.id.imageViewsliderita);
        //img.setBackgroundResource(R.anim.animita);
        MyAnimationRoutine mar = new MyAnimationRoutine();
        MyAnimationRoutine2 mar2 = new MyAnimationRoutine2();
        Timer t = new Timer(false);
        t.schedule(mar, 100);
        Timer t2 = new Timer(false);
        t2.schedule(mar2, 5000000);*/
		
        lhlhklhj.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), CalcioHistoriaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        adfgsdbhd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), CalcioEstadisticActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        yhktghn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), CalcioHistoriaTablaActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		
        wgfsdfsdf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj7Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        rhgdsgfwsf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechaj8Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
        sdfsadfsafd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj1);
				Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj3Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
	}
	
	/*class MyAnimationRoutine extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewsliderita);
			AnimationDrawable frameAnimation = (AnimationDrawable)
					img.getBackground();
			frameAnimation.start();
		}
	}
	class MyAnimationRoutine2 extends TimerTask {
		@Override
		public void run() {
			ImageView img = (ImageView) findViewById(R.id.imageViewsliderita);
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
