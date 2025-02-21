package ufc_poo_projeto.app.entities;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private int userID;
	private List<Filme> filmesAlugados;
	public Estado(int userID) {
		this.userID = userID;
		this.filmesAlugados = new ArrayList<>();
	}
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public List<Filme> getFilmesAlugados() {
		return filmesAlugados;
	}

	public void setFilmesAlugados(List<Filme> filmesAlugados) {
		this.filmesAlugados = filmesAlugados;
	}
	
}
