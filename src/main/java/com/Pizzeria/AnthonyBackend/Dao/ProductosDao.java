package com.Pizzeria.AnthonyBackend.Dao;

import com.Pizzeria.AnthonyBackend.Modals.Producto;

import java.util.List;

public interface ProductosDao {
    public List<Producto> obtenerProductos(int id_categoria);
}
