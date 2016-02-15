package com.example.ligas14estadisticas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class Calciofechaj9Activity extends SQLiteOpenHelper{

	private static String DB_PATH = "/data/data/com.example.ligas14estadisticas/databases/";
	private static String DB_NAME = "ligas.db"; 
	private final static String N_TABLAB = "equipobund";
	private final static String N_TABLAS = "equipoesp";
	private final static String N_TABLAE = "equipoeng";
	private final static String N_TABLAI = "equipoita";
	private final static String N_TABLARI = "rankita";
	private final static String N_TABLARS = "rankesp";
	private final static String N_TABLARE = "rankeng";
	private final static String N_TABLARA = "rankale";
	private final static String N_TABLARJI = "rankjugita";
	private final static String N_TABLARJS = "rankjugesp";
	private final static String N_TABLARJE = "rankjugeng";
	private final static String N_TABLARJA = "rankjugale";
	public final static String N_TABLANOTE="noteng";
	public final static String N_TABLANOTS="notesp";
	public final static String N_TABLANOTI="notita";
	public final static String N_TABLANOTA="notale";
	public final static String N_TABLADETE="deteng";
	public final static String N_TABLANDETS="detesp";
	public final static String N_TABLADETI="detita";
	public final static String N_TABLADETA="detale";
	public final static String N_TABLAINT="notint";
	
	private SQLiteDatabase myDataBase; 
	private final Context myContext;
	
	private final static String ID_Fila="idequipo";
	private final static String ID_GOLES="goles";
	private final static String ID_FilaR="idr";
	private final static String ID_PTOSR="ptos";
	private final static String ID_NOMBRER="nombre";
	private final static String ID_BANDERA="bandera";
	public final static String ID_NOTICENG="idmeng";
	public final static String ID_NOTICALE="idmale";
	public final static String ID_NOTICESP="idmesp";
	public final static String ID_NOTICITA="idmita";
	public final static String ID_NOTICINT="idint";
	public final static String ID_MENENG="mensaje";
	public final static String ID_FECHA="fecha";
	public final static String ID_DETDESC="detallpartido";
	public final static String ID_J="idj";
	public final static String ID_JUG="jug";

	public Calciofechaj9Activity(Context context) {
		super(context, DB_NAME, null, 1);
		this.myContext = context;
	}

	private boolean checkDataBase(){
		SQLiteDatabase checkDB = null;
		try{ 
			String myPath = DB_PATH + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);

		}catch(SQLiteException e){ 
		}
		if(checkDB != null){
			checkDB.close();
		}
		return checkDB != null ? true : false;
	}

	private void copyDataBase() throws IOException{
		InputStream myInput = myContext.getAssets().open(DB_NAME);

		String outFileName = DB_PATH + DB_NAME;

		OutputStream myOutput = new FileOutputStream(outFileName);

		byte[] buffer = new byte[1024];
		int length;
		while ((length = myInput.read(buffer))>0){
			myOutput.write(buffer, 0, length);
		}

		myOutput.flush();
		myOutput.close();
		myInput.close();
	}

	public void createDataBase() throws IOException{ 
		boolean dbExist = checkDataBase();

		if(dbExist){
		}else{
			this.getReadableDatabase();

			try { 
				copyDataBase(); 
			}catch (IOException e) {
				throw new Error("Error copiando Base de Datos");
			}
		} 
	}

	public void open() throws SQLException{ 
		if(myDataBase==null || (!(myDataBase.isOpen())) ){ 
			try {
				createDataBase();  
			} catch (IOException e) {
				throw new Error("Ha sido imposible crear la Base de Datos");
			}
			String myPath = DB_PATH + DB_NAME;
			myDataBase = SQLiteDatabase.openDatabase(myPath, null,SQLiteDatabase.OPEN_READWRITE);
		}
	}
	
	public void close(){
		myDataBase.close(); 
	}

	public LinkedList<BBVAfechaj8Activity> obtenerBund() throws SQLException
	{
		LinkedList<BBVAfechaj8Activity> list=new LinkedList<BBVAfechaj8Activity>();
		String[] columnas=new String[]{ID_Fila,ID_GOLES};
		Cursor c=myDataBase.query(N_TABLAB, columnas, null,null, null, null, null);
		int idequipo=c.getColumnIndex(ID_Fila);
		int equipo1=c.getColumnIndex(ID_GOLES);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			BBVAfechaj8Activity dt=new BBVAfechaj8Activity();
			String id=c.getString(idequipo); 
			String eq1=c.getString(equipo1);
			dt.setPartido(id);
			dt.setGoles1(eq1);
			list.add(dt);
		}
		return list;
	}

	public LinkedList<BBVAfechaj10Activity> obtenerEsp() throws SQLException
	{
		LinkedList<BBVAfechaj10Activity> list=new LinkedList<BBVAfechaj10Activity>();
		String[] columnas=new String[]{ID_Fila,ID_GOLES};
		Cursor c=myDataBase.query(N_TABLAS, columnas, null,null, null, null, null);
		int idequipo=c.getColumnIndex(ID_Fila);
		int equipo1=c.getColumnIndex(ID_GOLES);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			BBVAfechaj10Activity dt=new BBVAfechaj10Activity();
			String id=c.getString(idequipo); 
			String eq1=c.getString(equipo1);
			dt.setPartido(id);
			dt.setGoles1(eq1);
			list.add(dt);
		}
		return list;
	}

	public LinkedList<Premierfechaj4Activity> obtenerEng() throws SQLException
	{
		LinkedList<Premierfechaj4Activity> list=new LinkedList<Premierfechaj4Activity>();
		String[] columnas=new String[]{ID_Fila,ID_GOLES};
		Cursor c=myDataBase.query(N_TABLAE, columnas, null,null, null, null, null);
		int idequipo=c.getColumnIndex(ID_Fila);
		int equipo1=c.getColumnIndex(ID_GOLES);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj4Activity dt=new Premierfechaj4Activity();
			String id=c.getString(idequipo); 
			String eq1=c.getString(equipo1);
			dt.setPartido(id);
			dt.setGoles1(eq1);
			list.add(dt);
		}
		return list;
	}

	public LinkedList<Calciofechaj1Activity> obtenerIta() throws SQLException
	{
		LinkedList<Calciofechaj1Activity> list=new LinkedList<Calciofechaj1Activity>();
		String[] columnas=new String[]{ID_Fila,ID_GOLES};
		Cursor c=myDataBase.query(N_TABLAI, columnas, null,null, null, null, null);
		int idequipo=c.getColumnIndex(ID_Fila);
		int equipo1=c.getColumnIndex(ID_GOLES);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj1Activity dt=new Calciofechaj1Activity();
			String id=c.getString(idequipo); 
			String eq1=c.getString(equipo1);
			dt.setPartido(id);
			dt.setGoles1(eq1);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj5Activity> obtenerRIta() throws SQLException
	{
		LinkedList<Calciofechaj5Activity> list=new LinkedList<Calciofechaj5Activity>();
		String[] columnas=new String[]{ID_FilaR,ID_PTOSR,ID_NOMBRER,ID_BANDERA};
		Cursor c=myDataBase.query(N_TABLARI, columnas, null,null, null, null, null);
		int id=c.getColumnIndex("idr");
		int ptos=c.getColumnIndex("ptos");
		int nombre=c.getColumnIndex("nombre");
		int bandera=c.getColumnIndex("bandera");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj5Activity dt=new Calciofechaj5Activity();
			String idr=c.getString(id); 
			float ptosr=c.getFloat(ptos);
			String nombrer=c.getString(nombre);
			int banderar=c.getInt(bandera);
			dt.setId(idr);
			dt.setPtos(ptosr);
			dt.setNombre(nombrer);
			dt.setBandera(banderar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj2Activity> obtenerRAle() throws SQLException
	{
		LinkedList<Calciofechaj2Activity> list=new LinkedList<Calciofechaj2Activity>();
		String[] columnas=new String[]{ID_FilaR,ID_PTOSR,ID_NOMBRER,ID_BANDERA};
		Cursor c=myDataBase.query(N_TABLARA, columnas, null,null, null, null, null);
		int id=c.getColumnIndex("idr");
		int ptos=c.getColumnIndex("ptos");
		int nombre=c.getColumnIndex("nombre");
		int bandera=c.getColumnIndex("bandera");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj2Activity dt=new Calciofechaj2Activity();
			String idr=c.getString(id); 
			float ptosr=c.getFloat(ptos);
			String nombrer=c.getString(nombre);
			int banderar=c.getInt(bandera);
			dt.setId(idr);
			dt.setPtos(ptosr);
			dt.setNombre(nombrer);
			dt.setBandera(banderar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj3Activity> obtenerREng() throws SQLException
	{
		LinkedList<Calciofechaj3Activity> list=new LinkedList<Calciofechaj3Activity>();
		String[] columnas=new String[]{ID_FilaR,ID_PTOSR,ID_NOMBRER,ID_BANDERA};
		Cursor c=myDataBase.query(N_TABLARE, columnas, null,null, null, null, null);
		int id=c.getColumnIndex("idr");
		int ptos=c.getColumnIndex("ptos");
		int nombre=c.getColumnIndex("nombre");
		int bandera=c.getColumnIndex("bandera");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj3Activity dt=new Calciofechaj3Activity();
			String idr=c.getString(id); 
			float ptosr=c.getFloat(ptos);
			String nombrer=c.getString(nombre);
			int banderar=c.getInt(bandera);
			dt.setId(idr);
			dt.setPtos(ptosr);
			dt.setNombre(nombrer);
			dt.setBandera(banderar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj4Activity> obtenerREsp() throws SQLException
	{
		LinkedList<Calciofechaj4Activity> list=new LinkedList<Calciofechaj4Activity>();
		String[] columnas=new String[]{ID_FilaR,ID_PTOSR,ID_NOMBRER,ID_BANDERA};
		Cursor c=myDataBase.query(N_TABLARS, columnas, null,null, null, null, null);
		int id=c.getColumnIndex("idr");
		int ptos=c.getColumnIndex("ptos");
		int nombre=c.getColumnIndex("nombre");
		int bandera=c.getColumnIndex("bandera");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj4Activity dt=new Calciofechaj4Activity();
			String idr=c.getString(id); 
			float ptosr=c.getFloat(ptos);
			String nombrer=c.getString(nombre);
			int banderar=c.getInt(bandera);
			dt.setId(idr);
			dt.setPtos(ptosr);
			dt.setNombre(nombrer);
			dt.setBandera(banderar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj1Activity> obtenerMge() throws SQLException
	{
		LinkedList<Premierfechaj1Activity> list=new LinkedList<Premierfechaj1Activity>();
		String[] columnas=new String[]{ID_NOTICENG,ID_MENENG,ID_FECHA};
		Cursor c=myDataBase.query(N_TABLANOTE, columnas, null,null, null, null, ID_NOTICENG + " DESC ");
		int id=c.getColumnIndex("idmeng");
		int mensaje=c.getColumnIndex("mensaje");
		int fecha=c.getColumnIndex("fecha");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj1Activity dt=new Premierfechaj1Activity();
			int idr=c.getInt(id); 
			String mensajer=c.getString(mensaje);
			String fechar=c.getString(fecha);
			dt.setLig(idr);
			dt.setMgs(mensajer);
			dt.setFecha(fechar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj3Activity> obtenerMgs() throws SQLException
	{
		LinkedList<Premierfechaj3Activity> list=new LinkedList<Premierfechaj3Activity>();
		String[] columnas=new String[]{ID_NOTICESP,ID_MENENG,ID_FECHA};
		Cursor c=myDataBase.query(N_TABLANOTS, columnas, null,null, null, null, ID_NOTICESP + " DESC ");
		int id=c.getColumnIndex("idmesp");
		int mensaje=c.getColumnIndex("mensaje");
		int fecha=c.getColumnIndex("fecha");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj3Activity dt=new Premierfechaj3Activity();
			int idr=c.getInt(id); 
			String mensajer=c.getString(mensaje);
			String fechar=c.getString(fecha);
			dt.setLig(idr);
			dt.setMgs(mensajer);
			dt.setFecha(fechar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj10Activity> obtenerMga() throws SQLException
	{
		LinkedList<Calciofechaj10Activity> list=new LinkedList<Calciofechaj10Activity>();
		String[] columnas=new String[]{ID_NOTICALE,ID_MENENG,ID_FECHA};
		Cursor c=myDataBase.query(N_TABLANOTA, columnas, null,null, null, null, ID_NOTICALE + " DESC ");
		int id=c.getColumnIndex("idmale");
		int mensaje=c.getColumnIndex("mensaje");
		int fecha=c.getColumnIndex("fecha");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj10Activity dt=new Calciofechaj10Activity();
			int idr=c.getInt(id); 
			String mensajer=c.getString(mensaje);
			String fechar=c.getString(fecha);
			dt.setLig(idr);
			dt.setMgs(mensajer);
			dt.setFecha(fechar);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj2Activity> obtenerMgi() throws SQLException
	{
		LinkedList<Premierfechaj2Activity> list=new LinkedList<Premierfechaj2Activity>();
		String[] columnas=new String[]{ID_NOTICITA,ID_MENENG,ID_FECHA};
		Cursor c=myDataBase.query(N_TABLANOTI, columnas, null,null, null, null, ID_NOTICITA + " DESC ");
		int id=c.getColumnIndex("idmita");
		int mensaje=c.getColumnIndex("mensaje");
		int fecha=c.getColumnIndex("fecha");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj2Activity dt=new Premierfechaj2Activity();
			int idr=c.getInt(id); 
			String mensajer=c.getString(mensaje);
			String fechar=c.getString(fecha);
			dt.setLig(idr);
			dt.setMgs(mensajer);
			dt.setFecha(fechar);
			list.add(dt);
		}
		return list;
	}
	
	
	public LinkedList<BBVAfechaj6Activity> obtenerDete() throws SQLException
	{
		LinkedList<BBVAfechaj6Activity> list=new LinkedList<BBVAfechaj6Activity>();
		String[] columnas=new String[]{ID_NOMBRER,ID_DETDESC};
		Cursor c=myDataBase.query(N_TABLADETE, columnas, null,null, null, null, null);
		int nombre=c.getColumnIndex("nombre");
		int detalle=c.getColumnIndex("detallpartido");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			BBVAfechaj6Activity dt=new BBVAfechaj6Activity();
			String nombrer=c.getString(nombre);
			String detaller=c.getString(detalle);
			dt.setNombre(nombrer);
			dt.setDetalle(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<BBVAfechaj5Activity> obtenerDeta() throws SQLException
	{
		LinkedList<BBVAfechaj5Activity> list=new LinkedList<BBVAfechaj5Activity>();
		String[] columnas=new String[]{ID_NOMBRER,ID_DETDESC};
		Cursor c=myDataBase.query(N_TABLADETA, columnas, null,null, null, null, null);
		int nombre=c.getColumnIndex("nombre");
		int detalle=c.getColumnIndex("detallpartido");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			BBVAfechaj5Activity dt=new BBVAfechaj5Activity();
			String nombrer=c.getString(nombre);
			String detaller=c.getString(detalle);
			dt.setNombre(nombrer);
			dt.setDetalle(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<BBVAfechaj7Activity> obtenerDeti() throws SQLException
	{
		LinkedList<BBVAfechaj7Activity> list=new LinkedList<BBVAfechaj7Activity>();
		String[] columnas=new String[]{ID_NOMBRER,ID_DETDESC};
		Cursor c=myDataBase.query(N_TABLADETI, columnas, null,null, null, null, null);
		int nombre=c.getColumnIndex("nombre");
		int detalle=c.getColumnIndex("detallpartido");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			BBVAfechaj7Activity dt=new BBVAfechaj7Activity();
			String nombrer=c.getString(nombre);
			String detaller=c.getString(detalle);
			dt.setNombre(nombrer);
			dt.setDetalle(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Calciofechaj6Activity> obtenerDets() throws SQLException
	{
		LinkedList<Calciofechaj6Activity> list=new LinkedList<Calciofechaj6Activity>();
		String[] columnas=new String[]{ID_NOMBRER,ID_DETDESC};
		Cursor c=myDataBase.query(N_TABLANDETS, columnas, null,null, null, null, null);
		int nombre=c.getColumnIndex("nombre");
		int detalle=c.getColumnIndex("detallpartido");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Calciofechaj6Activity dt=new Calciofechaj6Activity();
			String nombrer=c.getString(nombre);
			String detaller=c.getString(detalle);
			dt.setNombre(nombrer);
			dt.setDetalle(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj14Activity> obtenerRankJS() throws SQLException
	{
		LinkedList<Premierfechaj14Activity> list=new LinkedList<Premierfechaj14Activity>();
		String[] columnas=new String[]{ID_J,ID_JUG};
		Cursor c=myDataBase.query(N_TABLARJS, columnas, null,null, null, null, null);
		int idj=c.getColumnIndex("idj");
		int jug=c.getColumnIndex("jug");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj14Activity dt=new Premierfechaj14Activity();
			String nombrer=c.getString(idj);
			String detaller=c.getString(jug);
			dt.setIdj(nombrer);
			dt.setJug(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj8Activity> obtenerRankJA() throws SQLException
	{
		LinkedList<Premierfechaj8Activity> list=new LinkedList<Premierfechaj8Activity>();
		String[] columnas=new String[]{ID_J,ID_JUG};
		Cursor c=myDataBase.query(N_TABLARJA, columnas, null,null, null, null, null);
		int idj=c.getColumnIndex("idj");
		int jug=c.getColumnIndex("jug");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj8Activity dt=new Premierfechaj8Activity();
			String nombrer=c.getString(idj);
			String detaller=c.getString(jug);
			dt.setIdj(nombrer);
			dt.setJug(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj13Activity> obtenerRankJI() throws SQLException
	{
		LinkedList<Premierfechaj13Activity> list=new LinkedList<Premierfechaj13Activity>();
		String[] columnas=new String[]{ID_J,ID_JUG};
		Cursor c=myDataBase.query(N_TABLARJI, columnas, null,null, null, null, null);
		int idj=c.getColumnIndex("idj");
		int jug=c.getColumnIndex("jug");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj13Activity dt=new Premierfechaj13Activity();
			String nombrer=c.getString(idj);
			String detaller=c.getString(jug);
			dt.setIdj(nombrer);
			dt.setJug(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj12Activity> obtenerRankJE() throws SQLException
	{
		LinkedList<Premierfechaj12Activity> list=new LinkedList<Premierfechaj12Activity>();
		String[] columnas=new String[]{ID_J,ID_JUG};
		Cursor c=myDataBase.query(N_TABLARJE, columnas, null,null, null, null, null);
		int idj=c.getColumnIndex("idj");
		int jug=c.getColumnIndex("jug");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj12Activity dt=new Premierfechaj12Activity();
			String nombrer=c.getString(idj);
			String detaller=c.getString(jug);
			dt.setIdj(nombrer);
			dt.setJug(detaller);
			list.add(dt);
		}
		return list;
	}
	
	public LinkedList<Premierfechaj6Activity> obtenerNotInt() throws SQLException
	{
		LinkedList<Premierfechaj6Activity> list=new LinkedList<Premierfechaj6Activity>();
		String[] columnas=new String[]{ID_NOTICINT,ID_MENENG,ID_FECHA};
		Cursor c=myDataBase.query(N_TABLAINT, columnas, null,null, null, null, ID_NOTICINT + " DESC ");
		int id=c.getColumnIndex("idint");
		int mensaje=c.getColumnIndex("mensaje");
		int fecha=c.getColumnIndex("fecha");
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			Premierfechaj6Activity dt=new Premierfechaj6Activity();
			int idr=c.getInt(id); 
			String mensajer=c.getString(mensaje);
			String fechar=c.getString(fecha);
			dt.setLig(idr);
			dt.setMgs(mensajer);
			dt.setFecha(fechar);
			list.add(dt);
		}
		return list;
	}
	
	public void insertNotEn(String mensaje,String fecha)throws SQLException
	{
		LinkedList<Premierfechaj1Activity> l=obtenerMge();
		ContentValues cv = new ContentValues();
		//cv.put(ID_NOTICENG,l.size()+1);
		cv.put(ID_NOTICENG,l.size()+1);
		cv.put(ID_MENENG,mensaje);
		cv.put(ID_FECHA, fecha);
		myDataBase.insert(N_TABLANOTE, null, cv);
	}
	
	public void insertNotEs(String mensaje,String fecha)
	{
		LinkedList<Premierfechaj3Activity> l=obtenerMgs();
		ContentValues cv = new ContentValues();
		cv.put(ID_NOTICESP,l.size()+1);
		cv.put(ID_MENENG,mensaje);
		cv.put(ID_FECHA, fecha);
		myDataBase.insert(N_TABLANOTS, null, cv);
	}

	public void insertNotAl(String mensaje,String fecha)
	{
		LinkedList<Calciofechaj10Activity> l=obtenerMga();
		ContentValues cv = new ContentValues();
		cv.put(ID_NOTICALE,l.size()+1);
		cv.put(ID_MENENG,mensaje);
		cv.put(ID_FECHA, fecha);
		myDataBase.insert(N_TABLANOTA, null, cv);
	}
	
	public void insertNotIt(String mensaje,String fecha)
	{
		LinkedList<Premierfechaj2Activity> l=obtenerMgi();
		ContentValues cv = new ContentValues();
		cv.put(ID_NOTICITA,l.size()+1);
		cv.put(ID_MENENG,mensaje);
		cv.put(ID_FECHA, fecha);
		myDataBase.insert(N_TABLANOTI, null, cv);
	}
	
	public void insertNotInt(String mensaje,String fecha)
	{
		LinkedList<Premierfechaj6Activity> l=obtenerNotInt();
		ContentValues cv = new ContentValues();
		cv.put(ID_NOTICINT,l.size()+1);
		cv.put(ID_MENENG,mensaje);
		cv.put(ID_FECHA, fecha);
		myDataBase.insert(N_TABLAINT, null, cv);
	}

	public void editarB(String partido, String goles) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put(ID_GOLES, goles);
		myDataBase.update(N_TABLAB, cvEditar,"idequipo=?", new String[] { partido});
	}
	
	public void editarS(String partido, String goles) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put(ID_GOLES, goles);
		myDataBase.update(N_TABLAS, cvEditar,"idequipo=?", new String[] { partido});
	}
	
	public void editarE(String partido, String goles) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put(ID_GOLES, goles);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update(N_TABLAE, cvEditar,"idequipo=?", new String[] { partido});
	}
	
	public void editarI(String partido, String goles) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put(ID_GOLES, goles);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update(N_TABLAI, cvEditar,"idequipo=?", new String[] { partido});
	}
	
	public void editarRA(String idr, float ptos) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("ptos", ptos);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("rankale", cvEditar,"idr=?", new String[] {idr});
	}
	
	public void editarRE(String idr, float ptos) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("ptos", ptos);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("rankeng", cvEditar,"idr=?", new String[] {idr});
	}
	
	public void editarRS(String idr, float ptos) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("ptos", ptos);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("rankesp", cvEditar,"idr=?", new String[] {idr});
	}
	
	public void editarRI(String idr, float ptos) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("ptos", ptos);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("rankita", cvEditar,"idr=?", new String[] {idr});
	}
	
	public void editarDA(String nombre, String detallpartido) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("detallpartido", detallpartido);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("detale", cvEditar,"nombre=?", new String[] {nombre});
	}
	
	public void editarDE(String nombre, String detallpartido) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("detallpartido", detallpartido);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("deteng", cvEditar,"nombre=?", new String[] {nombre});
	}
	
	public void editarDI(String nombre, String detallpartido) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("detallpartido", detallpartido);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("detita", cvEditar,"nombre=?", new String[] {nombre});
	}
	
	public void editarDS(String nombre, String detallpartido) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("detallpartido", detallpartido);
		//nBD.update(N_TABLA, cvEditar, ID_Fila + "=" + partido, null);
		myDataBase.update("detesp", cvEditar,"nombre=?", new String[] {nombre});
	}
	
	public void editarRJA(String idj, String jug) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("jug", jug);
		myDataBase.update("rankjugale", cvEditar,"idj=?", new String[] {idj});
	}
	
	public void editarRJE(String idj, String jug) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("jug", jug);
		myDataBase.update("rankjugeng", cvEditar,"idj=?", new String[] {idj});
	}
	
	public void editarRJS(String idj, String jug) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("jug", jug);
		myDataBase.update("rankjugesp", cvEditar,"idj=?", new String[] {idj});
	}
	
	public void editarRJI(String idj, String jug) throws SQLException
	{
		ContentValues cvEditar=new ContentValues();
		cvEditar.put("jug", jug);
		myDataBase.update("rankjugita", cvEditar,"idj=?", new String[] {idj});
	}
	
	
	public void onCreate(SQLiteDatabase db) {
	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}





