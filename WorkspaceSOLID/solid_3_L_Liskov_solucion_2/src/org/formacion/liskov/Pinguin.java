package org.formacion.liskov;

public class Pinguin extends Bird {

	@Override
	boolean eat() {
		// El pinguino come
		System.out.println("El pinguino come");
		return true;
	}

	@Override
	boolean tweet() {
		// El pinguino canta
		System.out.println("El pinguino tweetea");
		return true;
	}

	

}
