package org.formacion.liskov;

public class Duck extends FlyingBird{

	@Override
	boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("El pato vuela");
		return true;
	}

	@Override
	boolean eat() {
		// TODO Auto-generated method stub
		System.out.println("El pato come");
		return true;
	}

	@Override
	boolean tweet() {
		// TODO Auto-generated method stub
		System.out.println("El pato tweetea");
		return true;
	}

}
