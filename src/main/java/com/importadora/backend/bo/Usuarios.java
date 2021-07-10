package com.importadora.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuarios {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 75)
    private String nombreImportadora;
    @Column(length = 50)
    private String usuario;
    @Column(length = 100)
    private String contrasenia;
    @Column(length = 20)
    private String telefono;
    @Column(length = 254)
    private String correo;
    @Column()
    private Byte[] foto;
    @Column(length = 600)
    private String direccion;
    @Column(length = 1200)
    private String descripcionEmpresa;
    @Column(length = 1)
    private String admin;
    @Column(length = 1)
    private String suspendido;
}
