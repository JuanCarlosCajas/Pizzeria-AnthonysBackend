package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categoriaproducto")
public class CategoriaProducto implements Serializable {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;

    @Column(name = "nombre_categoria")
    private String nombre_categoria;
}
