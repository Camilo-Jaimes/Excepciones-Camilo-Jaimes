import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SyncFailedException;
import java.nio.file.Files;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileTime;

public class Excepcion68 {
public static void main(String[] args) {
        String filePath = "archivo.txt";

        try {
            File file = new File(filePath);
            FileWriter writer = new FileWriter(file);
            writer.write("Contenido del archivo");
            writer.close();
            Files.setAttribute(file.toPath(), "dos:hidden", true); // Oculta el archivo
            Files.getFileAttributeView(file.toPath(), DosFileAttributeView.class).setTimes(FileTime.fromMillis(0), null, null);
            System.out.println("Archivo sincronizado correctamente.");
        } catch (SyncFailedException e) {
            System.out.println("Fallo en la sincronización del archivo: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
