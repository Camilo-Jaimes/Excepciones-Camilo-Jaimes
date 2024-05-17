public class Excepcion1 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una ArithmeticException: " + e.getMessage());
        }
    }
}
