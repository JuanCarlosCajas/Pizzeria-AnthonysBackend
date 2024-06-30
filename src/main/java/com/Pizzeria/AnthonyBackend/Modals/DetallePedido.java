package com.Pizzeria.AnthonyBackend.Modals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedidoproducto")
public class DetallePedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private int id_detalle;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private double subtotal;

    @ManyToOne
    @JsonIgnore
     @JoinColumn(name = "id_pedido")
    Pedidos pedidos;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    Producto producto;
}
