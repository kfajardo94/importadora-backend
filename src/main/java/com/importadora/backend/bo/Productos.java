package com.importadora.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Productos {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 45)
    private String marca;
    @Column(length = 45)
    private String modelo;
    @Column(length = 4)
    private String anio;
    @Column(length = 12)
    private Double precio;
    @Column(length = 1)
    private String moneda;
    @Column(length = 1)
    private String disponible;
    @Column(length = 1200)
    private String descripcion;
}
