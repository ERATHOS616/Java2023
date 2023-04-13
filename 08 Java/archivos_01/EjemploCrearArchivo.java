package archivos_01;


public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "G:\\WORKSPACE\\15 JAVA\\CursoJava\\src\\archivos_01\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);
    }
}
