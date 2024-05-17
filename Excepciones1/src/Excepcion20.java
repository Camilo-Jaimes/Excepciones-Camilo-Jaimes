public class Excepcion20 {
    enum Colores { ROJO, VERDE, AZUL }

    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            Colores color = Colores.valueOf("AMARILLO");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: La constante de enumeración no existe.");
        }
    }
}
