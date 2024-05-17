public class Excepcion15 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            var Array = new Integer[1000 * 1000 * 1000];
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Memoria insuficiente para crear el arreglo.");
        }
    }
}
