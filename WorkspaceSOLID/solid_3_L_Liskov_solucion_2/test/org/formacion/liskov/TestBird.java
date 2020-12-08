package org.formacion.liskov;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestBird {
	
	@Test
	public void test_pato_vuela() {
		FlyingBird pato=new Duck();		
		Assert.assertTrue(pato.eat() && pato.tweet() && pato.fly());
	}
	
	@Test
	public void test_aguila_vuela() {
		FlyingBird aguila=new Eagle();
		Assert.assertTrue(aguila.eat() && aguila.tweet() && aguila.fly());
	}
	
	@Test
	public void test_pinguieno_no_vuela() {
		Bird pinguino=new Pinguin();
		Assert.assertTrue(pinguino.eat() && pinguino.tweet());
	}

}
