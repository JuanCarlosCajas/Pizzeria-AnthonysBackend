package com.Pizzeria.AnthonyBackend.Repository;

import com.Pizzeria.AnthonyBackend.Modals.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long>{
}
