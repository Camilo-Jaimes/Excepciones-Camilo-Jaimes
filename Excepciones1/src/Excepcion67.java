import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Excepcion67 {
public static void main(String[] args) {
        String filePath = "archivo.txt";

        try {
            Files.createFile(Paths.get(filePath));
            System.out.println("Archivo creado correctamente.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("El archivo ya existe: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
