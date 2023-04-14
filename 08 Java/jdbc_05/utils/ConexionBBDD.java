package jdbc_05.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {

    //Creamos las variables. Privadas y estáticas.

    private static String url = "jdbc:mysql://localhost:3306/cursojava";
    private static String username = "root";
    private static String password = "";
    private static Connection conection;

    /*
    Método getConnexion. getInstance() es el método que devuelve la instancia de la clase.
    Singleton es un patrón de diseño que normalmente se usa cuando no desea crear varias instancias de una clase.
     */
    public static Connection getConexion() throws SQLException {
        if (conection == null) {
            conection = DriverManager.getConnection(url, username, password);
        }
        return conection;
    }
}
