package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTextoSimple implements IProcesadorTextoSimple {
	public List<String> texto = new ArrayList<>();
	
	public ProcesadorTextoSimple() {	
	}
	
	@Override
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	@Override
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}	
}
