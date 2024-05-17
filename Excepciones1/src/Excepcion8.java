public class Excepcion8 {
    public static void main(String[] args) {
        String nombre = null;

        try {
            System.out.println("¡Hola " + nombre + "!");
        } catch (NullPointerException e) {
            System.out.println("¡Error! La variable 'nombre' es nula.");
        }
    }
}
