package ufc_poo_projeto.app.services;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.json.JSONArray;

import org.json.JSONObject;
import ufc_poo_projeto.app.entities.DadosEstado;
import ufc_poo_projeto.app.entities.Estado;
import ufc_poo_projeto.app.exceptions.ConversaoDeDadosException;
import ufc_poo_projeto.app.exceptions.EstadoNaoEncontradoException;
import ufc_poo_projeto.app.exceptions.GerenciadorEstadoException;

public class GerenciadorEstado {
	private Estado estadoAtual;

	public void salvarEstadoAtual() throws FileNotFoundException {

		try {
			JSONArray estadosJson = GerenciaArquivosJson.carregarArquivo("estados.txt");
			ConverteDados converteDados = new ConverteDados();

			List<DadosEstado> estados = converteDados.mapeiaParaListaDeObjetos(estadosJson.toString(), DadosEstado.class);
			Optional<DadosEstado> estadoOptional = estados.stream().filter(e -> e.getUserID()==this.estadoAtual.getUserID()).findFirst();

			JSONObject novoEstado = new JSONObject();
			novoEstado.put("userID", this.estadoAtual.getUserID());
			novoEstado.put("filmes", this.estadoAtual.getFilmes());
			novoEstado.put("carrinho", this.estadoAtual.getCarrinho());

			if(estadoOptional.isPresent()) {
				for (int i = 0; i < estados.size(); i++) {
					if (estadoOptional.get().equals(estados.get(i))) {
						estadosJson.remove(i);
					}
				}
			}

			estadosJson.put(novoEstado);
			GerenciaArquivosJson.EscreverESalvarArquivo("estados.txt", estadosJson.toString(4));
		} catch (ConversaoDeDadosException e) {
			throw new ConversaoDeDadosException("Erro ao converter dados: " + e.getMessage(), e);
		} catch (Exception e) {
			throw new GerenciadorEstadoException("Erro ao salvar estado atual: " + e.getMessage(), e);
		}
	}

	public Estado getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(int userID) throws FileNotFoundException {
		try {
			JSONArray estadosJson = GerenciaArquivosJson.carregarArquivo("estados.txt");
			ConverteDados converteDados = new ConverteDados();

			List<DadosEstado> estados = converteDados.mapeiaParaListaDeObjetos(estadosJson.toString(), DadosEstado.class);
			Optional<DadosEstado> estadoOptional = estados.stream().filter(e -> e.getUserID()==userID).findFirst();
			if(estadoOptional.isPresent()) {
				this.estadoAtual = new Estado(estadoOptional.get());
			}
			else {
				this.estadoAtual = new Estado(userID);
			}
		} catch (ConversaoDeDadosException e) {
			throw new ConversaoDeDadosException("Erro ao converter dados: " + e.getMessage(), e);
		} catch (EstadoNaoEncontradoException e) {
			throw new EstadoNaoEncontradoException("Estado não encontrado para o userID: " + userID, e);
		} catch (Exception e) {
			throw new GerenciadorEstadoException("Erro ao definir estado atual: " + e.getMessage(), e);
		}
	}
}
