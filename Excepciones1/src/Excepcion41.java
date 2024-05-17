import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion41 {
public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.err.println("Error: Ingresa un número entero válido.");
        }
    }
}
