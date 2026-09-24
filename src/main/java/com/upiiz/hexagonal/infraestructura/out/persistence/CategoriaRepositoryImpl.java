package com.upiiz.hexagonal.infraestructura.out.persistence;

import com.upiiz.hexagonal.domian.models.Categoria;
import com.upiiz.hexagonal.domian.port.out.CategoriaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaRepositoryImpl implements CategoriaRepository {
    private final CategoriaRepositoryJpa categoriaRepositoryJpa;

    CategoriaRepositoryImpl(CategoriaRepositoryJpa categoriaRepositoryJpa){
        this.categoriaRepositoryJpa = categoriaRepositoryJpa;
    }


    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity= new CategoriaEntity(null,categoria.getDescripcion());
        CategoriaEntity categoriaGuardada= categoriaRepositoryJpa.save(categoriaEntity);
        return new Categoria(categoriaGuardada.getId(),categoriaGuardada.getDescripcion());
    }

    @Override
    public Categoria findById(Long Id) {
        return null;
    }

    @Override
    public List<Categoria> findAll() {
        return List.of();
    }

    @Override
    public Categoria update(Categoria categoria) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
