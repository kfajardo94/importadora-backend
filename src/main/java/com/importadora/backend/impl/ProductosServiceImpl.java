package com.importadora.backend.impl;

import com.importadora.backend.bo.Productos;
import com.importadora.backend.repository.ProductosRepository;
import com.importadora.backend.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductosRepository repository;

    @Override
    public Productos getById(Long id) {
        return repository.getObjById(id);
    }

    @Override
    public Productos create(Productos obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        Productos obj = repository.getObjById(id);
        repository.delete(obj);
    }

    @Override
    public List<Productos> getAll() {
        return repository.findAll();
    }
}
