package com.importadora.backend.service;

import com.importadora.backend.bo.Productos;

import java.util.List;

public interface ProductosService {

    Productos getById(Long id);

    Productos create(Productos obj);

    void delete(Long id);

    List<Productos> getAll();
}
