import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class Excepcion55 {
public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            
            System.out.println("Instancia de Cipher creada correctamente.");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.err.println("Error al crear la instancia de Cipher: " + e.getMessage());
        }
    }
}
