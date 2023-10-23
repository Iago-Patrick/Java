package com.crud.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.database.Repositoriopessoa;
import com.crud.api.entidade.Pessoas;
import java.util.*;

@RestController
@RequestMapping("/pessoa")

public class PessoasREST {
    @Autowired
    private Repositoriopessoa repositorio;
    
    @GetMapping
    public List<Pessoas>listar()
    {
        return repositorio.findAll();
    }
    @PostMapping
    public void salva (@RequestBody Pessoas pessoas)
    {
        repositorio.save(pessoas);
    }
    @PutMapping
    public void alterar (@RequestBody Pessoas pessoas)
    {
        if(pessoas.getId() >0)
            repositorio.save(pessoas);
    }
    @DeleteMapping
    public void excluir(@RequestBody Pessoas pessoas)
    {
        repositorio.delete(pessoas);
    }  
}
