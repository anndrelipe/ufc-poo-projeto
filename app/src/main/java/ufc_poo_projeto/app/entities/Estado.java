package ufc_poo_projeto.app.entities;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private int userID;
	private List<Filme> filmes;
	private List<Filme> carrinho;

	public Estado(int userID) {
		this.userID = userID;
		this.filmes = new ArrayList<>();
		this.carrinho = new ArrayList<>();
	}

	public Estado (DadosEstado dadosEstado) {
		this.userID = dadosEstado.getUserID();
		this.filmes = new ArrayList<>(dadosEstado.getFilmes().stream().map(Filme::new).toList());
		this.carrinho = new ArrayList<>(dadosEstado.getCarrinho().stream().map(Filme::new).toList());
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public List<Filme> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Filme> carrinho) {
		this.carrinho = carrinho;
	}
}
