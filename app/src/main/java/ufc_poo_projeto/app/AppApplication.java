package ufc_poo_projeto.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ufc_poo_projeto.app.entities.Usuario;
import ufc_poo_projeto.app.services.Autenticador;

import java.util.Scanner;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean controlador = true;
		while (controlador) {
			System.out.println("""
					1 - FAZER LOGIN
					2 - FAZER CADASTRO
					""");

			int e1 = scanner.nextInt();
			switch (e1) {
				case 1:
					System.out.println("Digite seu username: ");
					String usernameL = scanner.next();
					System.out.println("Digite sua senha: ");
					String senhaL = scanner.next();

					Autenticador.validaUsuario(usernameL, senhaL);
					break;
				case 2:
					System.out.println("Digite seu username: ");
					String usernameC = scanner.next();
					System.out.println("Digite sua senha: ");
					String senhaC = scanner.next();
					System.out.println("Digite seu email: ");
					String emailC = scanner.next();
					System.out.println("Digite seu cpf: ");
					String cpfC = scanner.next();

					Usuario usuario = new Usuario(usernameC, cpfC, emailC, senhaC);
					break;
			}
	}
}}
