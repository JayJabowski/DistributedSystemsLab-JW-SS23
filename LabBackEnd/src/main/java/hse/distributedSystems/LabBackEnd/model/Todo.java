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
    private String todo;
    public int priority = 2;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo, int priority) {
        this.todo = todo;
        this.priority = priority;
    }

    Todo(){
        todo = "no description given";
    }

    Todo(String text){
        this.todo = text;
    }

    @Override
    public String toString(){
        return todo;
    }
    
}
