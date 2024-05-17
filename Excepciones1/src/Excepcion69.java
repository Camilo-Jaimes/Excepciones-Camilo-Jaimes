import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;

public class Excepcion69 {
public static void main(String[] args) {
        String input = "Hello, world!";

        try {
            MessageDigest md = MessageDigest.getInstance("InvalidAlgorithm");
            byte[] digest = md.digest(input.getBytes());
            System.out.println("Mensaje resumido: " + new String(digest));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algoritmo no válido: " + e.getMessage());
            e.printStackTrace();
        } catch (ProviderException e) {
            System.out.println("Error interno del proveedor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
