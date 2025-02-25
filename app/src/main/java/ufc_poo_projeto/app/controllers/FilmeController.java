package ufc_poo_projeto.app.controllers;

import ufc_poo_projeto.app.entities.DadosFilme;
import ufc_poo_projeto.app.entities.Estado;
import ufc_poo_projeto.app.entities.Filme;
import ufc_poo_projeto.app.services.ConsumidorAPI;
import ufc_poo_projeto.app.services.ConverteDados;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

public class FilmeController extends AbstractController<Filme>{

    @Override
    public Filme procurarPorTitulo(String titulo) {
        ConverteDados converteDados = new ConverteDados();
        String json = ConsumidorAPI.extrairDados("https://www.omdbapi.com/?t="+ URLEncoder.encode(titulo, StandardCharsets.UTF_8) +"&apikey=dfe7e4c7");
        DadosFilme dadosFilme = converteDados.mapeiaParaObjeto(json, DadosFilme.class);

        return new Filme(dadosFilme);
    }

    @Override
    public List<Filme> listarTodas(List<Filme> filmes) {
        return filmes;
    }

    @Override
    public void adicionar(Filme titulo, List<Filme> filmes) {
        filmes.add(titulo);
    }

    @Override
    public void remover(String titulo, List<Filme> filmes) {
        Optional<Filme> filmeOptional = filmes.stream().filter(f -> f.getTitulo().equalsIgnoreCase(titulo)).findFirst();
        if (filmeOptional.isPresent()) {
            System.out.println("DELETADO: " + filmeOptional.get());
            filmes.remove(filmeOptional.get());
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
