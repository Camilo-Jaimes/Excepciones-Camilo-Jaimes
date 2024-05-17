public class Excepcion24 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            int[] arreglo = new int[-1]; // Tamaño negativo
        } catch (NegativeArraySizeException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
