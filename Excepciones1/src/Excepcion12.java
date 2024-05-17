public class Excepcion12 {
    private boolean estadoApropiado = false;

    public void realizarOperacion() {
        if (!estadoApropiado) {
            throw new IllegalStateException("No se puede realizar la operación: estado inapropiado.");
        }
        System.out.println("Operación realizada correctamente.");
    }

    public void establecerEstadoApropiado(boolean estado) {
        estadoApropiado = estado;
    }

    public static void main(String[] args) {
        VerificadorDeEstado verificador = new VerificadorDeEstado();

        try {
            verificador.realizarOperacion();
        } catch (IllegalStateException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        verificador.establecerEstadoApropiado(true);
        verificador.realizarOperacion();
    }
}
