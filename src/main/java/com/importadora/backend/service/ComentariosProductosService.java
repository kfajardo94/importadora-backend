package com.importadora.backend.service;

import com.importadora.backend.bo.ComentariosProductos;

import java.util.List;

public interface ComentariosProductosService {

    ComentariosProductos getById(Long id);

    ComentariosProductos create(ComentariosProductos comentariosProductos);

    void delete(Long id);

    List<ComentariosProductos> getAll();
}
