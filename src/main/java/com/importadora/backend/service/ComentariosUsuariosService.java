package com.importadora.backend.service;

import com.importadora.backend.bo.ComentariosUsuarios;

import java.util.List;

public interface ComentariosUsuariosService {

    ComentariosUsuarios getById(Long id);

    ComentariosUsuarios create(ComentariosUsuarios obj);

    void delete(Long id);

    List<ComentariosUsuarios> getAll();
}
