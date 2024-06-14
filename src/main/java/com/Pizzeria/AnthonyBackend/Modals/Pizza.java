package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @Column(name= "id_pizza")
    @Getter @Setter
    private int id_pizza;

    @Column(name= "nombre")
    @Getter @Setter
    private String nombre;

    @Column(name = "url_imagen")
    @Getter @Setter
    private String url_imagen;

    @Column(name= "descripcion")
    @Getter @Setter
    private String descripcion;

    @Column(name= "precio")
    @Getter @Setter
    private Double precio;

    @Column(name= "stock")
    @Getter @Setter
    private int stock;
}
