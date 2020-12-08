package org.formacion.liskov;

public class Pinguin extends Bird {

	@Override
	boolean fly() {
		System.out.println("El pinguino no vuela");
		return true;
	}

}
