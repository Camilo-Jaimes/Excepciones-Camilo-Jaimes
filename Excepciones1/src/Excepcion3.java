public class Excepcion3 {
    public static void main(String[] args) {
        Object obj = new String("Hola Mundo");

        try {
            // Intento de convertir a Cuenta (Clase incompatible)
            Cuenta cuenta = (Cuenta) obj;
            System.out.println("Se convirtió a Cuenta: " + cuenta);
        } catch (ClassCastException e) {
            System.out.println("¡Error! No se puede convertir a Cuenta.");
            System.out.println("Tipo de objeto actual: " + obj.getClass());
        }
    }
}

class Cuenta {
}
