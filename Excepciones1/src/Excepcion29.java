public class Excepcion29 {
    public static void main(String[] args) {
        try {
            Class.forName("com.ejemplo.ClaseEliminada");
        } catch (Throwable e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
