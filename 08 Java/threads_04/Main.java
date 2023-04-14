
/*
Ejemplo de sincronización de hilos.
 */

package threads_04;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 4. Creamos las instancias de Thread
        new Thread(new ImprimirFrases("Hola ", "mundo.")).start();
        new Thread(new ImprimirFrases("Esta frase ", "tiene sentido.")).start();
        new Thread(new ImprimirFrases("Esta otra frase ", "también tiene sentido.")).start();

        //Ejecutamos para probar
        // 5. meter en el siguiente método "synchronized". public synchronized static void imprimirFrases(String frase1, String frase2){
        //Ejecutamos para probar
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) {

        // 1. Creamos dos frases que se leerán una tras otra para que al final su lectura tenga sentido.
        System.out.println(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }

}

