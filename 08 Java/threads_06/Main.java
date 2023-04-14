
/*
Timer y TImerTask
 */

package threads_06;


import java.util.*;


public class Main {
    public static void main(String[] args)  {
        // 2. creamos una instancia de Timer y una instancia de TareaProgramada
        Timer timer = new Timer();
        TimerTask tarea = new TareaProgramada();

        // 3. llamamos al método schedule() de Timer con la instancia de TareaProgramada y
        // un retraso de 5000 milisegundos (5 segundos).

        timer.schedule(tarea, 5000); // programar la tarea para que se ejecute después de 5 segundos

        System.out.println("La tarea ha sido programada.");

    }

}

/*

 */