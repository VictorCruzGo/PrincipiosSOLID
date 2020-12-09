package org.formacion.builder.concretebuilder;

import org.formacion.builder.abstractbuilder.PizzaBuilder;

//Concrete Builder
public class HotSpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("cooked");
	}

	@Override
	public void buidlSauce() {
		pizza.setSauce("hot spicy");
	}

	@Override
	public void buildFilling() {
		pizza.setFilling("pepper+sausage");
	}
	
}
