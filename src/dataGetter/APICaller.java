package dataGetter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICaller {
    /**
     * Gets a json for the list of items on warframe market
     * using the api request "https://api.warframe.market/v1/items".
     * @return a json string
     */
    public String getItemList(){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.warframe.market/v1/items"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response.body();
    }

    public String getItemOrders(String url_name){
        String url = String.format("https://api.warframe.market/v1/items/%s/orders?include=item", url_name);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .header("Platform", "pc")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response.body();
    }

    public APICaller() {
    }
}
