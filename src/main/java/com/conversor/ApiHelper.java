package alura;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiHelper {

    public BigDecimal obterTaxaCambio(String converterDe, String converterPara) throws IOException {
        String apiKey = System.getenv("MY_EXCHANGE_RATE_API_KEY");

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalStateException("A variável de ambiente MY_EXCHANGE_RATE_API_KEY não está definida.");
        }

        String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + converterDe.toUpperCase();
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
        String rateString = conversionRates.get(converterPara.toUpperCase()).getAsString();
        return new BigDecimal(rateString);
    }
}
