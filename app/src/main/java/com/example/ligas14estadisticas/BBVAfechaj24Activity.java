package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class BBVAfechaj24Activity extends Activity {
	
	private Intent inten;
	@Override 
	public void onCreate(Bundle bundle)
	{ 
		super.onCreate(bundle);
        setContentView(R.layout.noticiaesp);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView v1=(TextView)findViewById(R.id.spo1);
		TextView v2=(TextView)findViewById(R.id.spo2);
		TextView v3=(TextView)findViewById(R.id.spo3);
		TextView v4=(TextView)findViewById(R.id.spo4);
		TextView v5=(TextView)findViewById(R.id.spo5);
		TextView v6=(TextView)findViewById(R.id.spo6);
		TextView v7=(TextView)findViewById(R.id.spo7);
		TextView v8=(TextView)findViewById(R.id.spo8);
		TextView v9=(TextView)findViewById(R.id.spo9);
		TextView v10=(TextView)findViewById(R.id.spo10);
		
		TextView f1=(TextView)findViewById(R.id.fechaspo1);
		TextView f2=(TextView)findViewById(R.id.fechaspo2);
		TextView f3=(TextView)findViewById(R.id.fechaspo3);
		TextView f4=(TextView)findViewById(R.id.fechaspo4);
		TextView f5=(TextView)findViewById(R.id.fechaspo5);
		TextView f6=(TextView)findViewById(R.id.fechaspo6);
		TextView f7=(TextView)findViewById(R.id.fechaspo7);
		TextView f8=(TextView)findViewById(R.id.fechaspo8);
		TextView f9=(TextView)findViewById(R.id.fechaspo9);
		TextView f10=(TextView)findViewById(R.id.fechaspo10);
		
		final Button b1=(Button)findViewById(R.id.btnspj1);
		final Button b2=(Button)findViewById(R.id.btnspj2);
		final Button b3=(Button)findViewById(R.id.btnspj3);
		final Button b4=(Button)findViewById(R.id.btnspj4);
		final Button b5=(Button)findViewById(R.id.btnspj5);
		final Button b6=(Button)findViewById(R.id.btnspj6);
		final Button b7=(Button)findViewById(R.id.btnspj7);
		final Button b8=(Button)findViewById(R.id.btnspj8);
		final Button b9=(Button)findViewById(R.id.btnspj9);
		final Button b10=(Button)findViewById(R.id.btnspj10);
		
		b1.setVisibility(-1);
		b2.setVisibility(-1);
		b3.setVisibility(-1);
		b4.setVisibility(-1);
		b5.setVisibility(-1);
		b6.setVisibility(-1);
		b7.setVisibility(-1);
		b8.setVisibility(-1);
		b9.setVisibility(-1);
		b10.setVisibility(-1);
		
		final Button bimg1=(Button)findViewById(R.id.buttonspo1);
		final Button bimg2=(Button)findViewById(R.id.buttonspo2);
		final Button bimg3=(Button)findViewById(R.id.buttonspo3);
		final Button bimg4=(Button)findViewById(R.id.buttonspo4);
		final Button bimg5=(Button)findViewById(R.id.buttonspo5);
		final Button bimg6=(Button)findViewById(R.id.buttonspo6);
		final Button bimg7=(Button)findViewById(R.id.buttonspo7);
		final Button bimg8=(Button)findViewById(R.id.buttonspo8);
		final Button bimg9=(Button)findViewById(R.id.buttonspo9);
		final Button bimg10=(Button)findViewById(R.id.buttonspo10);
		
		final LinkedList<Premierfechaj3Activity> list= Bundfechaj9Activity.getInstancia().getListDTOMgs(getApplicationContext());
		
		 b1.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View arg0) 
				{
					// TODO Auto-generated method stub
					b1.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj20Activity.class);
					startActivityForResult(myIntent, 0);
					
				}
			});
		 
		 b2.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View arg0) 
				{
					// TODO Auto-generated method stub
					b2.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj21Activity.class);
					startActivityForResult(myIntent, 0);
					
				}
			});
			
			b3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b3.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj22Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			b4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b4.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj23Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			
			b5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b5.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj24Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			b6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b6.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj25Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			b7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b7.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			b8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b8.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj20Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			
			b9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b9.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), BBVAfechaj21Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
			b10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					b10.setBackgroundResource(R.drawable.btnj1);
					Intent myIntent =new Intent(arg0.getContext(), Bundfechaj19Activity.class);
					startActivityForResult(myIntent, 0);
				}
			});
			
		
		if(list.size()!=0)
		{
			String r1=" ";
			String r2=" ";
			String r3=" ";
			String r4=" ";
			String r5=" ";
			String r6=" ";
			String r7=" ";
			String r8=" ";
			String r9=" ";
			String r10=" ";
			
			String[] resultados1=list.get(0).getMgs().split(" ");
			String[] resultados2=list.get(1).getMgs().split(" ");
			String[] resultados3=list.get(2).getMgs().split(" ");
			String[] resultados4=list.get(3).getMgs().split(" ");
			String[] resultados5=list.get(4).getMgs().split(" ");
			String[] resultados6=list.get(5).getMgs().split(" ");
			String[] resultados7=list.get(6).getMgs().split(" ");
			String[] resultados8=list.get(7).getMgs().split(" ");
			String[] resultados9=list.get(8).getMgs().split(" ");
			String[] resultados10=list.get(9).getMgs().split(" ");
			if(resultados1.length!=0)
			{
				bimg1.setBackgroundResource(R.drawable.logo_noticias);
				b1.setVisibility(0);
				r1=resultados1[0] + " " + resultados1[1] + " " + resultados1[2] + " " + resultados1[3] + "...";
				f1.setText(list.get(0).getFecha());
				
				if(list.get(0).getMgs().contains("ficha") || list.get(0).getMgs().contains("fichaje") || list.get(0).getMgs().contains("cierra negociación") || list.get(0).getMgs().contains("oferta"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(0).getMgs().contains("lesiona") || list.get(0).getMgs().contains("de baja") || list.get(0).getMgs().contains("lesión"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(0).getMgs().contains("listo") || list.get(0).getMgs().contains("de alta"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(0).getMgs().contains("sancionado") || list.get(0).getMgs().contains("sanción"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(0).getMgs().contains("cumple") || list.get(0).getMgs().contains("cumplen") || list.get(0).getMgs().contains("cumpleaños"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(0).getMgs().contains("Campeón") || list.get(0).getMgs().contains("record") || list.get(0).getMgs().contains("trofeo") || list.get(0).getMgs().contains("título") || list.get(0).getMgs().contains("premio") || list.get(0).getMgs().contains("pichichi"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(0).getMgs().contains("rumor") || list.get(0).getMgs().contains("rumorea") || list.get(0).getMgs().contains("rumores"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(0).getMgs().contains("Champions"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(0).getMgs().contains("APPSports"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(0).getMgs().contains("selecciones") || list.get(0).getMgs().contains("fecha fifa"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(0).getMgs().contains("conferencia") || list.get(0).getMgs().contains("rueda de prensa") || list.get(0).getMgs().contains("comentarios"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(0).getMgs().contains("pospuesto") || list.get(0).getMgs().contains("se pospone"))
				{
					bimg1.setBackgroundResource(R.drawable.logo_posp);
				}
				
			}
			
			if(resultados2.length!=0)
			{
				bimg2.setBackgroundResource(R.drawable.logo_noticias);
				b2.setVisibility(0);
				r2=resultados2[0] + " " + resultados2[1] + " " + resultados2[2] + " " + resultados2[3] + "...";
				f2.setText(list.get(1).getFecha());
				
				if(list.get(1).getMgs().contains("ficha") || list.get(1).getMgs().contains("fichaje") || list.get(1).getMgs().contains("cierra negociación") || list.get(1).getMgs().contains("oferta"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(1).getMgs().contains("lesiona") || list.get(1).getMgs().contains("de baja") || list.get(1).getMgs().contains("lesión"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(1).getMgs().contains("listo") || list.get(1).getMgs().contains("de alta"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(1).getMgs().contains("sancionado") || list.get(1).getMgs().contains("sanción"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(1).getMgs().contains("cumple") || list.get(1).getMgs().contains("cumplen") || list.get(1).getMgs().contains("cumpleaños"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(1).getMgs().contains("Campeón") || list.get(1).getMgs().contains("record") || list.get(1).getMgs().contains("trofeo") || list.get(1).getMgs().contains("título") || list.get(1).getMgs().contains("premio") || list.get(1).getMgs().contains("pichichi"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(1).getMgs().contains("rumor") || list.get(1).getMgs().contains("rumorea") || list.get(1).getMgs().contains("rumores"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(1).getMgs().contains("Champions"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(1).getMgs().contains("APPSports"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(1).getMgs().contains("selecciones") || list.get(1).getMgs().contains("fecha fifa"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(1).getMgs().contains("conferencia") || list.get(1).getMgs().contains("rueda de prensa") || list.get(1).getMgs().contains("comentarios"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(1).getMgs().contains("pospuesto") || list.get(1).getMgs().contains("se pospone"))
				{
					bimg2.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados3.length!=0)
			{
				bimg3.setBackgroundResource(R.drawable.logo_noticias);
				b3.setVisibility(0);
				r3=resultados3[0] + " " + resultados3[1] + " " + resultados3[2] + " " + resultados3[3] + "...";
				f3.setText(list.get(2).getFecha());
				
				if(list.get(2).getMgs().contains("ficha") || list.get(2).getMgs().contains("fichaje") || list.get(2).getMgs().contains("cierra negociación") || list.get(2).getMgs().contains("oferta"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(2).getMgs().contains("lesiona") || list.get(2).getMgs().contains("de baja") || list.get(2).getMgs().contains("lesión"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(2).getMgs().contains("listo") || list.get(2).getMgs().contains("de alta"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(2).getMgs().contains("sancionado") || list.get(2).getMgs().contains("sanción"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(2).getMgs().contains("cumple") || list.get(2).getMgs().contains("cumplen") || list.get(2).getMgs().contains("cumpleaños"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(2).getMgs().contains("Campeón") || list.get(2).getMgs().contains("record") || list.get(2).getMgs().contains("trofeo") || list.get(2).getMgs().contains("título") || list.get(2).getMgs().contains("premio") || list.get(2).getMgs().contains("pichichi"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(2).getMgs().contains("rumor") || list.get(2).getMgs().contains("rumorea") || list.get(2).getMgs().contains("rumores"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(2).getMgs().contains("Champions"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(2).getMgs().contains("APPSports"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(2).getMgs().contains("selecciones") || list.get(2).getMgs().contains("fecha fifa"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(2).getMgs().contains("conferencia") || list.get(2).getMgs().contains("rueda de prensa") || list.get(2).getMgs().contains("comentarios"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(2).getMgs().contains("pospuesto") || list.get(2).getMgs().contains("se pospone"))
				{
					bimg3.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados4.length!=0)
			{
				bimg4.setBackgroundResource(R.drawable.logo_noticias);
				b4.setVisibility(0);
				r4=resultados4[0] + " " + resultados4[1] + " " + resultados4[2] + " " + resultados4[3] + "...";
				f4.setText(list.get(3).getFecha());
				if(list.get(3).getMgs().contains("ficha") || list.get(3).getMgs().contains("fichaje") || list.get(3).getMgs().contains("cierra negociación") || list.get(3).getMgs().contains("oferta"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(3).getMgs().contains("lesiona") || list.get(3).getMgs().contains("de baja") || list.get(3).getMgs().contains("lesión"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(3).getMgs().contains("listo") || list.get(3).getMgs().contains("de alta"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(3).getMgs().contains("sancionado") || list.get(3).getMgs().contains("sanción"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(3).getMgs().contains("cumple") || list.get(3).getMgs().contains("cumplen") || list.get(3).getMgs().contains("cumpleaños"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(3).getMgs().contains("Campeón") || list.get(3).getMgs().contains("record") || list.get(3).getMgs().contains("trofeo") || list.get(3).getMgs().contains("título") || list.get(3).getMgs().contains("premio") || list.get(3).getMgs().contains("pichichi"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(3).getMgs().contains("rumor") || list.get(3).getMgs().contains("rumorea") || list.get(3).getMgs().contains("rumores"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(3).getMgs().contains("Champions"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(3).getMgs().contains("APPSports"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(3).getMgs().contains("selecciones") || list.get(3).getMgs().contains("fecha fifa"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(3).getMgs().contains("conferencia") || list.get(3).getMgs().contains("rueda de prensa") || list.get(3).getMgs().contains("comentarios"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(3).getMgs().contains("pospuesto") || list.get(3).getMgs().contains("se pospone"))
				{
					bimg4.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados5.length!=0)
			{
				bimg5.setBackgroundResource(R.drawable.logo_noticias);
				b5.setVisibility(0);
				r5=resultados5[0] + " " + resultados5[1]+ " " +resultados5[2]+ " " +resultados5[3] + "...";
				f5.setText(list.get(4).getFecha());
				
				if(list.get(4).getMgs().contains("ficha") || list.get(4).getMgs().contains("fichaje") || list.get(4).getMgs().contains("cierra negociación") || list.get(4).getMgs().contains("oferta"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(4).getMgs().contains("lesiona") || list.get(4).getMgs().contains("de baja") || list.get(4).getMgs().contains("lesión"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(4).getMgs().contains("listo") || list.get(4).getMgs().contains("de alta"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(4).getMgs().contains("sancionado") || list.get(4).getMgs().contains("sanción"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(4).getMgs().contains("cumple") || list.get(4).getMgs().contains("cumplen") || list.get(4).getMgs().contains("cumpleaños"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(4).getMgs().contains("Campeón") || list.get(4).getMgs().contains("record") || list.get(4).getMgs().contains("trofeo") || list.get(4).getMgs().contains("título") || list.get(4).getMgs().contains("premio") || list.get(4).getMgs().contains("pichichi"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(4).getMgs().contains("rumor") || list.get(4).getMgs().contains("rumorea") || list.get(4).getMgs().contains("rumores"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(4).getMgs().contains("Champions"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(4).getMgs().contains("APPSports"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(4).getMgs().contains("selecciones") || list.get(4).getMgs().contains("fecha fifa"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(4).getMgs().contains("conferencia") || list.get(4).getMgs().contains("rueda de prensa") || list.get(4).getMgs().contains("comentarios"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(4).getMgs().contains("pospuesto") || list.get(4).getMgs().contains("se pospone"))
				{
					bimg5.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados6.length!=0)
			{
				bimg6.setBackgroundResource(R.drawable.logo_noticias);
				b6.setVisibility(0);
				r6=resultados6[0] + " " + resultados6[1]+ " " +resultados6[2]+ " " +resultados6[3] + "...";
				f6.setText(list.get(5).getFecha());
				
				if(list.get(5).getMgs().contains("ficha") || list.get(5).getMgs().contains("fichaje") || list.get(5).getMgs().contains("cierra negociación") || list.get(5).getMgs().contains("oferta"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(5).getMgs().contains("lesiona") || list.get(5).getMgs().contains("de baja") || list.get(5).getMgs().contains("lesión"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(5).getMgs().contains("listo") || list.get(5).getMgs().contains("de alta"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(5).getMgs().contains("sancionado") || list.get(5).getMgs().contains("sanción"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(5).getMgs().contains("cumple") || list.get(5).getMgs().contains("cumplen") || list.get(5).getMgs().contains("cumpleaños"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(5).getMgs().contains("Campeón") || list.get(5).getMgs().contains("record") || list.get(5).getMgs().contains("trofeo") || list.get(5).getMgs().contains("título") || list.get(5).getMgs().contains("premio") || list.get(5).getMgs().contains("pichichi"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(5).getMgs().contains("rumor") || list.get(5).getMgs().contains("rumorea") || list.get(5).getMgs().contains("rumores"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(5).getMgs().contains("Champions"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(5).getMgs().contains("APPSports"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(5).getMgs().contains("selecciones") || list.get(5).getMgs().contains("fecha fifa"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(5).getMgs().contains("conferencia") || list.get(5).getMgs().contains("rueda de prensa") || list.get(5).getMgs().contains("comentarios"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(5).getMgs().contains("pospuesto") || list.get(5).getMgs().contains("se pospone"))
				{
					bimg6.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados7.length!=0)
			{
				bimg7.setBackgroundResource(R.drawable.logo_noticias);
				b7.setVisibility(0);
				r7=resultados7[0]+ " " + resultados7[1]+ " " +resultados7[2]+ " " +resultados7[3] + "...";
				f7.setText(list.get(6).getFecha());
				
				if(list.get(6).getMgs().contains("ficha") || list.get(6).getMgs().contains("fichaje") || list.get(6).getMgs().contains("cierra negociación") || list.get(6).getMgs().contains("oferta"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(6).getMgs().contains("lesiona") || list.get(6).getMgs().contains("de baja") || list.get(6).getMgs().contains("lesión"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(6).getMgs().contains("listo") || list.get(6).getMgs().contains("de alta"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(6).getMgs().contains("sancionado") || list.get(6).getMgs().contains("sanción"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(6).getMgs().contains("cumple") || list.get(6).getMgs().contains("cumplen") || list.get(6).getMgs().contains("cumpleaños"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(6).getMgs().contains("Campeón") || list.get(6).getMgs().contains("record") || list.get(6).getMgs().contains("trofeo") || list.get(6).getMgs().contains("título") || list.get(6).getMgs().contains("premio") || list.get(6).getMgs().contains("pichichi"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(6).getMgs().contains("rumor") || list.get(6).getMgs().contains("rumorea") || list.get(6).getMgs().contains("rumores"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(6).getMgs().contains("Champions"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(6).getMgs().contains("APPSports"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(6).getMgs().contains("selecciones") || list.get(6).getMgs().contains("fecha fifa"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(6).getMgs().contains("conferencia") || list.get(6).getMgs().contains("rueda de prensa") || list.get(6).getMgs().contains("comentarios"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(6).getMgs().contains("pospuesto") || list.get(6).getMgs().contains("se pospone"))
				{
					bimg7.setBackgroundResource(R.drawable.logo_posp);
				}
				
			}
			if(resultados8.length!=0)
			{
				bimg8.setBackgroundResource(R.drawable.logo_noticias);
				b8.setVisibility(0);
				r8=resultados8[0] + " " + resultados8[1]+ " " +resultados8[2]+ " " +resultados8[3] + "...";
				f8.setText(list.get(7).getFecha());
				
				if(list.get(7).getMgs().contains("ficha") || list.get(7).getMgs().contains("fichaje") || list.get(7).getMgs().contains("cierra negociación") || list.get(7).getMgs().contains("oferta"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(7).getMgs().contains("lesiona") || list.get(7).getMgs().contains("de baja") || list.get(7).getMgs().contains("lesión"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(7).getMgs().contains("listo") || list.get(7).getMgs().contains("de alta"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(7).getMgs().contains("sancionado") || list.get(7).getMgs().contains("sanción"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(7).getMgs().contains("cumple") || list.get(7).getMgs().contains("cumplen") || list.get(7).getMgs().contains("cumpleaños"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(7).getMgs().contains("Campeón") || list.get(7).getMgs().contains("record") || list.get(7).getMgs().contains("trofeo") || list.get(7).getMgs().contains("título") || list.get(7).getMgs().contains("premio") || list.get(7).getMgs().contains("pichichi"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(7).getMgs().contains("rumor") || list.get(7).getMgs().contains("rumorea") || list.get(7).getMgs().contains("rumores"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(7).getMgs().contains("Champions"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(07).getMgs().contains("APPSports"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(7).getMgs().contains("selecciones") || list.get(7).getMgs().contains("fecha fifa"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(7).getMgs().contains("conferencia") || list.get(7).getMgs().contains("rueda de prensa") || list.get(7).getMgs().contains("comentarios"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(7).getMgs().contains("pospuesto") || list.get(7).getMgs().contains("se pospone"))
				{
					bimg8.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados9.length!=0)
			{
				bimg9.setBackgroundResource(R.drawable.logo_noticias);
				b9.setVisibility(0);
				r9=resultados9[0]+ " " + resultados9[1]+ " " +resultados9[2]+ " " +resultados9[3] + "...";
				f9.setText(list.get(8).getFecha());
				
				if(list.get(8).getMgs().contains("ficha") || list.get(8).getMgs().contains("fichaje") || list.get(8).getMgs().contains("cierra negociación") || list.get(8).getMgs().contains("oferta"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(8).getMgs().contains("lesiona") || list.get(8).getMgs().contains("de baja") || list.get(8).getMgs().contains("lesión"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(8).getMgs().contains("listo") || list.get(8).getMgs().contains("de alta"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(8).getMgs().contains("sancionado") || list.get(8).getMgs().contains("sanción"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(8).getMgs().contains("cumple") || list.get(8).getMgs().contains("cumplen") || list.get(8).getMgs().contains("cumpleaños"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(8).getMgs().contains("Campeón") || list.get(8).getMgs().contains("record") || list.get(8).getMgs().contains("trofeo") || list.get(8).getMgs().contains("título") || list.get(8).getMgs().contains("premio") || list.get(8).getMgs().contains("pichichi"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(8).getMgs().contains("rumor") || list.get(8).getMgs().contains("rumorea") || list.get(8).getMgs().contains("rumores"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(8).getMgs().contains("Champions"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(8).getMgs().contains("APPSports"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(8).getMgs().contains("selecciones") || list.get(8).getMgs().contains("fecha fifa"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(8).getMgs().contains("conferencia") || list.get(8).getMgs().contains("rueda de prensa") || list.get(8).getMgs().contains("comentarios"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(8).getMgs().contains("pospuesto") || list.get(8).getMgs().contains("se pospone"))
				{
					bimg9.setBackgroundResource(R.drawable.logo_posp);
				}
			}
			
			if(resultados10.length!=0)
			{
				bimg10.setBackgroundResource(R.drawable.logo_noticias);
				b10.setVisibility(0);
				r10=resultados10[0]+ " " + resultados10[1]+ " " +resultados10[2]+ " " +resultados10[3] + "...";
				f10.setText(list.get(9).getFecha());
				
				if(list.get(9).getMgs().contains("ficha") || list.get(9).getMgs().contains("fichaje") || list.get(9).getMgs().contains("cierra negociación") || list.get(9).getMgs().contains("oferta"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_tras);
				}
				
				if(list.get(9).getMgs().contains("lesiona") || list.get(9).getMgs().contains("de baja") || list.get(9).getMgs().contains("lesión"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_lesion);
				}
				
				if(list.get(9).getMgs().contains("listo") || list.get(9).getMgs().contains("de alta"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_altas);
				}
				
				if(list.get(9).getMgs().contains("sancionado") || list.get(9).getMgs().contains("sanción"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_sancion);
				}
				
				if(list.get(9).getMgs().contains("cumple") || list.get(9).getMgs().contains("cumplen") || list.get(9).getMgs().contains("cumpleaños"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_ok);
				}
				
				if(list.get(9).getMgs().contains("Campeón") || list.get(9).getMgs().contains("record") || list.get(9).getMgs().contains("trofeo") || list.get(9).getMgs().contains("título") || list.get(9).getMgs().contains("premio") || list.get(9).getMgs().contains("pichichi"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_premio);
				}
				
				if(list.get(9).getMgs().contains("rumor") || list.get(9).getMgs().contains("rumorea") || list.get(9).getMgs().contains("rumores"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_rumores);
				}
				
				if(list.get(9).getMgs().contains("Champions"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_champions);
				}
				
				if(list.get(9).getMgs().contains("APPSports"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_appsport);
				}
				
				if(list.get(9).getMgs().contains("selecciones") || list.get(9).getMgs().contains("fecha fifa"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_fifa);
				}
				
				if(list.get(9).getMgs().contains("conferencia") || list.get(9).getMgs().contains("rueda de prensa") || list.get(9).getMgs().contains("comentarios"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_comentario);
				}
				
				if(list.get(9).getMgs().contains("pospuesto") || list.get(9).getMgs().contains("se pospone"))
				{
					bimg10.setBackgroundResource(R.drawable.logo_posp);
				}
			}

			
			//******************************
			v1.setText(r1);
			v2.setText(r2);
			v3.setText(r3);
			v4.setText(r4);
			v5.setText(r5);
			v6.setText(r6);
			v7.setText(r7);
			v8.setText(r8);
			v9.setText(r9);
			v10.setText(r10);
		}
		else
			if(list.size()==0)
			{
				Log.d("Error", "No se ha cargado la Base de Dtos");
			}
		inten=new Intent(this, Premierfechaj15Activity.class);
	}

	public void onBackPressed() 
	{
	   inten.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   startActivity(new Intent(inten));	
	   this.finish();
	   return;
	}
}

