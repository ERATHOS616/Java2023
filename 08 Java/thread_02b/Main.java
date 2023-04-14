package thread_02b;

public class Main {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new EjemploConcurrencia("Tarea 1"));
        Thread hilo2 = new Thread(new EjemploConcurrencia("Tarea 2"));
        Thread hilo3 = new Thread(new EjemploConcurrencia("Tarea 3"));

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
