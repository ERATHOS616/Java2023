
/*
Supongamos que tenemos una lista de objetos Persona con los atributos nombre, edad y sexo.
Queremos filtrar esta lista para obtener solo aquellas personas que sean de sexo masculino
y mayores de 18 años. Podemos hacerlo utilizando expresiones lambda junto con la función
filter() de la clase Stream de Java 8.
 */

package lambda_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 26, 'M'));
        personas.add(new Persona("Ana", 18, 'F'));
        personas.add(new Persona("Pedro", 21, 'M'));
        personas.add(new Persona("María", 17, 'F'));
        personas.add(new Persona("Carlos", 30, 'M'));

        // filtrar personas de sexo masculino mayores de 18 años
        List<Persona> personasFiltradas = personas.stream().filter(p -> p.getSexo() == 'M' && p.getEdad() > 18).toList();

        // imprimir lista de personas filtradas
        System.out.println("Personas filtradas:");
        personasFiltradas.forEach(System.out::println);
    }
}
