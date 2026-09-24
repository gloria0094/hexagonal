package com.upiiz.hexagonal.domian.port.in;

import com.upiiz.hexagonal.domian.models.Categoria;

import java.util.List;

public interface CategoriaUserCase {
    Categoria registrar(Categoria categoria);
    List<Categoria> listar();
    Categoria buscarPorId(Long id);
    Categoria actualizar(Categoria categoria);
    void eliminar(Long id);
}
