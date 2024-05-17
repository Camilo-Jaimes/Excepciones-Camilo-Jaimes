import java.io.FilePermission;
import java.security.AccessControlException;

@SuppressWarnings("removal")
public class Excepcion65 {
public static void main(String[] args) {
        try {
            SecurityManager security = System.getSecurityManager();
            if (security != null) {
                security.checkPermission(new FilePermission("/path/to/protected/resource", "read"));
            }
            System.out.println("Operación realizada correctamente.");
        } catch (AccessControlException e) {
            System.out.println("Acceso denegado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
