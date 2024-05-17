import java.io.File;

public class Excepcion10 {
public static void main(String[] args) {
        try {
            File archivo = new File("C:\\archivo_importante.txt");
            archivo.delete();
        } catch (SecurityException e) {
            System.out.println("¡Error! Permiso denegado para eliminar el archivo.");
        }
    }
}
