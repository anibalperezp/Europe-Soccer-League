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

public class Bundfechaj5Activity extends FragmentActivity {
	
	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private Intent inten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bundes_jornadas);
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
				fragment =new FragmentoAEstad1();
			}else
				if(position==1){
				fragment =new FragmentoAEstad2();
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

	public static class FragmentoAEstad1 extends Fragment {
        
		public FragmentoAEstad1() {}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.bundes_jornadas_fragment1,
					container, false);
			Button btnplay1=(Button)rootView.findViewById(R.id.btnalej1);
			Button btnplay2=(Button)rootView.findViewById(R.id.btnalej2);
			Button btnplay3=(Button)rootView.findViewById(R.id.btnalej3);
			Button btnplay4=(Button)rootView.findViewById(R.id.btnalej4);
			Button btnplay5=(Button)rootView.findViewById(R.id.btnalej5);
			Button btnplay6=(Button)rootView.findViewById(R.id.btnalej6);
			Button btnplay7=(Button)rootView.findViewById(R.id.btnalej7);
			Button btnplay8=(Button)rootView.findViewById(R.id.btnalej8);
			Button btnplay9=(Button)rootView.findViewById(R.id.btnalej9);
			Button btnplay10=(Button)rootView.findViewById(R.id.btnalej10);
			Button btnplay11=(Button)rootView.findViewById(R.id.btnalej11);
			Button btnplay12=(Button)rootView.findViewById(R.id.btnalej12);
			Button btnplay13=(Button)rootView.findViewById(R.id.btnalej13);
			Button btnplay14=(Button)rootView.findViewById(R.id.btnalej14);
			Button btnplay15=(Button)rootView.findViewById(R.id.btnalej15);
			Button btnplay16=(Button)rootView.findViewById(R.id.btnalej16);
			Button btnplay17=(Button)rootView.findViewById(R.id.btnalej17);
			
			btnplay1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha1Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay2.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha2Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay3.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha3Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay4.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha4Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay5.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha5Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay6.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha6Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay7.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha7Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay8.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha8Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay9.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha9Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay10.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha10Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay11.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha11Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay12.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha12Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay13.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha13Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay14.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha14Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay15.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha15Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay16.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha16Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay17.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha17Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			return rootView;
		}
	}
	
	public static class FragmentoAEstad2 extends Fragment {

		public FragmentoAEstad2() {}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.bundes_jornadas_fragment2,
					container, false);
			
			Button btnplay18=(Button)rootView.findViewById(R.id.btnalej18);
			Button btnplay19=(Button)rootView.findViewById(R.id.btnalej19);
			Button btnplay20=(Button)rootView.findViewById(R.id.btnalej20);
			Button btnplay21=(Button)rootView.findViewById(R.id.btnalej21);
			Button btnplay22=(Button)rootView.findViewById(R.id.btnalej22);
			Button btnplay23=(Button)rootView.findViewById(R.id.btnalej23);
			Button btnplay24=(Button)rootView.findViewById(R.id.btnalej24);
			Button btnplay25=(Button)rootView.findViewById(R.id.btnalej25);
			Button btnplay26=(Button)rootView.findViewById(R.id.btnalej26);
			Button btnplay27=(Button)rootView.findViewById(R.id.btnalej27);
			Button btnplay28=(Button)rootView.findViewById(R.id.btnalej28);
			Button btnplay29=(Button)rootView.findViewById(R.id.btnalej29);
			Button btnplay30=(Button)rootView.findViewById(R.id.btnalej30);
			Button btnplay31=(Button)rootView.findViewById(R.id.btnalej31);
			Button btnplay32=(Button)rootView.findViewById(R.id.btnalej32);
			Button btnplay33=(Button)rootView.findViewById(R.id.btnalej33);
			Button btnplay34=(Button)rootView.findViewById(R.id.btnalej34);
			
			btnplay18.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha18Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay19.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay20.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha20Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay21.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha21Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay22.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha22Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay23.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha23Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay24.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha24Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay25.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha25Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});

			btnplay26.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha26Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay27.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha27Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay28.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha28Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay29.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha29Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay30.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha30Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay31.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha31Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay32.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha32Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay33.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha33Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			btnplay34.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					arg0.setBackgroundResource(R.drawable.btnj2);
					Intent myIntent =new Intent(arg0.getContext(), Bundfecha34Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			return rootView;
		}
	}

	
	
}
