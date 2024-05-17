import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Excepcion13 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Elemento1", "Elemento2");
        Iterator<String> iterador = lista.iterator();

        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("Todos los elementos han sido procesados.");
    }
}
