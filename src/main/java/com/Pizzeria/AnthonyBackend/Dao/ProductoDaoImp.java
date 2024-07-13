package com.Pizzeria.AnthonyBackend.Dao;

import com.Pizzeria.AnthonyBackend.Modals.Producto;
import com.Pizzeria.AnthonyBackend.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductoDaoImp implements ProductosDao {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoDaoImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> obtenerProductos(int id_categoria) {
        // Utilizando el método personalizado del repositorio
        return productoRepository.findByCategoriaProductoId(id_categoria);
    }
}
