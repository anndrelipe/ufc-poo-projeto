package ufc_poo_projeto.app.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import ufc_poo_projeto.app.exceptions.ConversaoDeDadosException;
import ufc_poo_projeto.app.exceptions.JsonInvalidoException;

import java.util.List;

public class ConverteDados implements IConverteDados{

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T mapeiaParaObjeto(String json, Class<T> classe) {
        try {
            return this.mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new JsonInvalidoException("Erro ao converter JSON para objeto: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new ConversaoDeDadosException("Erro durante a conversão de dados: " + e.getMessage(), e);
        }
    }

    @Override
    public <T> List<T> mapeiaParaListaDeObjetos(String json, Class<T> classe) {
        CollectionType lista = this.mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);

        try {
            return this.mapper.readValue(json, lista);
        } catch (JsonProcessingException e) {
            throw new JsonInvalidoException("Erro ao converter JSON para objeto: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new ConversaoDeDadosException("Erro durante a conversão de dados: " + e.getMessage(), e);
        }
    }
}
