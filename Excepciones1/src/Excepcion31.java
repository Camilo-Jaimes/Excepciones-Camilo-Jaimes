import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Excepcion31 {
    public static void main(String[] args) {
        String fechaEntrada = "10/05/2024";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate fecha = LocalDate.parse(fechaEntrada, dateFormat);

            LocalDate nuevaFecha = fecha.plusDays(7);

            String resultado = nuevaFecha.format(dateFormat);
            System.out.println("Fecha después de sumar 7 días: " + resultado);
        } catch (Exception e) {
            System.err.println("Error al analizar la fecha: " + e.getMessage());
        }
    }
}
