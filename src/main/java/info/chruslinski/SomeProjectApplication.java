package info.chruslinski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeProjectApplication {

	@Autowired
	SomeService someService;

	public static void main(String[] args) {
		SpringApplication.run(SomeProjectApplication.class, args);
	}
}
