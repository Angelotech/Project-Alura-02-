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


/*
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.ObterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=f87044f2");
		System.out.println(json);
		System.out.println("-----SÉRIE---");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		System.out.println("----EPIS-----");
		var jsonEpisodio = consumoAPI.ObterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=f87044f2");
		DadosEpisodios episodios = conversor.obterDados(jsonEpisodio, DadosEpisodios.class);
		System.out.println(episodios);

		List<DadosTEmporada> Total = new ArrayList<>();

		System.out.println("------TEMPORADAS----");

		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			var jsonTemporadas = consumoAPI.ObterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=f87044f2");
			DadosTEmporada Temporadas = conversor.obterDados(jsonTemporadas, DadosTEmporada.class);
			Total.add(Temporadas);
		}
		Total.forEach(System.out::println);
*/


	}

}
