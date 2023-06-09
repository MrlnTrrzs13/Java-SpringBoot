package com.alura.jdbc.controller;

import java.util.List;
import com.alura.jdbc.dao.ProductoDao;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;
import com.alura.jdbc.modelo.Categoria;

public class ProductoController {

    private ProductoDao productoDao;
    
    public ProductoController() {
        var factory = new ConnectionFactory();
        this.productoDao = new ProductoDao(factory.connection());
    }

    public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
        return productoDao.modificar(nombre, descripcion, cantidad, id);
    }

    public int eliminar(Integer id) {
        return productoDao.eliminar(id);
    }

    public List<Producto> listar() {
        return productoDao.listar();
    }

    public void guardar(Producto producto, Integer categoriaId) {
        producto.setCategoriaId(categoriaId);
        productoDao.guardar(producto);
    }

    public List<Producto> listar(Categoria categoria) {
        return productoDao.listar(categoria);
    }

}
