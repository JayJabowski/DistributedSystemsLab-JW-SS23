package hse.distributedSystems.LabBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LabBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabBackEndApplication.class, args);
	}

	@RestController
	class restcontroller{

		@RequestMapping("/")
			String greeting() {
				return "Hi Stranger";
			}
		

	}

}
