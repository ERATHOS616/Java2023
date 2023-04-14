
/*
        Mismo ejemplo de jdbc_01 pero con autoClose.
        */
        package jdbc_02;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cursojava";
        String username = "root";
        String password = "";

        //AutoClose
        try (   Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")
        ){

            //Creamos el cursor
            while (resultado.next()){
                System.out.print(resultado.getString("CODIGO_ARTICULO") + " | "); //resultado.getString(1)
                System.out.print(resultado.getString("SECCION") + " | ");
                System.out.print(resultado.getString("NOMBRE") + " | ");
                System.out.print(resultado.getDouble("PRECIO") + " | ");
                System.out.print(resultado.getString("PAIS") + " | ");
                System.out.println(resultado.getDate("FECHA"));
            }

            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

















//