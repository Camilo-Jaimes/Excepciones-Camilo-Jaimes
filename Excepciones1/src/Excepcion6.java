public class Excepcion6 {
    public static void main(String[] args) {
        try {
            // Ejemplo de argumento inválido: tipo de dato
            int edad = -10;
            setEdad(edad);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argumento inválido: " + e.getMessage());
        }

        try {
            // Ejemplo de argumento inválido: valor fuera de rango
            int numero = 201;
            validarRango(numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argumento inválido: " + e.getMessage());
        }
    }

    private static void validarRango(int numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarRango'");
    }

    private static void setEdad(int edad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEdad'");
    }
}
