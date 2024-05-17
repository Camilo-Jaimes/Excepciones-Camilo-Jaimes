import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;

public class Excepcion36 {
public static void main(String[] args) {
        LocalDate fechaRegistro = LocalDate.of(2022, 9, 15);
        LocalDate hoy = LocalDate.now();

        try {
            Duration tiempoDesdeRegistro = Duration.between(fechaRegistro, hoy);
            System.out.println("Días desde el registro: " + tiempoDesdeRegistro.toDays());
        } catch (DateTimeException e) {
            System.err.println("Error al calcular la diferencia de fechas: " + e.getMessage());
        }
    }
}
