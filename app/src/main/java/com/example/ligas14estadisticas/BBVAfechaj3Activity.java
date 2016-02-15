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

public class BBVAfechaj3Activity extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dt_calcio_jornadas);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		inten=new Intent(this, Calciofechaj8Activity.class);



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
			View rootView = inflater.inflate(R.layout.detita_f1,
					container, false);
			Button btnplay1=(Button)rootView.findViewById(R.id.btnitad1);
			Button btnplay2=(Button)rootView.findViewById(R.id.btnitad2);
			Button btnplay3=(Button)rootView.findViewById(R.id.btnitad3);
			Button btnplay4=(Button)rootView.findViewById(R.id.btnitad4);
			Button btnplay5=(Button)rootView.findViewById(R.id.btnitad5);
			Button btnplay6=(Button)rootView.findViewById(R.id.btnitad6);
			Button btnplay7=(Button)rootView.findViewById(R.id.btnitad7);
			Button btnplay8=(Button)rootView.findViewById(R.id.btnitad8);
			Button btnplay9=(Button)rootView.findViewById(R.id.btnitad9);
			Button btnplay10=(Button)rootView.findViewById(R.id.btnitad10);
			Button btnplay11=(Button)rootView.findViewById(R.id.btnitad11);
			Button btnplay12=(Button)rootView.findViewById(R.id.btnitad12);
			Button btnplay13=(Button)rootView.findViewById(R.id.btnitad13);
			Button btnplay14=(Button)rootView.findViewById(R.id.btnitad14);
			Button btnplay15=(Button)rootView.findViewById(R.id.btnitad15);
			Button btnplay16=(Button)rootView.findViewById(R.id.btnitad16);


			btnplay1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad1Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay2.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad2Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay3.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad3Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay4.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad4Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay5.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad5Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay6.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad6Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay7.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad7Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay8.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad8Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay9.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad9Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay10.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad10Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay11.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad11Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay12.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad12Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay13.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad13Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay14.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad14Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay15.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad15Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay16.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad16Activity.class);
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
			View rootView = inflater.inflate(R.layout.detita_f2,
					container, false);
			Button btnplay17=(Button)rootView.findViewById(R.id.btnitad17);
			Button btnplay18=(Button)rootView.findViewById(R.id.btnitad18);
			Button btnplay19=(Button)rootView.findViewById(R.id.btnitad19);
			Button btnplay20=(Button)rootView.findViewById(R.id.btnitad20);
			Button btnplay21=(Button)rootView.findViewById(R.id.btnitad21);
			Button btnplay22=(Button)rootView.findViewById(R.id.btnitad22);
			Button btnplay23=(Button)rootView.findViewById(R.id.btnitad23);
			Button btnplay24=(Button)rootView.findViewById(R.id.btnitad24);
			Button btnplay25=(Button)rootView.findViewById(R.id.btnitad25);
			Button btnplay26=(Button)rootView.findViewById(R.id.btnitad26);
			Button btnplay27=(Button)rootView.findViewById(R.id.btnitad27);
			Button btnplay28=(Button)rootView.findViewById(R.id.btnitad28);
			Button btnplay29=(Button)rootView.findViewById(R.id.btnitad29);
			Button btnplay30=(Button)rootView.findViewById(R.id.btnitad30);
			Button btnplay31=(Button)rootView.findViewById(R.id.btnitad31);
			Button btnplay32=(Button)rootView.findViewById(R.id.btnitad32);
			Button btnplay33=(Button)rootView.findViewById(R.id.btnitad33);
			Button btnplay34=(Button)rootView.findViewById(R.id.btnitad34);
			Button btnplay35=(Button)rootView.findViewById(R.id.btnitad35);
			Button btnplay36=(Button)rootView.findViewById(R.id.btnitad36);
			Button btnplay37=(Button)rootView.findViewById(R.id.btnitad37);
			Button btnplay38=(Button)rootView.findViewById(R.id.btnitad38);
			
			btnplay17.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad17Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay18.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad18Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay19.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay20.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad20Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay21.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad21Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay22.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad22Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay23.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad23Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay24.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad24Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay25.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad25Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay26.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad26Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay27.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad27Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay28.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad28Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay29.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad29Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay30.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad30Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay31.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad31Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay32.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad32Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay33.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad33Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay34.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad34Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay35.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad35Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay36.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad36Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay37.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad37Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay38.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Calciofechad38Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			return rootView;
		}
	}



}
