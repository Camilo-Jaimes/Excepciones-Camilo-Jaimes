
import java.util.ArrayList;
import java.util.Iterator;

public class Excepcion4{

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        Thread modificadorHilo = new Thread(() -> {
            lista.remove(0); 
            lista.add("Elemento nuevo"); 
        });

        Thread iteradorHilo = new Thread(() -> {
            Iterator<String> iterador = lista.iterator();
            while (iterador.hasNext()) {
                System.out.println(iterador.next()); 
            }
        });

        modificadorHilo.start(); // 
        iteradorHilo.start(); 

        try {
            modificadorHilo.join();
            iteradorHilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}