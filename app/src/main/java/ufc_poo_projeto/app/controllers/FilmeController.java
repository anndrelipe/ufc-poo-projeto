package ufc_poo_projeto.app.controllers;

import ufc_poo_projeto.app.entities.DadosFilme;
import ufc_poo_projeto.app.entities.Filme;
import ufc_poo_projeto.app.services.ConsumidorAPI;
import ufc_poo_projeto.app.services.ConverteDados;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilmeController extends AbstractController<Filme>{
    // Enquanto não existe persistência:
    private List<Filme> filmesAlugados = new ArrayList<>();

    @Override
    public Filme listar(String titulo) {
        Optional<Filme> filmeOptional = this.filmesAlugados.stream().filter(f -> f.getTitulo().equalsIgnoreCase(titulo)).findFirst();
        filmeOptional.ifPresent(System.out::println);
        return filmeOptional.orElse(null);
    }

    @Override
    public List<Filme> listarTodas() {
        this.filmesAlugados.forEach(System.out::println);
        return this.filmesAlugados;
    }

    @Override
    public void adicionar(String titulo) {
        // Adicionar tratamento de erro.
        ConverteDados converteDados = new ConverteDados();
        String json = ConsumidorAPI.extrairDados("https://www.omdbapi.com/?t="+ URLEncoder.encode(titulo, StandardCharsets.UTF_8) +"&apikey=dfe7e4c7");
        DadosFilme dadosFilme = converteDados.mapeiaParaObjeto(json, DadosFilme.class);
        Filme filme = new Filme(dadosFilme);

        System.out.println(filme);
        this.filmesAlugados.add(filme);
    }

    @Override
    public void remover(String titulo) {
        // Adicionar tratamento de erro
        Optional<Filme> filmeOptional = this.filmesAlugados.stream().filter(f -> f.getTitulo().equalsIgnoreCase(titulo)).findFirst();
        if (filmeOptional.isPresent()) {
            System.out.println("DELETADO: " + filmeOptional.get());
            this.filmesAlugados.remove(filmeOptional.get());
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
