package com.crud.api;
import org.springframework.beans.factory.annotation.Autowired;
import com.crud.api.database.Repositoriopessoa;
import com.crud.api.entidade.Pessoas;
import java.util.*;

public class PessoasREST {
    @Autowired
    private Repositoriopessoa repositorio;

    public List<Pessoas>listar()
    {
        return repositorio.findAll();
    }

    public void salva (Pessoas pessoas)
    {
        repositorio.save(pessoas);
    }
    public void alterar (Pessoas pessoas)
    {
        if(pessoas.getId() >0)
            repositorio.save(pessoas);
    }
    public void excluir(Pessoas pessoas)
    {
        repositorio.delete(pessoas);
    }  
}
