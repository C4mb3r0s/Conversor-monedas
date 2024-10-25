import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class APIService {
    private String urlBase = "https://v6.exchangerate-api.com/v6/";
    private String claveApi = "1e75000eb93c8a2181b4da7c";

    public double GestionDeConsulta(String monedaDeOrigen, String monedaDestino, double cantidad) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlBase + claveApi +"/pair/" + monedaDeOrigen + "/" + monedaDestino + "/" + cantidad))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
        double conversionResult = jsonResponse.get("conversion_result").getAsDouble();
        return conversionResult;
    }
}
