package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    @Setter @Getter
    private int id_usuario;

    @Column(name = "correo")
    @Setter @Getter
    private String correo;

    @Column(name = "contrasena")
    @Setter @Getter
    private String contrasena;

    @Column(name = "nombres")
    @Setter @Getter
    private String nombres;

    @Column(name = "apellidos")
    @Setter @Getter
    private String apellidos;

    @Column(name = "telefono")
    @Setter @Getter
    private int telefono;
}
