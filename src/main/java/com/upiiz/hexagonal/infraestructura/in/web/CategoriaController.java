package com.upiiz.hexagonal.infraestructura.in.web;

import com.upiiz.hexagonal.application.CategoriaService;
import com.upiiz.hexagonal.domian.models.Categoria;
import com.upiiz.hexagonal.domian.port.in.CategoriaUserCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    private final CategoriaUserCase categoriaUserCase;

    // 1. El constructor debe ser PUBLIC
    // 2. Es mejor inyectar y usar la interfaz de Puerto de Entrada (CategoriaUserCase)
    public CategoriaController(final CategoriaUserCase categoriaUserCase) {
        this.categoriaUserCase = categoriaUserCase;
    }

    @GetMapping
    public List<Categoria> getCategorias() {
        return categoriaUserCase.listar();
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id) {
        return categoriaUserCase.buscarPorId(id);
    }

    // 3. CAMBIO CLAVE: Se usó @PostMapping en lugar de @GetMapping
    @PostMapping
    public Categoria createCategoria(@RequestBody final Categoria categoria) {
        return categoriaUserCase.registrar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        // Asegúrate de setear el ID o pasarlo según la firma de tu método en el caso de uso
        categoria.setId(id);
        return categoriaUserCase.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable final Long id) {
        categoriaUserCase.eliminar(id);
    }
}