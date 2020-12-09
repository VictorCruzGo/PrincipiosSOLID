package org.formacion.builder.abstractbuilder;

import org.formacion.builder.product.Pizza;

//Abstract builder
public abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizza() {
		pizza=new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buidlSauce();
	public abstract void buildFilling();

}
