package data;

import model.Juego;
import model.Generos;
import model.Plataformas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CSV / Carga los datos iniciales a partir de un archivo CSV
 * @author  Martin
 * @version 1.2
 * 09-11-2022
 */

public class CSV {
	public ArrayList<Juego> buildGameCollectionFromCSVFile(String filepath) {
		ArrayList<Juego> coleccionObtenida = new ArrayList<Juego>();
		
		try {
			FileReader filereader = new FileReader(new File(filepath));
			BufferedReader bufferedreader = new BufferedReader(filereader);
			bufferedreader.readLine(); // La primera linea son las cabeceras
			String line = bufferedreader.readLine();
			while( line != null) {
				String[] filaDelArchivoCSV = line.split(",");
				int rank = Integer.parseInt(filaDelArchivoCSV[0]);
				String nombre = filaDelArchivoCSV[1];
				
				
				
				int annosalida = -1;
				try{
					annosalida = Integer.parseInt(filaDelArchivoCSV[3]);
				}catch(NumberFormatException ex) {
					annosalida = -1;
				}
				
				Generos genero = Juego.getGenero(filaDelArchivoCSV[4]);
				
				Plataformas plataforma = Juego.getPlataforma(filaDelArchivoCSV[2]);
				
				String publisher = filaDelArchivoCSV[5];
				
				Juego juego = new Juego(rank, nombre, plataforma, annosalida, genero, publisher);
				coleccionObtenida.add(juego);
				
				//System.out.println(juego);
				
				line=bufferedreader.readLine();
			}
		} catch (FileNotFoundException ex) {
			utils.Logging.Log("Archivo no encontrado");
		} catch (IOException ex){
			utils.Logging.Log("Problema de fichero");
		}
		return coleccionObtenida;
	}
}