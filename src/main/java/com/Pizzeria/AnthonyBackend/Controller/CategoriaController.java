package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Dao.ProductosDao;
import com.Pizzeria.AnthonyBackend.Modals.CategoriaProducto;
import com.Pizzeria.AnthonyBackend.Modals.Producto;
import com.Pizzeria.AnthonyBackend.Services.CategoriaService;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/categoria")
@CrossOrigin(origins = "*")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @Autowired
    ProductosDao productosDao;

    @GetMapping
    public List<CategoriaProducto> obtenerCategorias() {
        return categoriaService.listarCategoria();
    }

    @PostMapping
    public JsonObject guardarCategoria (@RequestBody CategoriaProducto categoria) {
        return categoriaService.guardarCategoria(categoria);
    }

    @PatchMapping(value = "/{id}")
    public void actualizarCategoria (@RequestBody CategoriaProducto categoriaProducto, @PathVariable int id) {
        categoriaProducto.setId_categoria(id);
        categoriaService.actualizarCategoria(categoriaProducto);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarCategoria(@PathVariable int id) {
        categoriaService.borrarCategoria(id);
    }

    @GetMapping(value = "/{id}")
    public List<Producto> buscarCategoria (@PathVariable int id) {
        return productosDao.obtenerProductos(id);
    }
}
