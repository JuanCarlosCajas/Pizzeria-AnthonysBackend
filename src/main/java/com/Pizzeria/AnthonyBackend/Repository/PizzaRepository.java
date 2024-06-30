package com.Pizzeria.AnthonyBackend.Repository;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
}
