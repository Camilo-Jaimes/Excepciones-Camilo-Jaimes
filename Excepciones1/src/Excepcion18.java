public class Excepcion18 {
    public static void main(String[] args) {
        try {
            assert false : "Demostración de AssertionError";
        } catch (AssertionError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
