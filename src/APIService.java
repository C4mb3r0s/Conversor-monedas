import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class APIService {
    // Creamos dos variables privadas, una para la URL, y otra para tu ApiKey
    private String urlBase = "https://v6.exchangerate-api.com/v6/";
    // Ingresa tu ApiKey entre las comillas del contenido de la siguiente variable
    private String claveApi = "";

    // Creamos un metodo double ya que solo se retornara un valor de dicho tipo añadiendo las excepciones
    // y de igual manera esperando 3 parametros del main
    public double GestionDeConsulta(String monedaDeOrigen, String monedaDestino, double cantidad) throws IOException, InterruptedException {
        // Creamos el cliente
        HttpClient client = HttpClient.newHttpClient();
        // Creamos la peticion, al igual que la URI para realizar la peticion a la API, incluyendo los parametros
        // a esperar del main
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlBase + claveApi +"/pair/" + monedaDeOrigen + "/" + monedaDestino + "/" + cantidad))
                .build();

        // Se solicita la respuesta del cliente de tipo String
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // Abrimos un tipo Gson de la libreria del mismo nombre para la conversion de JSON
        Gson gson = new Gson();
        // Creamos un jsonResponse el cual, con el metodo fromJson, convierte la cadena del json a un jsonObject
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
        // Obtenemos el valor del conversion_result del objeto JsonObject, convirtiendolo a Double con el getAsDouble
        double conversionResult = jsonResponse.get("conversion_result").getAsDouble();
        // Retornamos el conversionResult
        return conversionResult;
    }
}
