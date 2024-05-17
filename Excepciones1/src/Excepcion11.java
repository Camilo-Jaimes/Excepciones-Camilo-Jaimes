public class Excepcion11 {
    public static void main(String[] args) {
        String texto = "Hola";
        try {
            char letra = texto.charAt(10); // Índice fuera del rango
            System.out.println("La letra es: " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
