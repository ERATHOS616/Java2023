
/*
Recorrer una colección (ArrayList) y usar lambdas para realizar una función
*/

package lambda_04;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos un ArrayList con algunos elementos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Naranja");
        lista.add("Pera");
        lista.add("Plátano");

        // Recorremos el ArrayList utilizando una función lambda
        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });
    }
}

/*
En la línea 3, importamos la clase ArrayList del paquete java.util.
En la línea 5, creamos una nueva clase llamada LambdaArrayListExample.
En la línea 6, definimos el método principal main.
En la línea 9, creamos un nuevo ArrayList llamado lista.
En las líneas 10 a 13, agregamos algunos elementos a la lista utilizando el método add.
En la línea 16, utilizamos la función forEach de la lista para recorrer cada elemento.
Dentro de los paréntesis de forEach, definimos una función lambda que toma un parámetro elemento y lo imprime en la consola utilizando System.out.println.
La sintaxis elemento -> { System.out.println(elemento); } es la definición de una función lambda que toma un parámetro elemento y ejecuta el código dentro de las llaves {}.
En la línea 17, cerramos el método principal main

En este ejemplo, aunque no se ha mencionado explícitamente, el método forEach utiliza una interfaz
funcional llamada Consumer. Esta interfaz tiene un método abstracto accept que toma un parámetro y
devuelve void. La expresión lambda (elemento) -> { System.out.println(elemento); } proporciona la
implementación del método accept de la interfaz Consumer, por lo que en este caso la función lambda
se está utilizando con una interfaz funcional.

Java incluye muchas interfaces funcionales predefinidas en el paquete java.util.function que se pueden
utilizar con funciones lambda para realizar operaciones en colecciones de datos, como Consumer,
Function, Predicate, entre otras. Estas interfaces funcionales se utilizan comúnmente en lugar de
definir una nueva interfaz funcional personalizada.
 */