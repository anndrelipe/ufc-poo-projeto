package ufc_poo_projeto.app.services;

import java.util.List;

public interface IConverteDados {
    <T> T mapeiaParaObjeto (String json, Class<T> classe);
    <T> List<T> mapeiaParaListaDeObjetos (String json, Class<T> classe);
}
