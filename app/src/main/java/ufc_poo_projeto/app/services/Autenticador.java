package ufc_poo_projeto.app.services;

import org.json.JSONArray;
import ufc_poo_projeto.app.entities.DadosUsuario;

import java.util.List;
import java.util.Optional;

public class Autenticador {

    public static boolean validaUsuario (String username, String senha) {
        JSONArray usuariosJson = GerenciaArquivosJson.carregarArquivo("usuarios.txt");
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
