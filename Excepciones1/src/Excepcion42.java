import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Excepcion42 {
public static void main(String[] args) {
        try {
            ResourceBundle myResources = ResourceBundle.getBundle("MyResources");

            String greeting = myResources.getString("greeting");
            String farewell = myResources.getString("farewell");

            System.out.println("Saludo: " + greeting);
            System.out.println("Despedida: " + farewell);
        } catch (MissingResourceException e) {
            System.err.println("Error: No se pudo cargar el archivo de recursos.");
        }
    }
}
