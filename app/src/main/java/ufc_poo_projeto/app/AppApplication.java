package ufc_poo_projeto.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ufc_poo_projeto.app.entities.Usuario;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario n1 = new Usuario("sgsa","awetq", "asdfas","143123","Feminino");
	}
}