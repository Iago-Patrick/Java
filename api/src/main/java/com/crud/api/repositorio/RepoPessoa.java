package com.crud.api.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.crud.api.entidade.Pessoas;

public interface RepoPessoa extends CrudRepository<Pessoas,Long> {

}
