package com.example.ligas14estadisticas;

import java.util.Locale;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bundfechaj3Activity extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bbva_jornadas);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		inten=new Intent(this, Premierfechaj15Activity.class);



	}

	public void onBackPressed() 
	{
		inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(new Intent(inten));	
		this.finish();
		return;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = null;
			if(position==0){
				fragment =new FragmentoEstad1();
			}else
				if(position==1){
					fragment =new FragmentoEstad2();
				}
			return fragment;  
		}

		@Override
		public int getCount() {
			// Show 2 total pages.
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.j1).toUpperCase(l);
			case 1:
				return getString(R.string.j2).toUpperCase(l);

			}
			return null;
		}
	}

	public static class FragmentoEstad1 extends Fragment {

		public FragmentoEstad1() {}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.bbva_jornadas_fragment1,
					container, false);
			Button btnplay1=(Button)rootView.findViewById(R.id.btnespj1);
			Button btnplay2=(Button)rootView.findViewById(R.id.btnespj2);
			Button btnplay3=(Button)rootView.findViewById(R.id.btnespj3);
			Button btnplay4=(Button)rootView.findViewById(R.id.btnespj4);
			Button btnplay5=(Button)rootView.findViewById(R.id.btnespj5);
			Button btnplay6=(Button)rootView.findViewById(R.id.btnespj6);
			Button btnplay7=(Button)rootView.findViewById(R.id.btnespj7);
			Button btnplay8=(Button)rootView.findViewById(R.id.btnespj8);
			Button btnplay9=(Button)rootView.findViewById(R.id.btnespj9);
			Button btnplay10=(Button)rootView.findViewById(R.id.btnespj10);
			Button btnplay11=(Button)rootView.findViewById(R.id.btnespj11);
			Button btnplay12=(Button)rootView.findViewById(R.id.btnespj12);
			Button btnplay13=(Button)rootView.findViewById(R.id.btnespj13);
			Button btnplay14=(Button)rootView.findViewById(R.id.btnespj14);
			Button btnplay15=(Button)rootView.findViewById(R.id.btnespj15);
			Button btnplay16=(Button)rootView.findViewById(R.id.btnespj16);


			btnplay1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha1Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay2.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha2Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay3.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha3Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay4.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha4Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay5.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha5Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay6.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha6Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay7.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha7Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay8.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha8Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay9.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha9Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay10.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha10Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay11.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha11Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay12.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha12Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay13.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha13Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay14.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha14Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay15.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha15Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay16.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha16Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			
			return rootView;
		}
	}

	public static class FragmentoEstad2 extends Fragment {

		public FragmentoEstad2() {}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.bbva_jornadas_fragment2,
					container, false);
			Button btnplay17=(Button)rootView.findViewById(R.id.btnespj17);
			Button btnplay18=(Button)rootView.findViewById(R.id.btnespj18);
			Button btnplay19=(Button)rootView.findViewById(R.id.btnespj19);
			Button btnplay20=(Button)rootView.findViewById(R.id.btnespj20);
			Button btnplay21=(Button)rootView.findViewById(R.id.btnespj21);
			Button btnplay22=(Button)rootView.findViewById(R.id.btnespj22);
			Button btnplay23=(Button)rootView.findViewById(R.id.btnespj23);
			Button btnplay24=(Button)rootView.findViewById(R.id.btnespj24);
			Button btnplay25=(Button)rootView.findViewById(R.id.btnespj25);
			Button btnplay26=(Button)rootView.findViewById(R.id.btnespj26);
			Button btnplay27=(Button)rootView.findViewById(R.id.btnespj27);
			Button btnplay28=(Button)rootView.findViewById(R.id.btnespj28);
			Button btnplay29=(Button)rootView.findViewById(R.id.btnespj29);
			Button btnplay30=(Button)rootView.findViewById(R.id.btnespj30);
			Button btnplay31=(Button)rootView.findViewById(R.id.btnespj31);
			Button btnplay32=(Button)rootView.findViewById(R.id.btnespj32);
			Button btnplay33=(Button)rootView.findViewById(R.id.btnespj33);
			Button btnplay34=(Button)rootView.findViewById(R.id.btnespj34);
			Button btnplay35=(Button)rootView.findViewById(R.id.btnespj35);
			Button btnplay36=(Button)rootView.findViewById(R.id.btnespj36);
			Button btnplay37=(Button)rootView.findViewById(R.id.btnespj37);
			Button btnplay38=(Button)rootView.findViewById(R.id.btnespj38);
			
			btnplay17.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha17Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay18.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha18Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay19.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay20.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha20Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay21.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha21Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay22.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha22Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay23.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha23Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay24.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha24Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay25.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha25Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay26.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha26Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay27.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha27Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay28.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha28Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay29.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha29Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay30.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha30Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay31.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha31Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay32.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha32Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay33.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha33Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay34.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha34Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay35.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha35Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay36.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha36Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay37.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha37Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay38.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfecha38Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			return rootView;
		}
	}



}
