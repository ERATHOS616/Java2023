
/*
SELECT con sentencias preparadas
*/
package jdbc_04;

import jdbc_04.utils.ConexionBBDD;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        //AutoClose
        Connection conn = ConexionBBDD.getConexion();
        String query = "SELECT CODIGO_ARTICULO, PRECIO FROM productos WHERE SECCION = ? AND PAIS = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "INFORMATICA"); // valor para SECCION
        ps.setString(2, "CHINA"); // valor para PAIS

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String codigo = rs.getString("CODIGO_ARTICULO");
            double precio = rs.getDouble("PRECIO");
            System.out.println("Código: " + codigo + ", Precio: " + precio);
        }
        rs.close();
        ps.close();
        conn.close();
    }
}


//