package threads_01;

    // 1. Creamos la clase que herede de Thread
public class MiThread extends Thread{

    // 2. Opcional. Sobreescribir el constructor de Thread
        public MiThread(String name) {
            super(name);
        }

        // 3. Sobreescribimos el método run()
        //La ejecución del hilo empieza y termina en el método run().
        @Override
        public void run() {
            System.out.println("Hilo " + getName() +" iniciado con run() ");
            for (int i = 0;i<10;i++){
                System.out.println(i + " - " + this.getName());
            }

            System.out.println("Hilo " + this.getName() +" finalizado.");
        }

        // 4. Ahora nos vamos al MAIN a crear la instancia
    }
