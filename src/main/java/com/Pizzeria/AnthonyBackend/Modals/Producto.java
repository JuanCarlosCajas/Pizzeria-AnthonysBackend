package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @Column(name= "id_producto")
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

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    CategoriaProducto categoriaProducto;
}
