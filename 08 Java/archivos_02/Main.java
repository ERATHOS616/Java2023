package archivos_02;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto File que representa un directorio llamado "mydir"
        File dir = new File("G:\\WORKSPACE\\15 JAVA\\CursoJava\\src\\archivos_02\\");

        // Verificar si el directorio no existe y crearlo si es necesario
        if (!dir.exists()) {
            dir.mkdir();
        }

        // Crear dos instancias de File dentro del directorio "mydir"
        File file1 = new File(dir, "file3.txt");
        File file2 = new File(dir, "file4.txt");

        try {
            // Crear los archivos
            file1.createNewFile();
            file2.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Listar los archivos en el directorio "mydir"
        String[] files = dir.list();

        System.out.println("Archivos en el directorio:");
        for (String file : files) {
            System.out.println(file);
        }

        // Renombrar el archivo "file41.txt" a "renamed_file1.txt"
        boolean result = file1.renameTo(new File(dir, "renamed_file1.txt"));
        System.out.println("Archivo renombrado: " + result);

        // Eliminar el archivo "file2.txt"
        boolean deleted = file2.delete();
        System.out.println("Archivo eliminado: " + deleted);

        // Listar los archivos en el directorio "mydir" después de renombrar y eliminar
        files = dir.list();
        System.out.println("Archivos en el directorio después de renombrar y eliminar:");
        for (String file : files) {
            System.out.println(file);
        }
    }
}
