import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {

    public MonedaApi buscarMonedas (){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/1367ebbff8c556c05085153f/latest/USD"))
                .build();
        HttpResponse<String> response= null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            MonedaApi json = new Gson().fromJson(response.body(), MonedaApi.class);
            return json;



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
