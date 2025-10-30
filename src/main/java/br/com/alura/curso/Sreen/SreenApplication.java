package br.com.alura.curso.Sreen;

import br.com.alura.curso.Sreen.Principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SreenApplication {
	public static void main(String[] args) {
		SpringApplication.run(SreenApplication.class, args);

		Principal principal = new Principal();
		principal.exibirMenu();

	}
}
