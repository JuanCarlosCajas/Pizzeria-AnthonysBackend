package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="producto")
public class ProductoLogic implements Serializable {

    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;

    @Column(name= "nombre")
    private String nombre;

    @Column(name = "url_imagen")
    private String url_imagen;

    @Column(name= "descripcion")
    private String descripcion;

    @Column(name= "precio")
    private Double precio;

    @Column(name= "stock")
    private int stock;

    @Column(name = "id_categoria")
    private int id_categoria;
}
