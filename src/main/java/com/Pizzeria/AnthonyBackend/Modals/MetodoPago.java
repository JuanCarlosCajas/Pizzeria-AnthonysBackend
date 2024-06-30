package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metodopago")
public class MetodoPago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo")
    private int id_metodo;

    @Column(name = "forma_metodo")
    private String forma_metodo;

    @Column(name = "tarjeta")
    private String tarjeta;
}
