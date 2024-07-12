package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Dao.UsuarioDao;
import com.Pizzeria.AnthonyBackend.Modals.Usuario;
import com.Pizzeria.AnthonyBackend.Services.UsuarioService;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioDao usuarioDao;

   @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public Usuario loginUsuario(@RequestBody Usuario usuario){
        return usuarioDao.loginUsuario(usuario);
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> mostrarUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @RequestMapping(value = "api/usuario", method = RequestMethod.POST)
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return usuarioService.registrarUsuario(usuario);
    }

    @RequestMapping(value="api/contador/usuario", method = RequestMethod.GET)
    public JsonObject contadorUsuarios(){
       JsonObject resultado = new JsonObject();
       resultado.put("usuarios", usuarioService.contadorUsuarios());
       return resultado;
    }
}
