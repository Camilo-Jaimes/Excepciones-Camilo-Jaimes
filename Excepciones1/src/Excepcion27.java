public class Excepcion27 {
    public static void main(String[] args) {
        try {
            Class<?> clase = Class.forName("java.lang.Integer");
            @SuppressWarnings({ "deprecation", "unused" })
            Object instancia = clase.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Excepción capturada: No se puede instanciar.");
        } catch (IllegalAccessException e) {
            System.out.println("Excepción capturada: Acceso ilegal.");
        } catch (ClassNotFoundException e) {
            System.out.println("Excepción capturada: Clase no encontrada.");
        }
    }
}
