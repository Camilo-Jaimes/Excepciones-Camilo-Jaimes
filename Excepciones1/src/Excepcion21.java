public class Excepcion21 {
    public static void main(String[] args) {
        try {
            setPorcentaje(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void setPorcentaje(int porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100.");
        }
    }
}
