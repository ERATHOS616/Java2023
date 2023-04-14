
// 1. creamos una clase TareaProgramada que extiende la clase TimerTask y sobrescribe su método run()
package threads_06;

import java.util.TimerTask;

class TareaProgramada extends TimerTask {
    public void run() {
        System.out.println("La tarea ha sido ejecutada.");
    }
}
