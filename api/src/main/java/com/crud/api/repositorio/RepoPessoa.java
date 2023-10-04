package com.crud.api.repositorio;

import com.crud.api.componentes.Pessoas;
import org.springframework.data.repository.CrudRepository;

public interface RepoPessoa extends CrudRepository<Pessoas,Long> {

}
