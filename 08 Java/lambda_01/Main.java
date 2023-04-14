package lambda_01;

public class Main {
    public static void main(String[] args) {

//Las expresiones lambda parten de un método que ya hemos definido en una interface funcional. ICalculadora

        //Lo primero es referenciar la interface funcnional:
        ICalculadora calculadora = ()->{System.out.println("Imprimido con Lambda");}; //Las {} sobran aquí.

        //Ya puedo hacer uso del método "mensaje()" de la instancia "calculadora":
        calculadora.mensaje();
    }
}
