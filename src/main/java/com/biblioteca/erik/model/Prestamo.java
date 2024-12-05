package com.biblioteca.erik.model;

import java.time.LocalDate;

public class Prestamo {

    private Long id;
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;


}
