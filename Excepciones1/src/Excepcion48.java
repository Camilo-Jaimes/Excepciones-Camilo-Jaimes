import java.io.UnsupportedEncodingException;

public class Excepcion48 {
public static void main(String[] args) {
        try {
            String str = "GeeksforGeeks";
            byte[] bytes = str.getBytes("UTF-8"); 
            System.out.println("Given String: " + str);
            System.out.println("Output bytes: " + bytes);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error: El esquema de codificación no es compatible.");
        }
    }
}
