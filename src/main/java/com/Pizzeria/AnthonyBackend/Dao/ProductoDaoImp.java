package com.Pizzeria.AnthonyBackend.Dao;

import com.Pizzeria.AnthonyBackend.Modals.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductoDaoImp implements ProductosDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Producto> obtenerProductos(int id_categoria) {
        String query = "from ProductoLogic where id_categoria = :id_categoria";
        return entityManager.createQuery(query).setParameter("id_categoria", id_categoria).getResultList();
    }
}
