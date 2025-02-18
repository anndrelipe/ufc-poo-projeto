package ufc_poo_projeto.app.entities;

public class Usuario{

    // Atributos
    private static int idNaoCadastrado = 0; // ID que será atribuído a um usuário que ainda não foi cadastrado
    private final int ID;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    // Construtor
    public Usuario(String nome, String cpf, String email, String senha){
        this.ID = idNaoCadastrado;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        idNaoCadastrado++; // Incrementa o ID que será atribuído a um usuário que ainda não foi cadastrado
    }


    // Métodos
    public int getId(){
        return this.ID;
    }

    public String getNome(){
        return this.nome;
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

    public int getidNaoCadastrado() {
        return idNaoCadastrado;
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


}