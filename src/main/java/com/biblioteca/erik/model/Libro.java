package com.biblioteca.erik.model;

import com.biblioteca.erik.utils.enums.Genero;

public class Libro {

    private Long id;
    private String titulo;
    private String descripcion;
    private Autor autor;
    private Genero genero;
    public boolean disponible;

}
