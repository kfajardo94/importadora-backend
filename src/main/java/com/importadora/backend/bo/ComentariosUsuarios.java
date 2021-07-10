package com.importadora.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comentarios_usuarios")
@Getter
@Setter
public class ComentariosUsuarios {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 10)
    private Long idUsuario;
    @Column(length = 999)
    private String descripcion;
}
