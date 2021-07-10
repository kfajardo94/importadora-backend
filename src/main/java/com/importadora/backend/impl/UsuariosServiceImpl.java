package com.importadora.backend.impl;

import com.importadora.backend.bo.Usuarios;
import com.importadora.backend.repository.UsuariosRepository;
import com.importadora.backend.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository repository;

    @Override
    public Usuarios getById(Long id) {
        return repository.getObjById(id);
    }

    @Override
    public Usuarios create(Usuarios obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        Usuarios obj = repository.getObjById(id);
        repository.delete(obj);
    }

    @Override
    public List<Usuarios> getAll() {
        return repository.findAll();
    }
}
