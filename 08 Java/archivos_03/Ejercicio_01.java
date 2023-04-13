package archivos_03;

import java.io.*;
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el nombre del archivo a crear:");
        String fileName = scanner.nextLine();

        // Crear el archivo
        File file = new File("G:\\WORKSPACE\\15 JAVA\\CursoJava\\src\\archivos_03\\" + fileName + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Archivo creado exitosamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Escribir texto en el archivo
            FileWriter writer = new FileWriter(file);
            System.out.println("Introduzca el texto a escribir en el archivo:");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();

            // Leer el contenido del archivo
            Scanner fileScanner = new Scanner(file);
            StringBuilder fileContent = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                fileContent.append(fileScanner.nextLine());
            }
            fileScanner.close();

            // Buscar la palabra en el texto
            System.out.println("Introduzca la palabra a buscar:");
            String word = scanner.nextLine();
            boolean wordExists = fileContent.toString().contains(word);

            // Añadir la frase correspondiente al texto del archivo
            FileWriter appendWriter = new FileWriter(file, true);
            if (wordExists) {
                appendWriter.write("\nLa palabra existe en este texto.");
            } else {
                appendWriter.write("\nLa palabra no existe en este texto.");
            }
            appendWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
