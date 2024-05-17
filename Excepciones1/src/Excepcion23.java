public class Excepcion23 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        try {
            lock.wait(); 
        } catch (IllegalMonitorStateException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
