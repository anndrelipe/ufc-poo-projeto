package ufc_poo_projeto.app.controllers;

import java.util.List;

public abstract class AbstractController<T> {
    public abstract T procurarPorTitulo(String titulo);
    public abstract List<T> listarTodas(List<T> listaTitulos);
    public abstract void adicionar(T titulo, List<T> listaTitulos);
    public abstract void remover(String titulo, List<T> listaTitulos);
}
