import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excepcion35 {
public static void main(String[] args) {
        String[] flores = { "Ageratum", "Allium", "Poppy", "Catmint" };

        List<String> listaFloresMutable = new ArrayList<>(Arrays.asList(flores));

        listaFloresMutable.add("Celosia");

        System.out.println("Lista de flores actualizada: " + listaFloresMutable);
    }
}
