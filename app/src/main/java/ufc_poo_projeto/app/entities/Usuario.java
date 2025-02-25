package ufc_poo_projeto.app.entities;

import org.json.JSONArray;
import org.json.JSONObject;
import ufc_poo_projeto.app.services.ConverteDados;
import ufc_poo_projeto.app.services.GerenciaArquivosJson;

import java.util.List;

public class Usuario{

    private final int ID;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Genero genero;
    private double saldo = 700.;

    public Usuario(String nome, String cpf, String email, String senha, String genero){
        this.ID = this.ultimoId() + 1;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.genero = Genero.fromString(genero);

        this.salvarUsuario(this.ID, nome, cpf, email, senha, this.saldo, this.genero.name());
    }

    public int getId(){
        return this.ID;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    private int ultimoId () {
        int ultimoID = 0;
        JSONArray usuariosJson = GerenciaArquivosJson.carregarArquivo("usuarios.txt");
        ConverteDados converteDados = new ConverteDados();

        List<DadosUsuario> usuarios = converteDados.mapeiaParaListaDeObjetos(usuariosJson.toString(), DadosUsuario.class);
        if (!usuarios.isEmpty()) {
            ultimoID =  usuarios.getLast().getId();
        }
        return ultimoID;
    }

    private void salvarUsuario(int id, String nome, String cpf, String email, String senha, double saldo ,String genero) {
        try {
            JSONArray usuarios = GerenciaArquivosJson.carregarArquivo("usuarios.txt");

            JSONObject novoUsuario = new JSONObject();
            novoUsuario.put("id", id);
            novoUsuario.put("nome", nome);
            novoUsuario.put("cpf", cpf);
            novoUsuario.put("email", email);
            novoUsuario.put("senha", senha);
            novoUsuario.put("saldo", saldo);
            novoUsuario.put("genero", genero);

            usuarios.put(novoUsuario);
            GerenciaArquivosJson.EscreverESalvarArquivo("usuarios.txt", usuarios.toString(4));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}