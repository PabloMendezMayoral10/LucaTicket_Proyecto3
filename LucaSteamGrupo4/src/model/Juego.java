package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Juego / Contiene los datos de un Juego
 * @author  Daniel y Martin
 * @version 1.2
 * 09-11-2022
 */


public class Juego {

	private int rank;
	private String nombre;
	private Plataformas plataforma;
	private int annosalida;
	private Generos genero;
	private String publisher;
	public Juego() {
		super();
	}
	public Juego(int rank, String nombre, Plataformas plataforma, int annosalida,
			Generos genero, String publisher) {
		super();
		this.rank = rank;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.annosalida = annosalida;
		this.genero = genero;
		this.publisher = publisher;
	}
	
	public String toString() {
		return "Juego [rank=" + rank + ", nombre=" + nombre + ", plataforma="
				+ plataforma + ", annosalida=" + annosalida + ", genero="
				+ genero + ", publisher=" + publisher + "]";
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Plataformas getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataformas plataforma) {
		this.plataforma = plataforma;
	}
	public int getAnnosalida() {
		return annosalida;
	}
	public void setAnnosalida(int annosalida) {
		this.annosalida = annosalida;
	}

	public Generos getGenero() {
		return genero;
	}
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Juego(String ruta){
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            rank=Integer.parseInt(br.readLine());
            nombre=br.readLine();
            plataforma=Plataformas.valueOf(br.readLine());
            annosalida=Integer.parseInt(br.readLine());
            genero=Generos.valueOf(br.readLine());
            publisher=br.readLine();
        }catch (IOException e){
            System.out.println("Error");
        }
    }

	public void guardar(String ruta){
		try{
		    FileWriter f=new FileWriter(ruta);
		    f.write(rank+"\n");
		    f.write(nombre+"\n");
		    f.write(plataforma.toString()+"\n");
		    f.write(annosalida+"\n");
		    f.write(genero.toString()+"\n");
		    f.write(publisher+"\n");
		    f.close();
		}catch (IOException e){
		    System.out.println("Error");
		}
	}
		
	public Juego copiar(Juego j){
		return new Juego(j.rank,j.nombre,j.plataforma,j.annosalida,j.genero,j.publisher);
	}
	
	public static Plataformas getPlataforma(String plataformaString) {
		Plataformas plataforma = Plataformas.desconocida; //Por defecto
		if(plataformaString.equals("Wii")) {
			plataforma=Plataformas.wii;
		} else if(plataformaString.equals("NES")) {
			plataforma=Plataformas.nes;
		}else if(plataformaString.equals("GB")) {
			plataforma=Plataformas.gb;
		}else if(plataformaString.equals("DS")) {
			plataforma=Plataformas.nds;
		}else if(plataformaString.equals("GBA")) {
			plataforma=Plataformas.gba;
		}else if(plataformaString.equals("XB")) {
			plataforma=Plataformas.xbox;
		}else if(plataformaString.equals("X360")) {
			plataforma=Plataformas.xbox360;
		}else if(plataformaString.equals("XOne")) {
			plataforma=Plataformas.xboxone;
		}else if(plataformaString.equals("PS")) {
			plataforma=Plataformas.playstation;
		}else if(plataformaString.equals("PS2")) {
			plataforma=Plataformas.ps2;
		}else if(plataformaString.equals("PS3")) {
			plataforma=Plataformas.ps3;
		}else if(plataformaString.equals("PS4")) {
			plataforma=Plataformas.ps4;
		}else if(plataformaString.equals("2600")) {
			plataforma=Plataformas.atari2600;
		}else if(plataformaString.equals("PSP")) {
			plataforma=Plataformas.psp;
		}else if(plataformaString.equals("PC")) {
			plataforma=Plataformas.pc;
		}else if(plataformaString.equals("WiiU")) {
			plataforma=Plataformas.wiiu;
		}else if(plataformaString.equals("N64")) {
			plataforma=Plataformas.n64;
		}else if(plataformaString.equals("GC")) {
			plataforma=Plataformas.gamecube;
		}else if(plataformaString.equals("GEN")) {
			plataforma=Plataformas.genesis;
		}else if(plataformaString.equals("3DS")) {
			plataforma=Plataformas.n3ds;
		}else if(plataformaString.equals("NES")) {
			plataforma=Plataformas.nes;
		}else if(plataformaString.equals("PSV")) {
			plataforma=Plataformas.psvita;
		}else if(plataformaString.equals("SAT")) {
			plataforma=Plataformas.saturn;
		}else if(plataformaString.equals("DC")) {
			plataforma=Plataformas.dreamcast;
		}else if(plataformaString.equals("Birth 2")) {
			plataforma=Plataformas.psvita; //mirar entrada 11135 del csv. Probablemente habra mas como esa, por eso puse un por defecto
		}
		return plataforma;
	}
	
	public static Generos getGenero(String generoString) {
		Generos genero = Generos.misc; //Por defecto
		if(generoString.equals("Action")) {
			genero=Generos.accion;
		} else if(generoString.equals("Sports")) {
			genero=Generos.deportes;
		}else if(generoString.equals("Platform")) {
			genero=Generos.plataformas;
		}else if(generoString.equals("Racing")) {
			genero=Generos.carrera;
		}else if(generoString.equals("Role-Playing")) {
			genero=Generos.rpg;
		}else if(generoString.equals("Puzzle")) {
			genero=Generos.puzzle;
		}else if(generoString.equals("Misc")) {
			genero=Generos.misc;
		}else if(generoString.equals("Shooter")) {
			genero=Generos.tiros;
		}else if(generoString.equals("Simulation")) {
			genero=Generos.simulacion;
		}else if(generoString.equals("Fighting")) {
			genero=Generos.lucha;
		}else if(generoString.equals("Strategy")) {
			genero=Generos.estrategia;
		}else if(generoString.equals("Adventure")) {
			genero=Generos.aventura;
		}
		return genero;
	}
	
	
	
	
	
	
	
	
	
	
	
}