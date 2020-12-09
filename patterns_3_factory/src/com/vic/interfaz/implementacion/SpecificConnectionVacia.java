package com.vic.interfaz.implementacion;

import com.vic.interfaz.IGenericConnection;

public class SpecificConnectionVacia implements IGenericConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public SpecificConnectionVacia() {
		this.host="localhost";
		this.puerto="123";
		this.usuario="postgres";
		this.contrasena="abc";
	}
	
	@Override
	public void conectar() {
		System.out.println("No puede conectarme");
		
	}

	@Override
	public void desconectar() {
		System.out.println("No puede desconectarme");
		
	}

}
