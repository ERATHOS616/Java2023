
/*
Crear una conexión a una BBDD y probarla con un SELECT.
 */
package jdbc_01;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        /*
         1. Crear un objeto de tipo Conection usando DriverManager.getConnection() que se encarga
         de administrar las conexiones. Hay que pasarle tres argumentos.
         Nos pedirá que tratemos la posible excepción.
         */

        String url = "jdbc:mysql://localhost:3306/cursojava";
        String username = "root";
        String password = "";

        try {

            //Objeto Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            //Creación de la query
            Statement stmt = conn.createStatement();

            //Creación del resultSet para guardar el resultado de la query
            ResultSet resultado = stmt.executeQuery("SELECT * FROM productos");

            //Creamos el cursor
            while (resultado.next()){
                System.out.println(resultado.getString("NOMBRE"));
            }

            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 Si tuviésemos una excepción, las sentencias close() no se ejecutarían. Para evitar esto nos las
 llevamos a un finally. Deberemos cambiar las variables locales por globales.
 */
























//