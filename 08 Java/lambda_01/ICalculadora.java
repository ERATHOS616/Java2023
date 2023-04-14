package lambda_01;

@FunctionalInterface
public interface ICalculadora {

    void mensaje(); //Único método

    /* Si pongo más métodos me dará fallo:
    void mensaje2();
    */

    /*
    Una vez declarado el método, lo implementaremos en una clase que crearemos. MAIN
     */
}
