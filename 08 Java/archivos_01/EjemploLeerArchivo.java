package archivos_01;


public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "G:\\WORKSPACE\\15 JAVA\\CursoJava\\src\\archivos_01\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
