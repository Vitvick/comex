package br.com.alura.comex;

public class Api {

    import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Tarefa 6

    public class Api {
        public static void main(String[] args) throws RuntimeException {

            try {
                String endereco =  "https://fakestoreapi.com/products/1";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
