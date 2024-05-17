import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Excepcion52 {
public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 8888);
            RemoteInterface server = (RemoteInterface) registry.lookup("RMI_EXAMPLE");

            String input = "Hello, World!";
            String result = server.capitalize(input);
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            System.err.println("Error al invocar el método remoto: " + e.getMessage());
        }
    }
}
