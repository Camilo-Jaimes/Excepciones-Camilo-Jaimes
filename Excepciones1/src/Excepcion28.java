public class Excepcion28 {
    static {
        if (true) { 
            throw new LinkageError("Error simulado de vinculación");
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("EjemploLinkageError");
        } catch (LinkageError e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
        }
    }
}
