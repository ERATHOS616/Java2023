
/*
Crear un thread implementando la interface Runnable.
 */

package threads_02;

public class Main {
    public static void main(String[] args){

        //Creamos objetos de tipo Thread al que le pasamos por parámetro otro objeto de tipo ViajeTarea
        new Thread(new ViajeTarea("París")).start();
        new Thread(new ViajeTarea("Londres")).start();
        new Thread(new ViajeTarea("Madrid")).start();
        new Thread(new ViajeTarea("Lisboa")).start();


        }

    }

