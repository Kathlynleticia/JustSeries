package br.com.justseries;

import br.com.justseries.principal.Principal;
import br.com.justseries.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustSeriesApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository respositorio;

	public static void main(String[] args) {
		SpringApplication.run(JustSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(respositorio);
		principal.exibeMenu();
	}
}
