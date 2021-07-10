package com.importadora.backend.service;

import com.importadora.backend.bo.Usuarios;

import java.util.List;

public interface UsuariosService {

    Usuarios getById(Long id);

    Usuarios create(Usuarios obj);

    void delete(Long id);

    List<Usuarios> getAll();
}
