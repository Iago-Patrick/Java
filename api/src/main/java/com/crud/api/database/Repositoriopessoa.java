package com.crud.api.database;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.entidade.Pessoas;

public interface Repositoriopessoa extends JpaRepository<Pessoas,Long> {

}
