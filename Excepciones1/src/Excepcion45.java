public class Excepcion45 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        try {
            System.out.println("Mensaje desde MyClass: " + myObject.message);
        } catch (NoSuchFieldError e) {
            System.err.println("Error: El campo 'message' no existe en MyClass.");
        }
    }
}

class MyClass {

    public String message;
}

