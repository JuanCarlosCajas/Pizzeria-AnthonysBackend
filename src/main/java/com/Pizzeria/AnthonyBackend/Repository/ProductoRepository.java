package com.Pizzeria.AnthonyBackend.Repository;

import com.Pizzeria.AnthonyBackend.Modals.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findByCategoriaProductoId(int id_categoria);
}
