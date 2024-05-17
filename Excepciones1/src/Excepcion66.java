import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class Excepcion66 {
public static void main(String[] args) {
        try {
            Paths.get("C:\\invalid\\path");
            System.out.println("Ruta válida.");
        } catch (InvalidPathException e) {
            System.out.println("Ruta inválida: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
