package br.com.franciscofer.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.franciscofer.desafiotodolist.entity.Todo;
import br.com.franciscofer.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {

private TodoRepository todoRepository;

public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
}

public List<Todo> list(){
    Sort sort = Sort.by( "prioridade").descending()
    .and (Sort.by( "nome").ascending());
    return todoRepository.findAll(sort);
}

public List<Todo> create(Todo todo){
    todoRepository.save(todo);
    return list();
}

public List<Todo> update(Todo todo){
     todoRepository.save(todo);
    return list();
}

public List<Todo> delete(Long Id){
    todoRepository.deleteById(Id);
    return list();
}
}