package org.formacion.liskov;

public class Eagle extends FlyingBird {

	@Override
	boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("El aguila vuela");
		return true;
	}

	@Override
	boolean eat() {
		// TODO Auto-generated method stub
		System.out.println("El aguila come");
		return true;
	}

	@Override
	boolean tweet() {
		// TODO Auto-generated method stub
		System.out.println("El aguila tweetea");
		return true;
	}

}
