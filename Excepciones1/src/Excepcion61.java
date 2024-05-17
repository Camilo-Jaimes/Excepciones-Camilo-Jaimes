import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class Excepcion61 {
public static void main(String[] args) {
        String archivoSerializado = "objeto_serializado.ser";
        
        try {
            @SuppressWarnings("unused")
            Object objetoDeserializado = deserializarObjeto(archivoSerializado);
            System.out.println("Objeto deserializado correctamente.");
        } catch (InvalidClassException e) {
            System.out.println("Error durante la deserialización: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializarObjeto(String archivoSerializado) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(archivoSerializado);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        }
    }
}
