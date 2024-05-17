public class Excepcion26 {
    public static void main(String[] args) {
        try {
            Class.forName("com.ejemplo.ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
