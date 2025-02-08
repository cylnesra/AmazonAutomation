package apiutils;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class TestRailAPI {

    private static final String BASE_URL = "https://freelancerr.testrail.io/index.php?/api/v2/";
    private static final String USERNAME = "cylnesra@yandex.com";
    private static final String API_KEY = "1Ry8y3dw7T1XSv6Df3nA-Tco0Wgdikz.3xMrD5n3r";

    public static void addTestResult(int testCaseId, int statusId, String comment) {
        try {
            String endpoint = BASE_URL + "add_result_for_case/1/" + testCaseId;
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String userCredentials = USERNAME + ":" + API_KEY;
            String basicAuth = "Basic " + Base64.getEncoder().encodeToString(userCredentials.getBytes());
            connection.setRequestProperty("Authorization", basicAuth);

            // İstek türünü ve başlıkları ayarlayın
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Gönderilecek veriyi oluşturun
            JSONObject jsonBody = new JSONObject();
            jsonBody.put("status_id", statusId); // Testin durumu (1: passed, 5: failed)
            jsonBody.put("comment", comment); // Test açıklaması

            // İsteği gönderin
            OutputStream os = connection.getOutputStream();
            byte[] input = jsonBody.toString().getBytes("utf-8");
            os.write(input, 0, input.length);

            // Yanıt kodunu al ve logla
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Test result successfully sent to TestRail.");
            } else {
                System.out.println("Failed to send test result. Response code: " + responseCode);
                InputStream errorStream = connection.getErrorStream();
                if (errorStream != null) {
                    String response = new String(errorStream.readAllBytes(), StandardCharsets.UTF_8);
                    System.out.println("Error response: " + response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
