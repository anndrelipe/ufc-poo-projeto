package ufc_poo_projeto.app.services;

import org.json.JSONObject;
import ufc_poo_projeto.app.exceptions.APIResponseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumidorAPI {

    public static String extrairDados (String url) {
        HttpResponse<String> res = null;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            res = client.send(req, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (res.body() == null) {
            throw new APIResponseException("Resposta da API inválida ou malformada.");
        }

        return res.body();
    }
    public static String postagemDados (String url, JSONObject body) {
        HttpResponse<String> res = null;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://libretranslate.com/translate"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body.toString()))
                .build();

        try {
            res = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (res.body() == null) {
            throw new APIResponseException("Resposta da API inválida ou malformada.");
        }

        return res.body();
    }
}
