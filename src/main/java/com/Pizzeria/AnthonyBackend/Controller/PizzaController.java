package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import com.Pizzeria.AnthonyBackend.Services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    @RequestMapping(value = "api/pizzas")
    public List<Pizza> obtenerPizzas(){
        return pizzaService.obtenerPizzas();
    }
}
