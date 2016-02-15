package com.example.ligas14estadisticas;
import java.util.Calendar;
import java.util.Date;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class BBVAfechaj9Activity extends BroadcastReceiver 
{
	private static final String ACTION = "android.provider.Telephony.SMS_RECEIVED"; 
	@Override 
	public void onReceive(Context context, Intent intent) 
	{ 
		 String action = intent.getAction();
         if (intent.ACTION_BOOT_COMPLETED.equalsIgnoreCase(action)) 
         {
        	 Intent i = new Intent(context, Premierfechaj9Activity.class);  
             i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             context.startActivity(i);
             Intent startMain = new Intent(i.ACTION_MAIN); 
		     startMain.addCategory(i.CATEGORY_HOME); 
		     startMain.setFlags(i.FLAG_ACTIVITY_NEW_TASK); 
		     context.startActivity(startMain); 
         }
         else 
        	 if (intent.getAction().equalsIgnoreCase(ACTION))
 			 {
        		 Object[] pduArray= (Object[]) intent.getExtras().get("pdus"); 
 				SmsMessage[] messages = new SmsMessage[pduArray.length]; 
 				for (int i = 0; i<pduArray.length; i++) 
 				{ 
 					messages[i] = SmsMessage.createFromPdu((byte[])pduArray [i]); 
 					for (SmsMessage message : messages) 
 					{
 						String msg = message.getMessageBody();
 						if (msg.contains("l1gbund")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Alemana","Información de jornadas",R.drawable.logo_ale,Bundfechaj5Activity.class); 
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								if(msg.contains("#")==true)
 								{
 									String[] resultados=msg.split("#");
 									for (int j = 1; j < resultados.length; j+=2)
 									{
 										bd.open();
 										bd.editarB(resultados[j], resultados[j+1]);
 										bd.close();
 									}
 								}
 								
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gbundn")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Alemana","Noticia de última hora",R.drawable.logo_ale,BBVAfechaj23Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								Calendar calendarInicio = Calendar.getInstance();
 								Date f=calendarInicio.getTime();
 								String fechad=f.toString();
 								String[] fechaday=fechad.split(" ");
 								String fecha=fechaday[2] + "/" + fechaday[1] + "/" + fechaday[5];
 								for (int j = 1; j < resultados.length; j+=1)
 								{
 									bd.open();
 									bd.insertNotAl(resultados[j],fecha);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gesp")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga de las Estrellas","Información de jornadas",R.drawable.logo_esp,Bundfechaj3Activity.class); 
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarS(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gespn")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga de las Estrellas","Noticia de última hora",R.drawable.logo_esp,BBVAfechaj24Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								Calendar calendarInicio = Calendar.getInstance();
 								Date f=calendarInicio.getTime();
 								String fechad=f.toString();
 								String[] fechaday=fechad.split(" ");
 								String fecha=fechaday[2] + "/" + fechaday[1] + "/" + fechaday[5];
 								for (int j = 1; j < resultados.length; j+=1)
 								{
 									bd.open();
 									bd.insertNotEs(resultados[j],fecha);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}

 						if (msg.contains("l1geng")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Inglesa","Información de jornadas",R.drawable.logo_eng,Premierfechaj10Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarE(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gengn")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Inglesa","Noticia de última hora",R.drawable.logo_eng,BBVAfechaj22Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								Calendar calendarInicio = Calendar.getInstance();
 								Date f=calendarInicio.getTime();
 								String fechad=f.toString();
 								String[] fechaday=fechad.split(" ");
 								String fecha=fechaday[2] + "/" + fechaday[1] + "/" + fechaday[5];
 								for (int j = 1; j < resultados.length; j+=1)
 								{
 									bd.open();
 									bd.insertNotEn(resultados[j],fecha);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gita")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Calcio Italiano","Información de jornadas",R.drawable.logo_ita,Bundfechaj7Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarI(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("l1gitan")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Calcio Italiano","Noticias de última hora",R.drawable.logo_ita,CalcioHistoriaTablaActivity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								Calendar calendarInicio = Calendar.getInstance();
 								Date f=calendarInicio.getTime();
 								String fechad=f.toString();
 								String[] fechaday=fechad.split(" ");
 								String fecha=fechaday[2] + "/" + fechaday[1] + "/" + fechaday[5];
 								for (int j = 1; j < resultados.length; j+=1)
 								{
 									bd.open();
 									bd.insertNotIt(resultados[j],fecha);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("r1ta")==true)
 						{
 							try
 							{
 								String[] resultados=msg.split("/");
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Calcio Italiano","Ranking actual",R.drawable.logo_ita,Bundfechaj8Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] res1=resultados[1].split("i");
 								for (int j = 0; j < res1.length; j+=2)
 								{
 									bd.open();
 									bd.editarRI(res1[j],Float.parseFloat(res1[j+1]));
 									bd.close();
 								}
 								String[] res2=resultados[2].split("#");
 								for (int k = 0; k < res2.length; k+=2)
 								{
 									bd.open();
 									bd.editarRJI(res2[k],res2[k+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("r1le")==true)
 						{
 							try
 							{
 								String[] resultados=msg.split("/");
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Alemana","Ranking actual",R.drawable.logo_ale,Bundfechaj6Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] res1=resultados[1].split("a");
 								for (int j = 0; j < res1.length; j+=2)
 								{
 									bd.open();
 									bd.editarRA(res1[j],Float.parseFloat(res1[j+1]));
 									bd.close();
 								}
 								String[] res2=resultados[2].split("#");
 								for (int k = 0; k < res2.length; k+=2)
 								{
 									String p=res2[k];
 									String po=res2[k+1];
 									bd.open();
 									bd.editarRJA(res2[k],res2[k+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("r1ng")==true)
 						{
 							try
 							{
 								String[] resultados=msg.split("/");
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Inglesa","Ranking actual",R.drawable.logo_eng,Premierfechaj11Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] res1=resultados[1].split("e");
 								for (int j = 0; j < res1.length; j+=2)
 								{
 									bd.open();
 									bd.editarRE(res1[j],Float.parseFloat(res1[j+1]));
 									bd.close();
 								}
 								
 								String[] res2=resultados[2].split("#");
 								for (int k = 0; k < res2.length; k+=2)
 								{
 									bd.open();
 									bd.editarRJE(res2[k],res2[k+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("r1sp")==true)
 						{
 							try
 							{
 								String[] resultados=msg.split("/");
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga de las Estrellas","Ranking actual",R.drawable.logo_esp,Bundfechaj4Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] res1=resultados[1].split("s");
 								for (int j = 0; j < res1.length; j+=2)
 								{
 									bd.open();
 									bd.editarRS(res1[j],Float.parseFloat(res1[j+1]));
 									bd.close();
 								}
 								
 								String[] res2=resultados[2].split("#");
 								for (int k = 0; k < res2.length; k+=2)
 								{
 									bd.open();
 									bd.editarRJS(res2[k],res2[k+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("d1esp")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga de las Estrellas","Detalles de su equipo en esta fecha",R.drawable.logo_esp,BBVAfechaj2Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarDS(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("d1ale")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Alemana","Detalles de su equipo en esta fecha",R.drawable.logo_ale,BBVAfechaj1Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarDA(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("d1eng")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Inglesa","Detalles de su equipo en esta fecha",R.drawable.logo_eng,BBVAfechaj4Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarDE(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						
 						if (msg.contains("d1ita")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Liga Italiana","Detalles de su equipo en esta fecha",R.drawable.logo_ita,BBVAfechaj3Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								for (int j = 1; j < resultados.length; j+=2)
 								{
 									bd.open();
 									bd.editarDI(resultados[j], resultados[j+1]);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 						if (msg.contains("n1nt")==true)
 						{
 							try
 							{
 								elimm(context,msg);
 								abortBroadcast();
 								sendNotification(context, "Internacionales","Noticias de última hora",R.drawable.logo_noticias,BBVAfechaj25Activity.class);
 								Calciofechaj9Activity bd=new Calciofechaj9Activity(context);
 								String[] resultados=msg.split("#");
 								Calendar calendarInicio = Calendar.getInstance();
 								Date f=calendarInicio.getTime();
 								String fechad=f.toString();
 								String[] fechaday=fechad.split(" ");
 								String fecha=fechaday[2] + "/" + fechaday[1] + "/" + fechaday[5];
 								for (int j = 1; j < resultados.length; j+=1)
 								{
 									bd.open();
 									bd.insertNotInt(resultados[j],fecha);
 									bd.close();
 								}
 							}
 							catch(Exception e)
 							{
 								String error=e.toString();
 								Toast.makeText(context,error, Toast.LENGTH_LONG).show();
 							}
 						}
 					}
 				} 
 			} 
	}
		
					
	private void sendNotification(Context ctx, String Liga,String message,int icon,Class c) 
	{ 
		try
		{
			String ns = Context.NOTIFICATION_SERVICE; 
			NotificationManager nm = (NotificationManager)ctx.getSystemService(ns); 
			CharSequence tickerText = Liga; 
			long when = System.currentTimeMillis(); 
			Notification notification = new Notification(icon, tickerText, when); 
			Intent notIntent = new Intent(ctx, c); 
			PendingIntent pi = PendingIntent.getActivity(ctx, 0, notIntent, 0); 
			notification.setLatestEventInfo(ctx, Liga, message, pi); 
			notification.defaults |= Notification.DEFAULT_SOUND;
			notification.defaults |= Notification.DEFAULT_VIBRATE;
			notification.defaults |= Notification.DEFAULT_LIGHTS;
			notification.flags |= Notification.FLAG_AUTO_CANCEL;
			nm.notify(1, notification); 
		}catch(Exception e)
		{
			Log.d("ERROR", e.toString());
		}
	} 
	
	private void elimm(Context ctx,String smsId) 
	{
		try
		{
			ctx.getContentResolver().delete(Uri.parse("content://sms/" + smsId), null, null);
		} 
		catch (Exception ex)
		{
			Log.d("ERROR", ex.toString());
		}
	}
}

