package br.com.franciscofer.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franciscofer.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
