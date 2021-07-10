package com.importadora.backend.service;

import com.importadora.backend.bo.Productos;

import java.util.List;

public interface ProductosService {

    Productos getPruebaById(Long id);

    Productos create(Productos productos);

    void delete(Long id);

    List<Productos> getAll();
}
