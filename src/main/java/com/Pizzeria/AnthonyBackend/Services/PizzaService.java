package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import com.Pizzeria.AnthonyBackend.Repository.PizzaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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
}
