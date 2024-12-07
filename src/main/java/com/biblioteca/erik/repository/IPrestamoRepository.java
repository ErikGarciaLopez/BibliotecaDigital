package com.biblioteca.erik.repository;

import com.biblioteca.erik.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPrestamoRepository extends JpaRepository<Prestamo, Long> {

    List<Prestamo> findByUsuarioId (Long usuarioID);

}
