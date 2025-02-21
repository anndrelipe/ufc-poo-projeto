package ufc_poo_projeto.app.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Usuario{

    // Atributos
    private static int idNaoCadastrado = 1; // ID que será atribuído a um usuário que ainda não foi cadastrado
    private final int ID;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    // Construtor
    public Usuario(String nome, String cpf, String email, String senha){
        this.ID = idNaoCadastrado++;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;

        this.salvarUsuario(this.ID, nome, cpf, email, senha);
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

    private void salvarUsuario(int id, String nome, String cpf, String email, String senha) {
        try {
            JSONArray usuarios = this.carregarUsuarios();

            JSONObject novoUsuario = new JSONObject();
            novoUsuario.put("id", id);
            novoUsuario.put("nome", nome);
            novoUsuario.put("cpf", cpf);
            novoUsuario.put("email", email);
            novoUsuario.put("senha", senha);

            usuarios.put(novoUsuario);

            FileWriter fileWriter = new FileWriter("src/main/java/ufc_poo_projeto/app/tables/users.txt");
            fileWriter.write(usuarios.toString(4));
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private JSONArray carregarUsuarios() {
        File arquivo = new File("src/main/java/ufc_poo_projeto/app/tables/users.txt");

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
}