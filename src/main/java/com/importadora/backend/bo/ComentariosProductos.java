package com.importadora.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comentarios_productos")
@Getter
@Setter
public class ComentariosProductos {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 10)
    private Long idProducto;
    @Column(length = 999)
    private String descripcion;
}
