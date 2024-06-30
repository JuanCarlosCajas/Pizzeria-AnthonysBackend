package com.Pizzeria.AnthonyBackend.Modals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedidos")
public class Pedidos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "id_pedido")
    private int id_pedido;

    @Column(name = "total")
    private double total;

    @Column(name = "direccion")
    private String direccion;

    @Column(name="estado")
    private String estado;

    @Column(name = "fecha_pedido")
    @CreationTimestamp
    private LocalDateTime fecha_pedido;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_usuario")
    Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_metodo")
    MetodoPago metodoPago;

    @OneToMany(mappedBy = "pedidos", cascade = CascadeType.PERSIST)
    private List<DetallePedido> detallePedidos;

}
