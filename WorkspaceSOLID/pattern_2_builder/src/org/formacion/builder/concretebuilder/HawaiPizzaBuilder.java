package org.formacion.builder.concretebuilder;

import org.formacion.builder.abstractbuilder.PizzaBuilder;

//Concrete builder 
public class HawaiPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("soft");
	}

	@Override
	public void buidlSauce() {
		pizza.setSauce("sweet");
	}

	@Override
	public void buildFilling() {
		pizza.setFilling("chorizo+artichokes");
	}

}
