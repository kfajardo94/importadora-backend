package com.importadora.backend.repository;

import com.importadora.backend.bo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {

    Productos getPruebaById(Long id);

}
