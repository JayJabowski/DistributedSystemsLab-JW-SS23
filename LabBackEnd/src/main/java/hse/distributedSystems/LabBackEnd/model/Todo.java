package hse.distributedSystems.LabBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setTodo(String text) {
        this.text = text;
    }

    Todo(){
        text = "no description given";
    }

    Todo(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text+" id:"+id;
    }
    
}
