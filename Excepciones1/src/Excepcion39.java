import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Excepcion39 {
public static void main(String[] args) {
        String fechaTexto = "15/09/2022"; // Cambia esta cadena a la fecha que desees analizar

        try {
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaTexto, dateFormat);
            System.out.println("Fecha analizada: " + fecha);
        } catch (DateTimeParseException e) {
            System.err.println("Error al analizar la fecha: " + e.getMessage());
        }
    }
}
