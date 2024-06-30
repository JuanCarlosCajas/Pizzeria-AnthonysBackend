package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.CategoriaProducto;
import com.Pizzeria.AnthonyBackend.Services.CategoriaService;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaProducto> obtenerCategorias() {
        return categoriaService.listarCategoria();
    }

    @PostMapping
    public JsonObject guardarCategoria (@RequestBody CategoriaProducto categoria) {
        return categoriaService.guardarCategoria(categoria);
    }
}
