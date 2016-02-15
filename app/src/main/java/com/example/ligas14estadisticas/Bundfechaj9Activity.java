package com.example.ligas14estadisticas;

import java.util.LinkedList;

import android.content.Context;

public class Bundfechaj9Activity {
	
	private static Calciofechaj9Activity eq;
	
	private static Bundfechaj9Activity instancia=new Bundfechaj9Activity();

	private Bundfechaj9Activity()
	{
	}

	public static Bundfechaj9Activity getInstancia()
	{
		return instancia;
	}
	
    public LinkedList<BBVAfechaj8Activity> getListDTOBund(Context c)
	{
    	eq=new Calciofechaj9Activity(c);
    	LinkedList<BBVAfechaj8Activity> listDTO=new LinkedList<BBVAfechaj8Activity>();
    	eq.open();
		listDTO=eq.obtenerBund();
		eq.close();
		return listDTO;
	}
    
    public LinkedList<Premierfechaj4Activity> getListDTOEng(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj4Activity> listDTO=new LinkedList<Premierfechaj4Activity>();
       	eq.open();
   		listDTO=eq.obtenerEng();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<BBVAfechaj10Activity> getListDTOEsp(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<BBVAfechaj10Activity> listDTO=new LinkedList<BBVAfechaj10Activity>();
       	eq.open();
   		listDTO=eq.obtenerEsp();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Calciofechaj1Activity> getListDTOIta(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj1Activity> listDTO=new LinkedList<Calciofechaj1Activity>();
       	eq.open();
   		listDTO=eq.obtenerIta();
   		eq.close();
   		return listDTO;
   	}
    
    
    public LinkedList<Calciofechaj5Activity> getListDTORIta(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj5Activity> listDTO=new LinkedList<Calciofechaj5Activity>();
       	eq.open();
   		listDTO=eq.obtenerRIta();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Calciofechaj2Activity> getListDTORAle(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj2Activity> listDTO=new LinkedList<Calciofechaj2Activity>();
       	eq.open();
   		listDTO=eq.obtenerRAle();
   		eq.close();
   		return listDTO;
   	}
    
    
    public LinkedList<Calciofechaj4Activity> getListDTOREsp(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj4Activity> listDTO=new LinkedList<Calciofechaj4Activity>();
       	eq.open();
   		listDTO=eq.obtenerREsp();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Calciofechaj3Activity> getListDTOREng(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj3Activity> listDTO=new LinkedList<Calciofechaj3Activity>();
       	eq.open();
   		listDTO=eq.obtenerREng();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj1Activity> getListDTOMge(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj1Activity> listDTO=new LinkedList<Premierfechaj1Activity>();
       	eq.open();
   		listDTO=eq.obtenerMge();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Calciofechaj10Activity> getListDTOMga(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj10Activity> listDTO=new LinkedList<Calciofechaj10Activity>();
       	eq.open();
   		listDTO=eq.obtenerMga();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj3Activity> getListDTOMgs(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj3Activity> listDTO=new LinkedList<Premierfechaj3Activity>();
       	eq.open();
   		listDTO=eq.obtenerMgs();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj2Activity> getListDTOMgi(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj2Activity> listDTO=new LinkedList<Premierfechaj2Activity>();
       	eq.open();
   		listDTO=eq.obtenerMgi();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<BBVAfechaj6Activity> getListDTODte(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<BBVAfechaj6Activity> listDTO=new LinkedList<BBVAfechaj6Activity>();
       	eq.open();
   		listDTO=eq.obtenerDete();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<BBVAfechaj5Activity> getListDTODta(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<BBVAfechaj5Activity> listDTO=new LinkedList<BBVAfechaj5Activity>();
       	eq.open();
   		listDTO=eq.obtenerDeta();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Calciofechaj6Activity> getListDTODts(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Calciofechaj6Activity> listDTO=new LinkedList<Calciofechaj6Activity>();
       	eq.open();
   		listDTO=eq.obtenerDets();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<BBVAfechaj7Activity> getListDTODti(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<BBVAfechaj7Activity> listDTO=new LinkedList<BBVAfechaj7Activity>();
       	eq.open();
   		listDTO=eq.obtenerDeti();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj6Activity> getListDTONotInt(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj6Activity> listDTO=new LinkedList<Premierfechaj6Activity>();
       	eq.open();
   		listDTO=eq.obtenerNotInt();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj8Activity> getListDTORja(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj8Activity> listDTO=new LinkedList<Premierfechaj8Activity>();
       	eq.open();
   		listDTO=eq.obtenerRankJA();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj12Activity> getListDTORje(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj12Activity> listDTO=new LinkedList<Premierfechaj12Activity>();
       	eq.open();
   		listDTO=eq.obtenerRankJE();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj13Activity> getListDTORji(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj13Activity> listDTO=new LinkedList<Premierfechaj13Activity>();
       	eq.open();
   		listDTO=eq.obtenerRankJI();
   		eq.close();
   		return listDTO;
   	}
    
    public LinkedList<Premierfechaj14Activity> getListDTORjs(Context c)
   	{
       	eq=new Calciofechaj9Activity(c);
       	LinkedList<Premierfechaj14Activity> listDTO=new LinkedList<Premierfechaj14Activity>();
       	eq.open();
   		listDTO=eq.obtenerRankJS();
   		eq.close();
   		return listDTO;
   	}
    
    //********************************************************
    
    public static LinkedList<Calciofechaj5Activity> ordenI(LinkedList<Calciofechaj5Activity> list)
    {
    	LinkedList<Calciofechaj5Activity> listnew=new LinkedList<Calciofechaj5Activity>();
    	int n=list.size();
		for(int i=0;i<n-1;i++)
		{
		 	for(int j=0;j<n-1;j++)
		 	{
				if(list.get(j).getPtos() < list.get(j+1).getPtos())
				{	Calciofechaj5Activity tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
		 	}
		}
		listnew=list;
		return listnew;
	}
    
    public static LinkedList<Calciofechaj2Activity> ordenA(LinkedList<Calciofechaj2Activity> list)
    {
    	LinkedList<Calciofechaj2Activity> listnew=new LinkedList<Calciofechaj2Activity>();
    	int n=list.size();
		for(int i=0;i<n-1;i++)
		{
		 	for(int j=0;j<n-1;j++)
		 	{
				if(list.get(j).getPtos() < list.get(j+1).getPtos())
				{	Calciofechaj2Activity tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
		 	}
		}
		listnew=list;
		return listnew;
	}
    
    public static LinkedList<Calciofechaj4Activity> ordenS(LinkedList<Calciofechaj4Activity> list)
    {
    	LinkedList<Calciofechaj4Activity> listnew=new LinkedList<Calciofechaj4Activity>();
    	int n=list.size();
		for(int i=0;i<n-1;i++)
		{
		 	for(int j=0;j<n-1;j++)
		 	{
				if(list.get(j).getPtos() < list.get(j+1).getPtos())
				{	Calciofechaj4Activity tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
		 	}
		}
		listnew=list;
		return listnew;
	}
    
    public static LinkedList<Calciofechaj3Activity> ordenE(LinkedList<Calciofechaj3Activity> list)
    {
    	LinkedList<Calciofechaj3Activity> listnew=new LinkedList<Calciofechaj3Activity>();
    	int n=list.size();
		for(int i=0;i<n-1;i++)
		{
		 	for(int j=0;j<n-1;j++)
		 	{
				if(list.get(j).getPtos() < list.get(j+1).getPtos())
				{	Calciofechaj3Activity tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
		 	}
		}
		listnew=list;
		return listnew;
	}
    
    
    //**************************************************************************
    
    public LinkedList<Calciofechaj5Activity> ordenIR(Context c)
    {
    	LinkedList<Calciofechaj5Activity> lo= getListDTORIta(c);
    	LinkedList<Calciofechaj5Activity> ordenada=ordenI(lo);
    	return ordenada;
    }
    
    public LinkedList<Calciofechaj2Activity> ordenAR(Context c)
    {
    	LinkedList<Calciofechaj2Activity> lo= getListDTORAle(c);
    	LinkedList<Calciofechaj2Activity> ordenada=ordenA(lo);
    	return ordenada;
    }
    
    public LinkedList<Calciofechaj4Activity> ordenSR(Context c)
    {
    	LinkedList<Calciofechaj4Activity> lo= getListDTOREsp(c);
    	LinkedList<Calciofechaj4Activity> ordenada=ordenS(lo);
    	return ordenada;
    }
    
    public LinkedList<Calciofechaj3Activity> ordenER(Context c)
    {
    	LinkedList<Calciofechaj3Activity> lo= getListDTOREng(c);
    	LinkedList<Calciofechaj3Activity> ordenada=ordenE(lo);
    	return ordenada;
    }
}
