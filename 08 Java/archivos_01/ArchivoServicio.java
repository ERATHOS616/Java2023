package archivos_01;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);

       try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){

            buffer.append("Frase de bienvanida!\n")
                    .append("Segunda frase añadida...\n")
                    .append("última frase!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();

        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
