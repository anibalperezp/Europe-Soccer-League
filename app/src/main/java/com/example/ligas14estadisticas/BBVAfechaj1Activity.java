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

public class BBVAfechaj1Activity extends FragmentActivity
{
	
	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dt_bundes_jornadas);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
		getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		inten=new Intent(this, Bundfechaj10Activity.class);
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class SectionsPagerAdapter extends FragmentPagerAdapter
	{

		public SectionsPagerAdapter(FragmentManager fm)
		{
			super(fm);
		}

		@Override
		public Fragment getItem(int position)
		{
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
		public int getCount() 
		{
			// Show 2 total pages.
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) 
		{
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

	public static class FragmentoEstad1 extends Fragment
	{
		public FragmentoEstad1() {}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.detalem_f1,container, false);
	
		Button btnplay1=(Button)rootView.findViewById(R.id.btnaled1);
		Button btnplay2=(Button)rootView.findViewById(R.id.btnaled2);
		Button btnplay3=(Button)rootView.findViewById(R.id.btnaled3);
		Button btnplay4=(Button)rootView.findViewById(R.id.btnaled4);
		Button btnplay5=(Button)rootView.findViewById(R.id.btnaled5);
		Button btnplay6=(Button)rootView.findViewById(R.id.btnaled6);
		Button btnplay7=(Button)rootView.findViewById(R.id.btnaled7);
		Button btnplay8=(Button)rootView.findViewById(R.id.btnaled8);
		Button btnplay9=(Button)rootView.findViewById(R.id.btnaled9);
		Button btnplay10=(Button)rootView.findViewById(R.id.btnaled10);
		Button btnplay11=(Button)rootView.findViewById(R.id.btnaled11);
		Button btnplay12=(Button)rootView.findViewById(R.id.btnaled12);
		Button btnplay13=(Button)rootView.findViewById(R.id.btnaled13);
		Button btnplay14=(Button)rootView.findViewById(R.id.btnaled14);
		Button btnplay15=(Button)rootView.findViewById(R.id.btnaled15);
		Button btnplay16=(Button)rootView.findViewById(R.id.btnaled16);
		Button btnplay17=(Button)rootView.findViewById(R.id.btnaled17);
		
	
		btnplay1.setOnClickListener(new OnClickListener() 
		{
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad1Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay2.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad2Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay3.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad3Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay4.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad4Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay5.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad5Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay6.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad6Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay7.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad7Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay8.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad8Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay9.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad9Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay10.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad10Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay11.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad11Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay12.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad12Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay13.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad13Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay14.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad14Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay15.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad15Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		btnplay16.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad16Activity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		btnplay17.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.setBackgroundResource(R.drawable.btnj2);
				Intent myIntent =new Intent(arg0.getContext(), Bundfechad17Activity.class);
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
			View rootView = inflater.inflate(R.layout.detalem_f2,
					container, false);
			
			Button btnplay18=(Button)rootView.findViewById(R.id.btnaled18);
			Button btnplay19=(Button)rootView.findViewById(R.id.btnaled19);
			Button btnplay20=(Button)rootView.findViewById(R.id.btnaled20);
			Button btnplay21=(Button)rootView.findViewById(R.id.btnaled21);
			Button btnplay22=(Button)rootView.findViewById(R.id.btnaled22);
			Button btnplay23=(Button)rootView.findViewById(R.id.btnaled23);
			Button btnplay24=(Button)rootView.findViewById(R.id.btnaled24);
			Button btnplay25=(Button)rootView.findViewById(R.id.btnaled25);
			Button btnplay26=(Button)rootView.findViewById(R.id.btnaled26);
			Button btnplay27=(Button)rootView.findViewById(R.id.btnaled27);
			Button btnplay28=(Button)rootView.findViewById(R.id.btnaled28);
			Button btnplay29=(Button)rootView.findViewById(R.id.btnaled29);
			Button btnplay30=(Button)rootView.findViewById(R.id.btnaled30);
			Button btnplay31=(Button)rootView.findViewById(R.id.btnaled31);
			Button btnplay32=(Button)rootView.findViewById(R.id.btnaled32);
			Button btnplay33=(Button)rootView.findViewById(R.id.btnaled33);
			Button btnplay34=(Button)rootView.findViewById(R.id.btnaled34);

			btnplay18.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad18Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay19.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay20.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad20Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay21.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad21Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay22.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad22Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay23.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad23Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay24.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad24Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay25.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad25Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay26.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad26Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay27.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad27Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay28.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad28Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay29.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad29Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay30.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad30Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay31.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad31Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay32.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad32Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay33.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad33Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay34.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechad34Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			return rootView;
		}
	}
}