package com.biblioteca.erik.repository;

import com.biblioteca.erik.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByTituloContaining(String titulo);
    List<Libro> findByAutorNombre(String nombreAutor);

}
