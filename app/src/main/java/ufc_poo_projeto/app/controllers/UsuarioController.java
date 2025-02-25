package ufc_poo_projeto.app.controllers;

import org.json.JSONArray;
import org.json.JSONObject;
import ufc_poo_projeto.app.entities.DadosEstado;
import ufc_poo_projeto.app.entities.DadosUsuario;
import ufc_poo_projeto.app.entities.Genero;
import ufc_poo_projeto.app.entities.Usuario;
import ufc_poo_projeto.app.services.ConverteDados;
import ufc_poo_projeto.app.services.GerenciaArquivosJson;

import java.util.List;
import java.util.Optional;

public class UsuarioController {

    private static DadosUsuario usuario;

    public static DadosUsuario buscarUsuarioPorNome (String nome) {
        JSONArray usuariosJson = GerenciaArquivosJson.carregarArquivo("usuarios.txt");
        ConverteDados converteDados = new ConverteDados();

        List<DadosUsuario> usuarios =  converteDados.mapeiaParaListaDeObjetos(usuariosJson.toString(), DadosUsuario.class);
        Optional<DadosUsuario> optionalUsuario = usuarios.stream().filter(u -> u.getNome().equals(nome)).findFirst();

        // ADICIONAR TRATAMENTO DE ERRO
        return optionalUsuario.orElse(null);
    }

    public static void alteraInformacoes (DadosUsuario antigoUsuario, String nome, String cpf, String email, double saldo ,String genero) {
        JSONArray usuariosJson = GerenciaArquivosJson.carregarArquivo("usuarios.txt");
        ConverteDados converteDados = new ConverteDados();

        List<DadosUsuario> usuarios = converteDados.mapeiaParaListaDeObjetos(usuariosJson.toString(), DadosUsuario.class);
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i));
            if (usuarios.get(i).getId() == antigoUsuario.getId()) {
                System.out.println("ACHEI" + usuarios.get(i).getNome());
                JSONObject usuarioMudado = new JSONObject();
                usuarioMudado.put("id", antigoUsuario.getId());
                usuarioMudado.put("nome", nome);
                usuarioMudado.put("cpf", cpf);
                usuarioMudado.put("email", email);
                usuarioMudado.put("senha", antigoUsuario.getSenha());
                usuarioMudado.put("saldo", saldo);
                usuarioMudado.put("genero", Genero.fromString(genero));
                usuariosJson.put(i, usuarioMudado);
            }
        }

        GerenciaArquivosJson.EscreverESalvarArquivo("usuarios.txt", usuariosJson.toString(4));
        System.out.println("USUARIO EDITADO");
    }
}
