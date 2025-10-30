package Model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numero_Episodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodios dadosEpisodios) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodios.titulo();
        this.numero_Episodio = dadosEpisodios.numero_EP();

        try{
            this.avaliacao = Double.valueOf(dadosEpisodios.avaliacao());
            this.dataLancamento =LocalDate.parse(dadosEpisodios.datalancamento());

        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }catch (DateTimeParseException ex) {
            this.dataLancamento = null;

        }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero_Episodio() {
        return numero_Episodio;
    }

    public void setNumero_Episodio(Integer numero_Episodio) {
        this.numero_Episodio = numero_Episodio;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numero_Episodio=" + numero_Episodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;

    }
}
