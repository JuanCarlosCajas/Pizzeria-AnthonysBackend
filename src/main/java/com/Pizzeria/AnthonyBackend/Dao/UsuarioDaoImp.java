package com.Pizzeria.AnthonyBackend.Dao;


import com.Pizzeria.AnthonyBackend.Modals.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Usuario  loginUsuario(Usuario usuario) {
        String query = "FROM Usuario WHERE correo = :correo AND contrasena = :contrasena";
        List<Usuario> usuarioEncontrados = entityManager.createQuery(query).setParameter("correo", usuario.getCorreo()).setParameter("contrasena", usuario.getContrasena()).getResultList() ;
        if(usuarioEncontrados.isEmpty()){
            return new Usuario();
        }
        else{
            return usuarioEncontrados.getFirst();
        }
    }
}
