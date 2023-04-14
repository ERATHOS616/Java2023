
// 2. Creamos la clase que implemente la interface Runnable.
package threads_04;

public class ImprimirFrases implements Runnable{
    //declaración de variables
    private String frase1, frase2;

    //Constructor

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    //Getters y Setters

    public String getFrase1() {
        return frase1;
    }

    public void setFrase1(String frase1) {
        this.frase1 = frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

    // 3. sobreescritura del método run()
    @Override
    public void run() {
        Main.imprimirFrases(this.frase1, this.frase2);
    }
}
