package hse.distributedSystems.LabBackEnd.repository;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

import hse.distributedSystems.LabBackEnd.model.Todo;


@Transactional
public interface ToDoRepository extends CrudRepository<Todo, Long>{
    
}
