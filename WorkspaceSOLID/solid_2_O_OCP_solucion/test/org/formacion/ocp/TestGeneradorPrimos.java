package org.formacion.ocp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class TestGeneradorPrimos {
	
	@Test
	public void test_orden_natural() {
		
		GeneradorPrimos generador = new GeneradorPrimos();
		generador.setLimit(15);
		IOrdenacion ordenacionNatural=new OrdenacionNatural();
		List<Integer> expected= generador.ordenar(ordenacionNatural);
		System.out.println("Natural");
		System.out.println(expected);
		Assert.assertThat(generador.primos(), is(expected));
	}	

	@Test
	public void test_orden_inverso() {		
		GeneradorPrimos generador = new GeneradorPrimos();
		generador.setLimit(15);
		IOrdenacion ordenacionInversa=new OrdenacionInversa();		
		List<Integer> expected=generador.ordenar(ordenacionInversa);
		System.out.println("Inversa");
		System.out.println(expected);				
		Assert.assertThat(generador.primos()
				.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList()), is(expected));
	}	

}
