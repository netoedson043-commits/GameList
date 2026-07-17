package Jogo.Gamilist20.Modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record JogoRawg(@JsonAlias("metacritic") Integer avaliacao,
                       @JsonAlias("name") String nome,
                       @JsonAlias("released") String ano) {
}
