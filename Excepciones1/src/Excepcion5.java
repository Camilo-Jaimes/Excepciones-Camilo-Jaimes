import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepcion5 {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Public\\archivo_no_encontrado.txt";

        try {
            FileReader reader = new FileReader(filePath);
            System.out.println((char) reader.read());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡Error! Archivo no encontrado: " + e.getMessage());
        }
    }

    
}
