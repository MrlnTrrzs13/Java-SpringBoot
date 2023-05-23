package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.dao.CategoriaDao;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
	private CategoriaDao categoriaDao;
	
	public CategoriaController() {
		var factory = new ConnectionFactory();
		this.categoriaDao = new CategoriaDao(factory.connection());
	}
	
	public List<Categoria> listar() {
		return this.categoriaDao.listar();
	}

    public List<Categoria> cargaReporte() {
        return this.categoriaDao.listarConProductos();
    }

}
