import java.util.Collections;
import java.util.List;

public class Excepcion38 {
public static void main(String[] args) {
        List<String> frutas = Collections.unmodifiableList(List.of("Manzana", "Banana", "Naranja"));

        try {
            frutas.add("Pera");
        } catch (UnsupportedOperationException e) {
            System.err.println("Error: No se puede agregar elementos a esta lista.");
        }
    }
}
