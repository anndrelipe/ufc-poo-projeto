package ufc_poo_projeto.app.controllers;

import java.util.List;

public abstract class AbstractController<T> {
    public abstract T listar(String titulo);
    public abstract List<T> listarTodas();
    public abstract void adicionar(String titulo);
    public abstract void remover(String titulo);
}
