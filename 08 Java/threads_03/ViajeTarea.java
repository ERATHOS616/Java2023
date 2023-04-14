package threads_03;

public class ViajeTarea implements Runnable{

    //Atributos
    private String nombre;

    //Constructor
    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Necesario sobreescribir el método run()
    @Override
    public void run() {
        for (int i = 0; i<10;i++){
            System.out.println(i + " - " + nombre );
        }


        System.out.println("Destino: " + nombre);

    }
}
