package ufc_poo_projeto.app.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DadosEstado {

    private int userID;
    private List<DadosFilme> filmes;
    private List<DadosFilme> carrinho;

    @JsonCreator
    public DadosEstado (
            @JsonProperty("userID") int userID,
            @JsonProperty("filmes") List<DadosFilme> filmes,
            @JsonProperty("carrinho") List<DadosFilme> carrinho
    ) {
        this.userID = userID;
        this.filmes = filmes;
        this.carrinho = carrinho;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<DadosFilme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<DadosFilme> filmes) {
        this.filmes = filmes;
    }

    public List<DadosFilme> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<DadosFilme> carrinho) {
        this.carrinho = carrinho;
    }
}
