package services;

import java.util.List;
import model.Juego;
import utils.Logging;

/**
 * ColeccionJuegos / Coleccion principal de juegos
 * @author Daniel
 * @version 1.0 
 * 09-11-2022
 */


public class ColeccionJuegos{
	private data.ColeccionJuegos coleccion = new data.ColeccionJuegos();
	

	public data.ColeccionJuegos getColeccion() {
		return coleccion;
	}

	public void setColeccion(data.ColeccionJuegos coleccion) {
		this.coleccion = coleccion;
	}

	public boolean CrearJuego(Juego j)  {
		try {
			return coleccion.CrearJuego((int) j.getRank(), j); //es lo unico que se me ha ocurrido, aunque provoque informacion duplicada
		} catch (exception.CodigoRepetidoException ex) {
			Logging.Log("Se ha intentado crear un juego con un codigo que ya existia");
			return false;
		}
        
    }

    public void ListarJuegos() {
    	coleccion.ListarJuegos();
    }

    public boolean addLista(List<Juego> lista){
    	for(Juego j: lista) {
    		try{
				CrearJuego(j);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}