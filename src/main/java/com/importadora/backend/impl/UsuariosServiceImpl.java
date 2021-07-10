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
    public Usuarios getPruebaById(Long id) {
        return repository.getPruebaById(id);
    }

    @Override
    public Usuarios create(Usuarios usuarios) {
        return repository.save(usuarios);
    }

    @Override
    public void delete(Long id) {
        Usuarios usuario = repository.getPruebaById(id);
        repository.delete(usuario);
    }

    @Override
    public List<Usuarios> getAll() {
        return repository.findAll();
    }
}
