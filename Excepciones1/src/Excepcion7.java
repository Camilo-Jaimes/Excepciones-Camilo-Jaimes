import java.io.FileReader;
import java.io.IOException;

public class Excepcion7 {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Public\\archivo_no_encontrado.txt";

        try {
            FileReader reader = new FileReader(filePath);
            reader.close();
        } catch (IOException e) {
            System.out.println("¡Error! Se produjo una excepción de E/S.");
            System.out.println("Detalle del error: " + e.getMessage());
        }
    }
}
