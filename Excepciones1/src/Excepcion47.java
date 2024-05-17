import java.util.EventListener;
import java.util.TooManyListenersException;

class Button {
    private EventListener listener;

    public void addButtonListener(EventListener newListener) throws TooManyListenersException {
        if (newListener != null) {
            if (this.listener != null) {
                throw new TooManyListenersException("Solo se permite un oyente por botón.");
            }
            this.listener = newListener;
        }
    }

    public void click() {
        if (listener != null) {
        }
    }
}

class MyButtonListener implements EventListener {
    
}

public class Excepcion47 {
    public static void main(String[] args) {
        Button button1 = new Button();
        Button button2 = new Button();

        MyButtonListener listener1 = new MyButtonListener();
        MyButtonListener listener2 = new MyButtonListener();

        try {
            button1.addButtonListener(listener1);
            button2.addButtonListener(listener2);

            button1.addButtonListener(new MyButtonListener());
        } catch (TooManyListenersException e) {
            System.err.println("Error: Se intentó agregar más de un oyente al botón1.");
        }

        button1.click();
        button2.click();
    }
}
