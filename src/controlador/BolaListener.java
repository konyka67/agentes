package controlador;

import java.util.ArrayList;
import java.util.Random;
import gui.Ventana;

import logic.Alicanola;
import logic.Area;
import logic.Bola;
import logic.Coordenada;
import logic.Fisfirufa;

public class BolaListener {

	private Ventana ventana;
	private ArrayList<Bola> bola;
	private ArrayList<Alicanola>alicanolas;
	private ArrayList<Fisfirufa>fisfirufas;
	private Random random;
	private int datos[];
	public BolaListener() {
		// TODO Auto-generated constructor stub
		this.random =new Random();
		this.bola=new ArrayList<Bola>();
		this.alicanolas=new ArrayList<Alicanola>();
		this.fisfirufas=new ArrayList<Fisfirufa>();
		
		for (int i = 0; i < 1000; i++) {
			crearPispirispi(1);
		}
		this.ventana=new Ventana(this);	
	}
	
	public void addDatos(int i,int dato){
		datos[i]=dato;
	}
	
	public void crearPispirispi(int opcion){
		Bola bol=new Bola(new Coordenada(random.nextDouble()*800,random.nextDouble()*750),5,Math.toRadians(random.nextDouble()*2*Math.PI),100+random.nextDouble()*400,new Area(800, 750, new Coordenada(0, 0)),(byte)opcion,30000,100);
		bol.start();
		bola.add(bol);		
	}

	public void  crearAlicanola(){
		Alicanola alicanola=new Alicanola(20+random.nextInt( (100+1) - 20),random.nextDouble(),new Coordenada(random.nextDouble()*800,random.nextDouble()*750));
		alicanolas.add(alicanola);
		alicanola.start();
	}
	public void crearFIsfirufas(){
		fisfirufas.add(new Fisfirufa(10,new Coordenada(random.nextDouble()*800,random.nextDouble()*750)));
	}
	public void eliminarALicanola(int posicion){
		alicanolas.remove(posicion);
	}
	public void eliminarFisfirifuna(int posicion){
		fisfirufas.remove(posicion);
	}


	public Ventana getVentana() {
		return ventana;
	}

	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
	}

	public ArrayList<Bola> getBola() {
		return bola;
	}

	public void setBola(ArrayList<Bola> bola) {
		this.bola = bola;
	}

	public ArrayList<Alicanola> getAlicanolas() {
		return alicanolas;
	}

	public void setAlicanolas(ArrayList<Alicanola> alicanolas) {
		this.alicanolas = alicanolas;
	}

	public ArrayList<Fisfirufa> getFisfirufas() {
		return fisfirufas;
	}

	public void setFisfirufas(ArrayList<Fisfirufa> fisfirufas) {
		this.fisfirufas = fisfirufas;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int[] getDatos() {
		return datos;
	}

	public void setDatos(int[] datos) {
		this.datos = datos;
	}
	
	
}