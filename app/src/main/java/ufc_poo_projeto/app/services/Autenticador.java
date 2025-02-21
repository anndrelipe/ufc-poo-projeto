package ufc_poo_projeto.app.services;

import org.json.JSONArray;
import ufc_poo_projeto.app.entities.DadosUsuario;
import ufc_poo_projeto.app.entities.Usuario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Autenticador {

    private static JSONArray carregarUsuarios() {
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

    // ADICIONAR TRATAMENTO DE ERRO
    public static boolean validaUsuario (String username, String senha) {
        JSONArray usuariosJson = carregarUsuarios();
        ConverteDados converteDados = new ConverteDados();

        List<DadosUsuario> usuarios = converteDados.mapeiaParaListaDeObjetos(usuariosJson.toString(), DadosUsuario.class);
        Optional<DadosUsuario> optionalDadosUsuario = usuarios.stream().filter(u -> u.getNome().equals(username)).findFirst();

        // LANÇAR MESMA EXCEPTION PARA ERRO DE VALIDAÇÃO GENERICO.
        if (optionalDadosUsuario.isPresent()) {
            if (optionalDadosUsuario.get().getSenha().equals(senha)) {
                System.out.print("VALIDADO O USUARIO");
                return true;
            }
            System.out.println("SENHA INCORRETA");
            return false;
        }
        System.out.println("NÃO EXISTE USUARIO COM ESSE USERNAME");
        return false;
    }
}
