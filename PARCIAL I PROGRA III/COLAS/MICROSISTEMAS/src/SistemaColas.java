
import java.util.LinkedList;
import java.util.Queue;

public class SistemaColas {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Solicitud de Reparación de laptop");
        cola.add("Solicitud SSD");
        cola.add("Solicitud Reparar celular");
        System.out.println("Solicitudes: " + cola);

        String primeraSoli = cola.poll();
        System.out.println("Primera Solicitud: " + primeraSoli);

        String primeraSolipendi = cola.peek();
        System.out.println("Primera Solicitud Pendiente: " + primeraSolipendi);

        System.out.println("Solicitudes de la cola después de obtener la primera solicitud: " + cola);

        int tamañoCola = cola.size();
        System.out.println("Solicitudes sin procesar: " + tamañoCola);
    }
}