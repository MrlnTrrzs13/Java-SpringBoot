package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {

	public static void main (String args[]) throws SQLException {
		Connection cn = new ConnectionFactory().connection();
		
		Statement statement = cn.createStatement();
		statement.execute("DELETE FROM producto WHERE ID = 99 ");
		
		System.out.println(statement.getUpdateCount());
	}
}
