
/*
Crear un thread heredando de la clase thread
 */

package threads_01;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 4. creamos la instancia. Es un hilo nuevo que no se ha ejecutado.
        Thread hilo1 = new MiThread("Angel");
        System.out.println(hilo1.getState()); //NEW

        // Se levanta con start(). start() invoca a run().
        hilo1.start();
        //Thread.sleep(3000);
        System.out.println(hilo1.getState());

        Thread hilo2 = new MiThread("María");
        hilo2.start();

        //cada hilo corre en su propio procesador de forma paralela.

        }

    }

