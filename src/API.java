import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class API {

    public static Double obtenerTasaCambio(String monedaBase, String monedaObjetivo) {
        String apiKey = Config.obtenerApiKey();
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            RespuestaTasaCambio datos = gson.fromJson(respuesta.body(), RespuestaTasaCambio.class);

            Map<String, Double> tasas = datos.obtenerTasasConversion();
            return tasas.get(monedaObjetivo);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return null;
        }
    }
}

