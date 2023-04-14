package thread_02b;

public class EjemploConcurrencia implements Runnable {

    private String tarea;

    public EjemploConcurrencia(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {
        System.out.println("Comenzando la tarea: " + tarea);

        // Simulamos una tarea que tarda en completarse

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Completada la tarea: " + tarea);
    }
}

