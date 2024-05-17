import java.util.ResourceBundle;

public class Excepcion34 {
private static final String FILENAME = "resources/skyscrapper"; // Nombre completo con ruta relativa
private static ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);

public static String getProperty(final String key) {
    String value = null;
    if (resourceBundle != null) {
        value = resourceBundle.getString(key);
    } else {
    }
    return value;
}
}
