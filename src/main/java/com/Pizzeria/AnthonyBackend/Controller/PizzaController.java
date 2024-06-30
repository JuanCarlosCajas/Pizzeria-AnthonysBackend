package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import com.Pizzeria.AnthonyBackend.Services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    @RequestMapping(value = "api/pizzas", method = RequestMethod.GET)
    public List<Pizza> obtenerPizzas(){
        return pizzaService.obtenerPizzas();
    }

    @RequestMapping(value = "api/pizzas/{id_pizza}", method = RequestMethod.GET)
    public Pizza obtenerPizzaById(@PathVariable int id_pizza) { return pizzaService.obtenerPizza(id_pizza); }

    @RequestMapping(value="api/pizzas/{id_pizza}", method = RequestMethod.DELETE)
    public void borrarPizza(@PathVariable int id_pizza){ pizzaService.borrarPizza(id_pizza); }

    @RequestMapping(value="api/pizzas/", method = RequestMethod.POST)
    public void agregarPizza(@RequestBody Pizza pizza){
        pizzaService.ingresarPizza(pizza);
    }

    @RequestMapping(value = "api/pizzas/{id_pizza}", method = RequestMethod.PATCH)
    public Pizza actualizarPizza(@PathVariable int id_pizza ,@RequestBody Pizza pizza){
        return pizzaService.actualizarPizza(id_pizza, pizza);
    }
}
