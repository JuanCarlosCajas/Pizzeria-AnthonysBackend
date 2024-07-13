package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Usuario;
import com.Pizzeria.AnthonyBackend.Repository.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerUsuarios () {
        return usuarioRepository.findAll();
    }

    public Usuario registrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

    public long contadorUsuarios (){
        return usuarioRepository.count();
    }
}

