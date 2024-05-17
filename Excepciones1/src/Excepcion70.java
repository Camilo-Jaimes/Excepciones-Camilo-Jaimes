import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;

public class Excepcion70 {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
        String providerName = "BC"; 

        try {
            Provider provider = Security.getProvider(providerName);
            if (provider != null) {
                System.out.println("Nombre: " + provider.getName());
                System.out.println("Versión: " + provider.getVersion());
                System.out.println("Info: " + provider.getInfo());
            } else {
                throw new NoSuchProviderException("El proveedor " + providerName + " no está disponible.");
            }
        } catch (NoSuchProviderException e) {
            System.out.println("Proveedor no encontrado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
