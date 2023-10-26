package com.crud.api.database;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.entidade.Pessoa;

public interface Repositoriopessoa extends JpaRepository<Pessoa,Long> {

}
