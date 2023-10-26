package com.crud.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.crud.api.database.Repositoriopessoa;
import com.crud.api.entidade.Pessoa;
import java.util.*;

@RestController
@RequestMapping("/pessoa")

public class PessoasREST {
    @Autowired
    private Repositoriopessoa repositorio;
    
    @GetMapping
    public List<Pessoa>listar()
    {
        return repositorio.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Pessoa> listarId(@PathVariable Long id)
    {
        return repositorio.findById(id);
    }
    @PostMapping
    public void salva (@RequestBody Pessoa pessoas)
    {
        repositorio.save(pessoas);
    }
    @PutMapping
    public void alterar (@RequestBody Pessoa pessoas)
    {
        if(pessoas.getId() >0)
            repositorio.save(pessoas);
    }
    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Long id)
    {
        repositorio.deleteById(id);
    }  
}
