package com.vic.interfaz.implementacion;

import com.vic.interfaz.IGenericConnection;

public class SpecificConnectionOracle implements IGenericConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public SpecificConnectionOracle() {
		this.host="localhost";
		this.puerto="123";
		this.usuario="postgres";
		this.contrasena="abc";
	}
	
	@Override
	public void conectar() {
		System.out.println("Me he conectado desde Oracle");		
	}

	@Override
	public void desconectar() {
		System.out.println("Me desconecte de Oracle");		
	}

}
