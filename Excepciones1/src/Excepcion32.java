import java.util.Stack;

public class Excepcion32 {
public static void main(String[] args) {
        Stack<Integer> miPila = new Stack<>();

        // Agregar elementos a la pila
        miPila.push(10);
        miPila.push(20);

        // Realizar operaciones solo si la pila no está vacía
        if (!miPila.isEmpty()) {
            int elemento1 = miPila.pop();
            System.out.println("Elemento extraído: " + elemento1);
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}
