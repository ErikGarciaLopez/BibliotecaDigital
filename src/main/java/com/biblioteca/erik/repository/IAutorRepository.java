package com.biblioteca.erik.repository;

import com.biblioteca.erik.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByNombreContaining(String nombre);

}
