package ufc_poo_projeto.app.services;

import org.json.JSONArray;
import ufc_poo_projeto.app.entities.DadosUsuario;
import ufc_poo_projeto.app.exceptions.ConversaoDeDadosException;
import ufc_poo_projeto.app.exceptions.ValidacaoUsuarioException;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public class Autenticador {

    public static boolean validaUsuario (String username, String senha) {
        try {
            JSONArray usuariosJson = GerenciaArquivosJson.carregarArquivo("usuarios.txt");
            ConverteDados converteDados = new ConverteDados();

            List<DadosUsuario> usuarios = converteDados.mapeiaParaListaDeObjetos(usuariosJson.toString(), DadosUsuario.class);
            Optional<DadosUsuario> optionalDadosUsuario = usuarios.stream().filter(u -> u.getNome().equals(username)).findFirst();

            if (optionalDadosUsuario.isPresent()) {
                if (optionalDadosUsuario.get().getSenha().equals(senha)) {
                    System.out.print("VALIDADO O USUARIO");
                    return true;
                }
            }
            throw new ValidacaoUsuarioException("Erro durante o login, verifique suas credênciais!");
        } catch (ConversaoDeDadosException e) {
            throw new ConversaoDeDadosException("Erro de conversão de tipo durante a validação de usuário.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro de carregamento de arquivo durante a validação de usuário.");
        }
    }
}
