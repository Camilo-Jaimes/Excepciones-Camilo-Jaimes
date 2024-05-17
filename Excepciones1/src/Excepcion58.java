import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

public class Excepcion58 {
public static void main(String[] args) {
        String sourceFile = "archivo.txt";
        String zipFile = "archivo.zip";

        try {
            comprimirArchivo(sourceFile, zipFile);
            System.out.println("Archivo comprimido correctamente.");
        } catch (ZipException e) {
            System.out.println("Error al comprimir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void comprimirArchivo(String sourceFile, String zipFile) throws ZipException {
        try {
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            FileInputStream fis = new FileInputStream(sourceFile);
            ZipEntry ze = new ZipEntry(sourceFile);
            zos.putNextEntry(ze);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
            fis.close();
            zos.closeEntry();
            zos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new ZipException("Error de entrada/salida al comprimir el archivo");
        }
    }
}
