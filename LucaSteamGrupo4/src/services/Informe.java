package services;

import model.Generos;
import model.Juego;
import model.Plataformas;

import java.util.HashMap;

/**
 * Informe / Clase para realizar listas de juegos, filtradas o no
 * @author  Daniel
 * @version 1.1
 * 10-11-2022
 */


public class Informe{
	public static void leerJuego(Juego j){
		System.out.println("-------------------");
		System.out.println(j.getNombre()+".");
		System.out.println("Rango "+j.getRank()+".");
		System.out.println("Plataforma: "+j.getPlataforma()+".");
		System.out.println("Año de publicación: "+j.getAnnosalida()+".");
		System.out.println("Genero: "+j.getGenero()+".");
		System.out.println("Publicador: "+j.getPublisher()+".\n");
	}
	
	public static void leerLista(HashMap<Integer,Juego> lista){
		if(lista.size()==0)
			System.out.println("Lista vacía");
		else
			for(Juego j: lista.values())
				leerJuego(j);
	}
	
	public static void nintendo(HashMap<Integer,Juego> coleccion){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()=="nintendo"){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public static void sigloxx(HashMap<Integer,Juego> coleccion){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()<2001){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public static void publicadora(HashMap<Integer,Juego> coleccion,String pub){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPublisher()==pub){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public static void anno(HashMap<Integer,Juego> coleccion,int ann){
		HashMap<Integer,Juego> nin=new HashMap<>();
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getAnnosalida()==ann){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    }
	
	public static boolean plataforma(HashMap<Integer,Juego> coleccion,String p){
		HashMap<Integer,Juego> nin=new HashMap<>();
		Plataformas j;
    	try{
    		j=Plataformas.valueOf(p);
    	}
    	catch(Exception e){
    		leerLista(nin);
    		return false; // Fuerza la salida del programa si da error.
    	}
    	int l=coleccion.size();
    	int q=1;
    	for(int a=0; a<l; a++)
    		if(coleccion.get(a).getPlataforma()==j){
    			nin.put(q,coleccion.get(a));
    			q++;
    		}
    	leerLista(nin);
    	return true;
    }
	
	public static boolean genero(HashMap<Integer,Juego> coleccion,String g){
		HashMap<Integer,Juego> nin=new HashMap<>();
		Generos generoParaFiltrar;
    	try {
    		generoParaFiltrar=Juego.getGenero(g);
    	}
    	catch(Exception e) {
    		leerLista(nin);
    		return false;
    	}
    	int q=1;
    	for(Juego juego : coleccion.values()) {
    		if(juego.getGenero()==generoParaFiltrar){
    			nin.put(q,juego);
    			q++;
    		}
    	}
    		
    	leerLista(nin);
    	return true;
    }
}
