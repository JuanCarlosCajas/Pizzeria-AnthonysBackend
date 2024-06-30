package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import com.Pizzeria.AnthonyBackend.Repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PizzaService{

    @Autowired
    PizzaRepository pizzaRepository;

    @Transactional
    public List<Pizza> obtenerPizzas(){
        return pizzaRepository.findAll();
    }

    @Transactional
    public Pizza obtenerPizza(int id_pizza) { return pizzaRepository.findById(id_pizza).get(); }

    @Transactional
    public void borrarPizza(int id_pizza) { pizzaRepository.deleteById(id_pizza); }

    @Transactional
    public void ingresarPizza ( Pizza obj ) {
        pizzaRepository.save(obj);
    }

    public Pizza actualizarPizza (int id_pizza, Pizza pizzaActualizar) {
        Pizza pizzaEncontrada = obtenerPizza(id_pizza);

        pizzaEncontrada.setNombre(pizzaActualizar.getNombre());
        pizzaEncontrada.setDescripcion(pizzaActualizar.getDescripcion());
        pizzaEncontrada.setUrl_imagen(pizzaActualizar.getUrl_imagen());
        pizzaEncontrada.setStock(pizzaActualizar.getStock());
        pizzaEncontrada.setPrecio(pizzaActualizar.getPrecio());

        pizzaRepository.save(pizzaEncontrada);
        return pizzaEncontrada;
    }
;}
