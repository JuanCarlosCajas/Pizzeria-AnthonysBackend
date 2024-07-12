package com.Pizzeria.AnthonyBackend.Modals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuario")
public class UsuarioLogic implements Serializable {

    @Id
    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "correo")
    private String correo;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "telefono")
    private int telefono;
}
