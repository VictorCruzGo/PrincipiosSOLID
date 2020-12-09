package com.vic;

import com.vic.fabrica.ConnectionFactory;
import com.vic.interfaz.IGenericConnection;

public class App {
	public static void main(String args[]) {
		ConnectionFactory fabrica=new ConnectionFactory();
		//Factory pattern, create a object depending a ID.
		IGenericConnection cx1=fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();
		
		IGenericConnection cx2=fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();
		
		IGenericConnection cx3=fabrica.getConexion("SQLSERVER");
		cx3.conectar();
		cx3.desconectar();
		
		IGenericConnection cx4=fabrica.getConexion("");
		cx4.conectar();
		cx4.desconectar();
	}
}
