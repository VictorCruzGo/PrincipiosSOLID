package com.vic.fabrica;

import com.vic.interfaz.IGenericConnection;
import com.vic.interfaz.implementacion.SpecificConnectionMysql;
import com.vic.interfaz.implementacion.SpecificConnectionOracle;
import com.vic.interfaz.implementacion.SpecificConnectionSqlServer;
import com.vic.interfaz.implementacion.SpecificConnectionVacia;

public class ConnectionFactory {
	
	public IGenericConnection getConexion(String motor) {
		switch (motor) {
		case "MYSQL":
			return new SpecificConnectionMysql();			
		case "ORACLE":
			return new SpecificConnectionOracle();
		case "SQLSERVER":
			return new SpecificConnectionSqlServer();
		default:
			return new SpecificConnectionVacia();	
		}
	}

}
