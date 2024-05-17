import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Excepcion53 {
public static void main(String[] args) {
        try {
            Context context = new InitialContext();
            
            String nombreObjeto = "HelloWorldBean";
            Object objeto = context.lookup(nombreObjeto);
            
            
            System.out.println("Objeto encontrado: " + objeto);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}

