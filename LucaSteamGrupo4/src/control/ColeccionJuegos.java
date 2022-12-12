package control;
import utils.Entrada;

import java.util.List;
import java.util.HashMap;
import model.Plataformas;
import model.Generos;
import model.Juego;


/**
 * Control.ColeccionJuegos / Clase que contiene el menu
 * @author  Daniel, Martin e Ivan
 * @version 2.0
 * 10-11-2022
 */

public class ColeccionJuegos {
	control.CSV csv;
	services.ColeccionJuegos coleccionServices;
	public ColeccionJuegos(){
		csv=new control.CSV();
		coleccionServices=new services.ColeccionJuegos();
	}


	public void menu () {
		boolean continuar = true; //posibilidad de salir del loop
		do {	
		int opcion=0; //la opcion que se elije
		System.out.println("Presiona 1 para hacer una carga incial de juegos");
		System.out.println("Presiona 2 para hacer añadir un juego");
		System.out.println("Presiona 3 para listar una coleccion");
		System.out.println("Presiona 4 para listar los juegos del género 'plataforma'");
		opcion = Entrada.entradaInt();
		if (opcion==1) {
			opcion1();	
		}
		if (opcion==2) {
			opcion2();
		}
		if (opcion==3) {
			opcion3();
		}
		if (opcion==4) {
			opcion4();
		}
		
		//otras opciones
			
		} while (continuar);
	}


	public boolean addJuego(Juego juego) {
		try {
			return coleccionServices.CrearJuego(juego);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//Le pide al CSV que cargue los datos iniciales
	public boolean cargarDatosIniciales() {
		return coleccionServices.addLista( csv.cargaInicialdeDatos() );
	}
	

	
	 public void opcion1() {
		cargarDatosIniciales();
	 }
	 
	 public void opcion2() {
		 System.out.println("Numero de identificacion: ");
		 int rank = Entrada.entradaInt();
		 System.out.println("Nombre del juego: ");
		 String nombre = Entrada.entradaString();
		 System.out.println("Año de salida: ");
		 int annoSalida = Entrada.entradaInt();
		 System.out.println("Publisher: ");
		 String publisher = Entrada.entradaString();
		 System.out.println("Plataforma: ");
		 Plataformas plataforma = Juego.getPlataforma(Entrada.entradaString());
		 System.out.println("Genero: ");
		 Generos genero = Juego.getGenero(Entrada.entradaString());
		 Juego nuevojuego = new Juego(rank, nombre, plataforma, annoSalida, genero, publisher);
		 coleccionServices.CrearJuego(nuevojuego);
	 }
	 
	 public void opcion3() {
		coleccionServices.ListarJuegos();
	 }
	 
	 public void opcion4() {
		 services.Informe.genero((HashMap<Integer,Juego>)coleccionServices.getColeccion().getColeccion(), "Platform");
	 }
	 
	public boolean addLista(List<Juego> lista){
    	return coleccionServices.addLista(lista);
    }
}
