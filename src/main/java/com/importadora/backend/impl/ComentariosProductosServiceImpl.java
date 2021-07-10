package com.importadora.backend.impl;

import com.importadora.backend.bo.ComentariosProductos;
import com.importadora.backend.repository.ComentariosProductosRepository;
import com.importadora.backend.service.ComentariosProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentariosProductosServiceImpl implements ComentariosProductosService {

    @Autowired
    private ComentariosProductosRepository repository;

    @Override
    public ComentariosProductos getById(Long id) {
        return repository.getObjById(id);
    }

    @Override
    public ComentariosProductos create(ComentariosProductos obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        ComentariosProductos obj = repository.getObjById(id);
        repository.delete(obj);
    }

    @Override
    public List<ComentariosProductos> getAll() {
        return repository.findAll();
    }
}
