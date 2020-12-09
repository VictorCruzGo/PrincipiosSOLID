package org.formacion.builder;

import org.formacion.builder.abstractbuilder.PizzaBuilder;
import org.formacion.builder.concretebuilder.HawaiPizzaBuilder;
import org.formacion.builder.concretebuilder.HotSpicyPizzaBuilder;
import org.formacion.builder.director.Kitchen;
import org.formacion.builder.product.Pizza;

public class App {
	public static void main(String[] args) {
		Kitchen Kitchen=new Kitchen();

		PizzaBuilder HawaiPizza=new HawaiPizzaBuilder();		
		Kitchen.setPizzaBuilder(HawaiPizza);
		Kitchen.buildPizza();		
		Pizza Pizza=Kitchen.getPizza();		
		System.out.println(Pizza.getDough());
		System.out.println(Pizza.getSauce());
		System.out.println(Pizza.getFilling());

		
		PizzaBuilder HotSpicePizza=new HotSpicyPizzaBuilder();
		Kitchen.setPizzaBuilder(HotSpicePizza);
		Kitchen.buildPizza();		
		Pizza=Kitchen.getPizza();		
		System.out.println(Pizza.getDough());
		System.out.println(Pizza.getSauce());
		System.out.println(Pizza.getFilling());					
	}
}
