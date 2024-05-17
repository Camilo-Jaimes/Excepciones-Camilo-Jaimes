import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class Excepcion62 {
public static void main(String[] args) {
        String keystoreFile = "keystore.jks";
        String keystorePassword = "password";
        String alias = "myalias";
        String keyPassword = "keypassword";

        try {
            @SuppressWarnings("unused")
            PrivateKey privateKey = cargarClavePrivada(keystoreFile, keystorePassword, alias, keyPassword);
            System.out.println("Clave privada cargada correctamente.");
        } catch (UnrecoverableKeyException e) {
            System.out.println("Error al cargar la clave privada: " + e.getMessage());
            e.printStackTrace();
        } catch (NoSuchAlgorithmException | KeyStoreException | IOException | CertificateException e) {
            e.printStackTrace();
        }
    }

    public static PrivateKey cargarClavePrivada(String keystoreFile, String keystorePassword, String alias, String keyPassword)
            throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, IOException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        try (FileInputStream fis = new FileInputStream(keystoreFile)) {
            keyStore.load(fis, keystorePassword.toCharArray());
        }
        return (PrivateKey) keyStore.getKey(alias, keyPassword.toCharArray());
    }
}
