package org.formacion.liskov;

public class Duck extends Bird{

	@Override
	boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("El pato vuela");
		return true;
	}

}
