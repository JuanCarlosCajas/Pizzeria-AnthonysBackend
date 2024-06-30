package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.Producto;
import com.Pizzeria.AnthonyBackend.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @RequestMapping(value = "api/producto", method = RequestMethod.GET)
    public List<Producto> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @RequestMapping(value = "api/producto/{id}", method = RequestMethod.GET)
    public Producto obtenerProducto(@PathVariable int id) {
        return productoService.buscarProducto(id);
    }

    @RequestMapping(value = "api/producto/{id}", method = RequestMethod.DELETE)
    public String borrarProducto(@PathVariable int id){
        return productoService.borrarProducto(id);
    }

    @RequestMapping(value = "api/producto", method = RequestMethod.POST)
    public void ingresarProducto (@RequestBody Producto producto) {
        productoService.ingresarProducto(producto);
    }

    @RequestMapping(value = "api/producto/{id}", method = RequestMethod.PATCH)
    public String actualizarProducto (@RequestBody Producto producto, @PathVariable int id) {
        return productoService.actualizarProducto(producto, id);
    }
}
