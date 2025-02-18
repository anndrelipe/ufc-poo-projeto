package ufc_poo_projeto.app.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosFilme(
		@JsonAlias("Title") String titulo, 
		@JsonAlias("Year") String anoLancamento,
		@JsonAlias("Released") String dataLancamento,
		@JsonAlias("Runtime") String duracao,
		@JsonAlias("Genre") String genero,
		@JsonAlias("Director") String diretor,
		@JsonAlias("Actors") String atores,
		@JsonAlias("Plot") String sinopse,
		@JsonAlias("Country") String pais,
		@JsonAlias("Poster") String capa
		) {
	
}
