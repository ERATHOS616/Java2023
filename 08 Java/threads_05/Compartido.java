package threads_05;

class Compartido {
    private String mensaje;
    private boolean mensajeDisponible = false;

    public synchronized void escribirMensaje(String mensaje) {
        while (mensajeDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.mensaje = mensaje;
        mensajeDisponible = true;

        notify();
    }

    public synchronized void leerMensaje() {
        while (!mensajeDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Mensaje leído: " + mensaje);
        mensajeDisponible = false;

        notify();
    }
}
