import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excepcion14 {
public static void main(String[] args) {
        List<String> listaModificable = new ArrayList<>(Arrays.asList("Elemento1", "Elemento2"));
        listaModificable.add("Elemento3"); // Ahora sí se permite agregar elementos
        System.out.println("La lista ahora contiene: " + listaModificable);
    }
}
