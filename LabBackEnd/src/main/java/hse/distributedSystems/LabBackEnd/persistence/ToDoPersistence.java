package hse.distributedSystems.LabBackEnd.persistence;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

import hse.distributedSystems.LabBackEnd.model.Todo;


@Transactional
public interface ToDoPersistence extends CrudRepository<Todo, Long>{
    
}
