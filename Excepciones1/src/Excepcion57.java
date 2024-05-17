import java.io.InvalidObjectException;

public class Excepcion57 {
    public static void main(String[] args) {
        try {
            throw new InvalidObjectException("El objeto deserializado no es válido");
        } catch (InvalidObjectException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
