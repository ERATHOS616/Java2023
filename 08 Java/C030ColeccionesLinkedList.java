import java.util.LinkedList;

public class C030ColeccionesLinkedList {
    public static void main(String[] args) {

// Ejemplo del método add()
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Hola");
        lista1.add("mundo");
        System.out.println(lista1.toString()); // Imprime ["Hola", "mundo"]

        // Ejemplo del método get()
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Hola");
        lista2.add("mundo");
        String elemento = lista2.get(1); // Obtiene el elemento en el índice 1
        System.out.println(elemento); // Imprime "mundo"

        // Ejemplo del método set()
        LinkedList<String> lista3 = new LinkedList<>();
        lista3.add("Hola");
        lista3.add("mundo");
        lista3.set(1, "amigos"); // Reemplaza el elemento en el índice 1 con "amigos"
        System.out.println(lista3.toString()); // Imprime ["Hola", "amigos"]

        // Ejemplo del método remove()
        LinkedList<String> lista4 = new LinkedList<>();
        lista4.add("Hola");
        lista4.add("mundo");
        lista4.remove(0); // Elimina el elemento en el índice 0
        System.out.println(lista4.toString()); // Imprime ["mundo"]

        // Ejemplo del método size()
        LinkedList<String> lista5 = new LinkedList<>();
        lista5.add("Hola");
        lista5.add("mundo");
        int tamano = lista5.size(); // Devuelve la cantidad de elementos en la lista
        System.out.println("La lista tiene " + tamano + " elementos.");

        // Ejemplo del método clear()
        LinkedList<String> lista6 = new LinkedList<>();
        lista6.add("Hola");
        lista6.add("mundo");
        lista6.clear(); // Elimina todos los elementos de la lista
        System.out.println(lista6.toString()); // Imprime []

        // Ejemplo del método indexOf()
        LinkedList<String> lista7 = new LinkedList<>();
        lista7.add("Hola");
        lista7.add("mundo");
        int indice = lista7.indexOf("mundo"); // Devuelve el índice del primer elemento "mundo" en la lista
        System.out.println("El elemento \"mundo\" está en el índice " + indice);
    }
}

