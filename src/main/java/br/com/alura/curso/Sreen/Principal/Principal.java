package br.com.alura.curso.Sreen.Principal;

import Model.DadosEpisodios;
import Model.DadosSerie;
import Service.ConsumoAPI;
import Service.ConverteDados;

import java.util.Scanner;

public class Principal {

    public Scanner serie = new Scanner(System.in);

    private ConsumoAPI consumo = new ConsumoAPI();

    private ConverteDados conveersor = new ConverteDados();


    //padrão nomes para constantes o final é para valores que não podem ser modificados
    private String ENDERECO = "https://www.omdbapi.com/?t=";
    private String API_KEY = "&apikey=f87044f2";

    public void exibirMenu(){

        System.out.println("digite o nome da série para ser realizado a busca: ");
        var nomeSerie = serie.nextLine();
        var json = consumo.ObterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conveersor.obterDados(json, DadosSerie.class);

        System.out.println("Sua série foi encontrada: " + dados );





    }


}
