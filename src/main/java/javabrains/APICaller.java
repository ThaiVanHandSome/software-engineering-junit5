package javabrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APICaller {

    public static String callApi(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Xử lý lỗi theo ý bạn
        }
    }

    public static void main(String[] args) {
        // Đường dẫn API mẫu (thay thế bằng API thực tế)
        String apiUrl = "http://localhost:3000/api/seafoods";

        // Gọi API và in kết quả lên màn hình
        String apiResponse = callApi(apiUrl);
        System.out.println(apiResponse);
    }
}

