package org.formacion.ocp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacionInversa implements IOrdenacion {

	@Override
	public List<Integer> ordenar(List<Integer> primos) {
		//logica de ordenacion inversa
		//Collections.sort(primos, Collections.reverseOrder());
		return primos.stream()		
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
	}
}
