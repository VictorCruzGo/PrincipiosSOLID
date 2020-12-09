package com.vic.model;

//public, abstrac, final are permited
public class Connection {

	//clave
	private static Connection instance;
	
	//clave
	private Connection() {
		
	}
	
	//clave
	public static Connection getConnection() {
		if (instance ==null) {
			System.out.println("Nueva instancia");
			instance=new Connection();
		}
		System.out.println("Instancia existente");
		return instance;
	}
	
	public void connect() {
		System.out.println("Me conecte a la base de datos");
	}
	
	public void disconnect() {
		System.out.println("Me desconecte a la base de datos");
	}
}
