package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
    	Connection cn = new ConnectionFactory().connection();

        System.out.println("Cerrando la conexión");

        cn.close();
    }

}
