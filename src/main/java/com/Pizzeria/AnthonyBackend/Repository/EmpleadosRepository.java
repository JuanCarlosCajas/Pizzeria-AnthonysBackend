package com.Pizzeria.AnthonyBackend.Repository;

import com.Pizzeria.AnthonyBackend.Modals.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {
}
