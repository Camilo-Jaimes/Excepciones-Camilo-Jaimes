public class Excepcion9 {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("Número entero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("¡Error! No se puede convertir a entero:");
            System.out.println("Cadena: " + cadena);
            System.out.println("Motivo: " + e.getMessage());
        }
    }
}
