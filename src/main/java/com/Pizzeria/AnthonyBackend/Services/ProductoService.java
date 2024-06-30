package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Producto;
import com.Pizzeria.AnthonyBackend.Repository.ProductoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarProducto (int id) {

        if(productoRepository.findById(id).isPresent()){
            return productoRepository.findById(id).get();
        }
        else{
            return null;
        }
    }

    public String actualizarProducto(@NotNull Producto producto , int id) {
        Producto productoEncontrado = buscarProducto(id);

        if(productoEncontrado == null){
            return "No encontrado";
        }
        else{
            productoEncontrado.setNombre(producto.getNombre() == null ? productoEncontrado.getNombre(): producto.getNombre());
            productoEncontrado.setUrl_imagen(producto.getUrl_imagen() == null ? productoEncontrado.getUrl_imagen(): producto.getUrl_imagen());
            productoEncontrado.setPrecio(producto.getPrecio() == null ? productoEncontrado.getPrecio(): producto.getPrecio());
            productoEncontrado.setStock(producto.getStock() == 0  ? productoEncontrado.getStock(): producto.getStock());
            productoEncontrado.setDescripcion(producto.getDescripcion() == null ? productoEncontrado.getDescripcion(): producto.getDescripcion());
            productoEncontrado.setCategoriaProducto(producto.getCategoriaProducto() == null ? productoEncontrado.getCategoriaProducto(): producto.getCategoriaProducto());
            productoRepository.save(productoEncontrado);

            return "Cambio exitoso";
        }
    }

    public String borrarProducto(int id){
        Producto productoEncontrado = buscarProducto(id);
        if(productoEncontrado == null){
            return "No encontrado para borrar";
        }
        else{
            productoRepository.delete(productoEncontrado);
            return "Producto borrado";
        }
    }

    public void ingresarProducto(@NotNull Producto producto){
        productoRepository.save(producto);
    }
}
