package ufc_poo_projeto.app.services;

import org.json.JSONArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class GerenciaArquivosJson {
    private static String pathPadrao = "src/main/java/ufc_poo_projeto/app/tables/";

    public static void EscreverESalvarArquivo (String nomeArquivo, String texto) {
        if (!nomeArquivo.contains(".txt")) {
            nomeArquivo += ".txt";
        }

        try {
            FileWriter fileWriter = new FileWriter(pathPadrao + nomeArquivo);
            fileWriter.write(texto);
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static JSONArray carregarArquivo (String nomeArquivo) {
        if (!nomeArquivo.contains(".txt")) {
            nomeArquivo += ".txt";
        }

        File arquivo = new File(pathPadrao + nomeArquivo);

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
