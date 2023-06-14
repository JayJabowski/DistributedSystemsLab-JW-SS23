package hse.distributedSystems.LabBackEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hse.distributedSystems.LabBackEnd.model.Todo;
import hse.distributedSystems.LabBackEnd.repository.ToDoRepository;

@SpringBootApplication
public class LabBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabBackEndApplication.class, args);
	}

	@RestController
	class Controller{

		@Autowired
		ToDoRepository repo;

		@RequestMapping("/")
			String greeting() {
				return "Hi Stranger";
			}


		//Get All Todos
		@GetMapping("/todo/")
		List<Todo> getAllTodos(){
			List<Todo> allTodos = new ArrayList<Todo>();

			repo.findAll().forEach(todo -> allTodos.add(todo));

			return allTodos;
		}

		//Get Todo By id
		@GetMapping("/todo/{id}")
		Todo getTodoById(@PathVariable Long idTodo){
			Optional<Todo> optTodo = repo.findById(idTodo);

			if(optTodo.isPresent()){
				return optTodo.get();
			}
			else
			{
				return null;
			}
		}

		//Add new ID
		@PostMapping("/todo/")
		Todo addNewTodo(@RequestBody Todo newItem){
			return repo.save(newItem);
		}

		//Remove ID
		@DeleteMapping("/todo/")
		void removeTodo(@RequestBody Todo todo){
			repo.delete(todo);
		}
	}

}
