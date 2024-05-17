import java.security.InvalidParameterException;

public class Excepcion49 {
public static void main(String[] args) {
        try {
            int radius = -5; 
            if (radius <= 0) {
                throw new InvalidParameterException("El radio debe ser mayor que cero.");
            }

            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Área del círculo: " + area);
        } catch (InvalidParameterException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
