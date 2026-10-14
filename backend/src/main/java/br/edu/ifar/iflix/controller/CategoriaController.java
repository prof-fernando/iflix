package br.edu.ifar.iflix.controller;

import br.edu.ifar.iflix.model.Categoria;
import br.edu.ifar.iflix.model.Usuario;
import br.edu.ifar.iflix.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/categoria")
public class CategoriaController {

    private CategoriaService service;

    public CategoriaController( CategoriaService s ) {
        this.service = s;
    }

    @GetMapping
    public List<Categoria> buscarTodos(){
        return this.service.buscarTodos();
    }
    @PostMapping
    public void gravar( @RequestBody Categoria cat){
        this.service.gravar(cat);
    }

}

