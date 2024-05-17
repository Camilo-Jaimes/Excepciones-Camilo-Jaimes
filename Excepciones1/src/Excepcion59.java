import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;

public class Excepcion59 {
public static void main(String[] args) {
        String urlStr = "https://example.com";
        
        try {
            realizarConexionHttps(urlStr);
            System.out.println("Conexión HTTPS establecida correctamente.");
        } catch (SSLHandshakeException e) {
            System.out.println("Error durante el handshake SSL: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void realizarConexionHttps(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            System.out.println(content.toString());
        } finally {
            con.disconnect();
        }
    }
}
