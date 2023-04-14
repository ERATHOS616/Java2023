
/*
En este ejemplo, definimos una interfaz funcional personalizada llamada Calculadora que tiene un método operacion() que toma dos argumentos double y devuelve un resultado double.

Luego, definimos una expresión lambda que implementa la interfaz Calculadora para realizar una suma de dos valores double.

Finalmente, utilizamos la expresión lambda para realizar una suma de dos valores y asignamos el resultado a la variable resultado. Luego, imprimimos el resultado en la consola utilizando el método println().
 */

package lambda_02;



public class Main {
    public static void main(String[] args) {

        // Definir una expresión lambda que implementa la interfaz Calculadora
        Calculadora suma = (a, b) -> a + b;

        // Utilizar la expresión lambda para realizar una suma
        double resultado = suma.operacion(3.5, 2.5);

        // Imprimir el resultado
        System.out.println(resultado);
    }
}
