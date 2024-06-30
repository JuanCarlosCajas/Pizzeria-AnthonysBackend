package com.Pizzeria.AnthonyBackend.Services;

import com.Pizzeria.AnthonyBackend.Modals.Pedidos;
import com.Pizzeria.AnthonyBackend.Repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public List<Pedidos> obtenerPedidos() {
        return pedidosRepository.findAll();
    }

}
