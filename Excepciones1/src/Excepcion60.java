import java.security.InvalidAlgorithmParameterException;

public class Excepcion60 {
public static void main(String[] args) {
        try {
            throw new InvalidAlgorithmParameterException("Parámetros inválidos para el algoritmo");
        } catch (InvalidAlgorithmParameterException e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }
}
