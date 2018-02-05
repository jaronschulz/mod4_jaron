package salvo.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalvoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PlayerRepository repository) {
		return (args) -> {
			// save a couple of customers

			Player jack = new Player();
			jack.setUserName("j.bauer@gmx.de");

			Player sandy = new Player();
			sandy.setUserName("s.sauer@gmx.de");

			repository.save(jack);
			repository.save(sandy);


		};
	}
}
