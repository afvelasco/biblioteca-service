package com.example.usuarios.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Column(name = "IdUsuario")
    private String idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "contrasena")
    private String contrasena;

    // AGREGA ESTO MANUALMENTE
    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(String idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}