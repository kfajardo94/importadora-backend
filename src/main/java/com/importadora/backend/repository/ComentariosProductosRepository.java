package com.importadora.backend.repository;

import com.importadora.backend.bo.ComentariosProductos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosProductosRepository extends JpaRepository<ComentariosProductos, Long> {

    ComentariosProductos getObjById(Long id);

}
