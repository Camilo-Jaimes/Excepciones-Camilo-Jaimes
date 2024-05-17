public class Excepcion2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        try {
            System.out.println(numeros[11]); // Se intenta acceder al índice 11, que está fuera del rango del array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error! Se ha intentado acceder a un índice fuera del rango del array.");
            System.out.println("Índice inválido: " + e.getMessage());
        }
    }
}
