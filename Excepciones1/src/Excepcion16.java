public class Excepcion16 {
    public static void metodoRecursivo(int numero) {
        metodoRecursivo(numero);
    }

    public static void main(String[] args) {
        try {
            metodoRecursivo(1);
        } catch (StackOverflowError e) {
            System.out.println("Error: Desbordamiento de pila por recursión infinita.");
        }
    }
}
