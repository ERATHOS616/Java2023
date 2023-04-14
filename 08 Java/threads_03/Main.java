
/*
join() y sleep().
 */

package threads_03;

import threads_03.ViajeTarea;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();

        Thread t1 = new Thread(new threads_03.ViajeTarea("París"));
        Thread t2 = new Thread(new threads_03.ViajeTarea("Londres"));
        Thread t3 = new Thread(new threads_03.ViajeTarea("Madrid"));
        Thread t4 = new Thread(new ViajeTarea("Lisboa"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();



        System.out.println("Continuamos con la ejecución del Main");

        }

    }

