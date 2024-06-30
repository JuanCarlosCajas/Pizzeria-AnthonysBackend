package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.CategoriaProducto;
import com.Pizzeria.AnthonyBackend.Repository.CategoriaRepository;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaProducto> listarCategoria () {
        return categoriaRepository.findAll();
    }

    public CategoriaProducto obtenerCategoria (int id) {
        Optional<CategoriaProducto> categoriaEncontrada = categoriaRepository.findById(id);
        return categoriaEncontrada.orElse(null);
    }

    public JsonObject guardarCategoria ( CategoriaProducto categoriaProducto ){
        JsonObject  mensaje = new JsonObject();
        mensaje.put("mensaje", true);
        categoriaRepository.save(categoriaProducto);
        return mensaje;
    }
}
