public class Excepcion25 {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        try {
            System.getSecurityManager().checkExit(0);
        } catch (SecurityException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
