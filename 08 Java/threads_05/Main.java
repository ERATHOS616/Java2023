
/*
Ejemplo de sincronización de hilos con wait() y notify().
Escribir un programa en Java que implemente la clase Compartido, que tiene un mensaje y un
booleano mensajeDisponible que indica si el mensaje está disponible para leer.
La clase debe tener dos métodos sincronizados: escribirMensaje y leerMensaje.

El método escribirMensaje debe aceptar un mensaje como parámetro y esperar hasta que el mensaje
esté disponible para escribirlo.
El método leerMensaje debe esperar hasta que el mensaje esté disponible para leerlo y luego imprimir el mensaje.

El programa debe crear dos hilos: uno para escribir un mensaje y otro para leerlo.
El hilo que escribe un mensaje debe esperar a que el hilo que lee el mensaje termine antes de continuar.
El hilo que lee el mensaje debe esperar a que el hilo que escribe el mensaje termine antes de continuar.
 */

package threads_05;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Compartido compartido = new Compartido();

        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                compartido.escribirMensaje("Hola");
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                compartido.leerMensaje();
            }
        });

        hilo1.start();
        hilo2.start();
    }

}

/*
En este ejemplo, tenemos una clase Compartido que tiene un mensaje y un booleano mensajeDisponible
que indica si el mensaje está disponible para leer.
Los métodos escribirMensaje() y leerMensaje() son sincronizados para que se puedan llamar de manera
segura desde diferentes hilos.

En el método escribirMensaje(), primero comprobamos si mensajeDisponible es verdadero.
Si es así, llamamos a wait(), lo que hace que el hilo espere hasta que sea notificado.
Cuando el mensaje se escribe, se establece mensajeDisponible en verdadero y se llama a notify(),
lo que notifica a cualquier hilo en espera que puede continuar.

En el método leerMensaje(), primero comprobamos si mensajeDisponible es falso.
Si es así, llamamos a wait(), lo que hace que el hilo espere hasta que sea notificado.
Cuando el mensaje se lee, se establece mensajeDisponible en falso y se llama a notify(),
lo que notifica a cualquier hilo en espera que puede continuar.

En el método main(), creamos dos hilos: uno para escribir un mensaje y otro para leerlo.
Cuando se ejecuta el programa, el hilo que escribe un mensaje espera a que el hilo que lee
el mensaje termine antes de continuar. Luego, el hilo que lee el mensaje espera a que el
hilo que escribe el mensaje termine antes de continuar.
 */