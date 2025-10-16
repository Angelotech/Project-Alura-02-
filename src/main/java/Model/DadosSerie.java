package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) /*ignora os demais das que não foram solicitados*/
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {

}
/**
 *  @JsonProperty   Mudar o nome real do campo no JSON	Quando quer definir o nome que aparece no JSON
 * @JsonAlias    	Aceitar vários nomes diferentes ao ler JSON	Quando o JSON pode vir com nomes diferentes
 *
 * Se você está criando sua própria API → use @JsonProperty.
 * Se você está consumindo APIs externas que mandam nomes diferentes → use @JsonAlias.
 */
