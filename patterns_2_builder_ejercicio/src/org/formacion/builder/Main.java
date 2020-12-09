package org.formacion.builder;

public class Main {

	public static void main (String[] args) {

		// este codigo debe compilar
		
		Persona madre = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37) //Apartir de aqui solo hay metodos para personas mayores
                .setLugarTrabajo("Google")
                .build();
		
		Persona hijo = new Persona.Builder("Pedro")
                .setMenor(4) //Apartir de aqui solo hay metodod para personas menores
                .setColegio("Colegio de Selva")
                .build();
		
		// esta codigo NO debe compilar
		/*
		Persona mal = new Persona.Builder("Luisa")
				    .setMayor(20)
				    .setColegio("Colegio de Villa Arriba")
				    .build();
        */
	}
}
