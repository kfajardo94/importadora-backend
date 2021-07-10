package com.importadora.backend.impl;

import com.importadora.backend.bo.ComentariosUsuarios;
import com.importadora.backend.repository.ComentariosUsuariosRepository;
import com.importadora.backend.service.ComentariosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentariosUsuariosServiceImpl implements ComentariosUsuariosService {

    @Autowired
    private ComentariosUsuariosRepository repository;

    @Override
    public ComentariosUsuarios getById(Long id) {
        return repository.getObjById(id);
    }

    @Override
    public ComentariosUsuarios create(ComentariosUsuarios obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        ComentariosUsuarios obj = repository.getObjById(id);
        repository.delete(obj);
    }

    @Override
    public List<ComentariosUsuarios> getAll() {
        return repository.findAll();
    }
}
