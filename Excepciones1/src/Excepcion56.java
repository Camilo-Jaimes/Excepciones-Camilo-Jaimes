import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class Excepcion56 {
public static void main(String[] args) {
        String url = "jdbc:tuBaseDeDatosAqui";
        String user = "tuUsuarioAqui";
        String password = "tuContraseñaAqui";

        String sqlQuery = "TU CONSULTA SQL AQUÍ";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }
        } catch (SQLSyntaxErrorException e) {
            System.err.println("Error de sintaxis en la consulta SQL: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }
}
