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
    public Productos getPruebaById(Long id) {
        return repository.getPruebaById(id);
    }

    @Override
    public Productos create(Productos productos) {
        return repository.save(productos);
    }

    @Override
    public void delete(Long id) {
        Productos producto = repository.getPruebaById(id);
        repository.delete(producto);
    }

    @Override
    public List<Productos> getAll() {
        return repository.findAll();
    }
}
