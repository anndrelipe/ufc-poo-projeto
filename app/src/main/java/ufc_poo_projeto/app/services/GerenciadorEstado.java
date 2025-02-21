package ufc_poo_projeto.app.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.json.JSONArray;

import ufc_poo_projeto.app.entities.Estado;

public class GerenciadorEstado {
	private Estado estadoAtual;
	
	private JSONArray carregarEstados() {
	        File arquivo = new File("src/main/java/ufc_poo_projeto/app/tables/states.txt");

	        if (!arquivo.exists()) {
	            return new JSONArray();
	        }

	        try (Scanner scanner = new Scanner(new FileReader(arquivo))) {
	            StringBuilder jsonContent = new StringBuilder();

	            while (scanner.hasNextLine()) {
	                jsonContent.append(scanner.nextLine());
	            }

	            return new JSONArray(jsonContent.toString());
	        } catch (FileNotFoundException e) {
	            throw new RuntimeException(e);
	        }
	    
		
		
	}
	
	
	public void salvarEstadoAtual(){
		JSONArray estadosAntigo = this.carregarEstados();
		ConverteDados converteDados = new ConverteDados();
		
		List<Estado> estados = converteDados.mapeiaParaListaDeObjetos(estadosAntigo.toString(), Estado.class);
		Optional<Estado> estadoOptional = estados.stream().filter(e -> e.getUserID()==estadoAtual.getUserID()).findFirst();
		if(estadoOptional.isPresent()) {
			for(Estado estado : estados) {
				if(estado.equals(estadoOptional.get())) {
					estado = this.estadoAtual;
				}
			}
		}
		else {
//			estados.add(estadoAtual);
			
		}
		
	}
	


	public Estado getEstadoAtual() {
		return estadoAtual;
	}


	public void setEstadoAtual(int userID) {
		JSONArray estadosJson = this.carregarEstados();
		ConverteDados converteDados = new ConverteDados();
		
		List<Estado> estados = converteDados.mapeiaParaListaDeObjetos(estadosJson.toString(), Estado.class);
		Optional<Estado> estadoOptional = estados.stream().filter(e -> e.getUserID()==userID).findFirst();
		if(estadoOptional.isPresent()) {
			this.estadoAtual = estadoOptional.get();
		}
		else {
			this.estadoAtual = new Estado(userID);
		}
		
	}
	
	
	
}
