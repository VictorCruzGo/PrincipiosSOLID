package org.formacion.srp;

import java.util.List;
import java.util.stream.Collectors;

//Clase ExportarCSV
//Responsabilidad unquica 'exporta'
public class ExportadorCSV {

	public String exporta (List<Pelicula> peliculas) {
		
		return peliculas.stream()
		      .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
		      .collect(Collectors.joining("\n"));
	}
}
