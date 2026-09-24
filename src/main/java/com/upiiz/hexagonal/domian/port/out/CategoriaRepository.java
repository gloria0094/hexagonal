package com.upiiz.hexagonal.domian.port.out;


import com.upiiz.hexagonal.domian.models.Categoria;

import java.util.List;

public interface CategoriaRepository {
    Categoria save(Categoria categoria);
    Categoria findById(Long Id);
    List<Categoria> findAll();
    Categoria update(Categoria categoria);
    void delete(Long id);


}
