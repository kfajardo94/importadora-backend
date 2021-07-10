package com.importadora.backend.repository;

import com.importadora.backend.bo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    Usuarios getObjById(Long id);

}
