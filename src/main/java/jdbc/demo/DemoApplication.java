package jdbc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jdbc.demo.Models.UserModel;
import jdbc.demo.Repositories.UserRepository;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner() {
		return args -> {
			try {
				UserModel user = UserModel.create("Patxi");
				System.out.print(user.getName());
				System.out.print(userRepository.save(user));
			} catch (Exception exc) {
				System.out.println(exc.getMessage());
			}

		};
	}

}
