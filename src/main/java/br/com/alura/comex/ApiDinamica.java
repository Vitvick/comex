package br.com.alura.comex;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ApiDinamica {

    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o id do produto");
            int idProduto = leitura.nextInt();

            String endereco =  "https://fakestoreapi.com/products/" + idProduto;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);



        } catch (InputMismatchException e){
            System.out.println("Erro! você digitou um valor não numérico");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}
