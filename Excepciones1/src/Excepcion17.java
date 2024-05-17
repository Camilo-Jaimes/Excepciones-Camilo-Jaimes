public class Excepcion17 {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: Hilo interrumpido.");
            }
        });

        hilo.start();
        hilo.interrupt();
    }
}
