import java.util.EmptyStackException;
import java.util.Stack;

public class Excepcion40 {
public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        try {
            int topElement = myStack.peek();
            System.out.println("Elemento en la parte superior de la pila: " + topElement);
        } catch (EmptyStackException e) {
            System.err.println("Error: La pila está vacía.");
        }

        myStack.push(10);
        myStack.push(20);

        try {
            int newTopElement = myStack.peek();
            System.out.println("Nuevo elemento en la parte superior de la pila: " + newTopElement);
        } catch (EmptyStackException e) {
            System.err.println("Error: La pila está vacía después de agregar elementos.");
        }
    }
}
