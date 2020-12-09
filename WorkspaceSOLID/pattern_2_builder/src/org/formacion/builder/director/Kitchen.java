package org.formacion.builder.director;

import org.formacion.builder.abstractbuilder.PizzaBuilder;
import org.formacion.builder.product.Pizza;

//Clase director
public class Kitchen {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void buildPizza() {
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildDough();
		pizzaBuilder.buidlSauce(); 
		pizzaBuilder.buildFilling();
	}
}
