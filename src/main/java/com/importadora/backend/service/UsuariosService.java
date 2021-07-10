package com.importadora.backend.service;

import com.importadora.backend.bo.Usuarios;

import java.util.List;

public interface UsuariosService {

    Usuarios getPruebaById(Long id);

    Usuarios create(Usuarios usuarios);

    void delete(Long id);

    List<Usuarios> getAll();
}
