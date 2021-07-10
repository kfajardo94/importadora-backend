package com.importadora.backend.repository;

import com.importadora.backend.bo.ComentariosUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosUsuariosRepository extends JpaRepository<ComentariosUsuarios, Long> {

    ComentariosUsuarios getObjById(Long id);

}
