public class Excepcion22 {
    public static void main(String[] args) {
        try {
        } catch (UnsupportedClassVersionError e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
