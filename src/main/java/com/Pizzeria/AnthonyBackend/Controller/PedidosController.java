package com.Pizzeria.AnthonyBackend.Controller;

import com.Pizzeria.AnthonyBackend.Modals.DetallePedido;
import com.Pizzeria.AnthonyBackend.Modals.Pedidos;
import com.Pizzeria.AnthonyBackend.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/pedido")
@CrossOrigin(origins = "*")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedidos> mostrar() {
        return pedidoService.obtenerPedidos();
    }

    @PostMapping
    public void AgregarPedido (@RequestBody List<DetallePedido> pedidos) {

    }
}
