package br.com.alura.curso.Sreen;

import Model.DadosSerie;
import Model.Dadoserie;
import Service.ConsumoAPI;
import Service.ConverteDados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SreenApplication {
	public static void main(String[] args) {
		SpringApplication.run(SreenApplication.class, args);

		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.ObterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=f87044f2");
		System.out.println(json);
		System.out.println("----------");
		ConverteDados conversor =  new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);






	}

}
