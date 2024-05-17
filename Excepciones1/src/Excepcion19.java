public class Excepcion19 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            int[] arreglo = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Tamaño de arreglo negativo.");
        }
    }
}
