package com.upiiz.hexagonal.domian.models;

public class Categoria {
    private String descripcion;
    private Long Id;


    public Categoria() {
    }

    public Categoria(Long id, String descripcion) {
    }
    public Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
