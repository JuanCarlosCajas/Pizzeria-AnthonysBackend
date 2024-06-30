package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleados")
public class Empleados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int id_empleado;

    @Column(name = "usuario")
     private String usuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "role_empleado")
    private String role_empleado;
}
