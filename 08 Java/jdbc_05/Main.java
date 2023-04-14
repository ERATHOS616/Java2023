
/*
    UPDATE con sentencias preparadas
*/
package jdbc_05;

import jdbc_05.utils.ConexionBBDD;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = ConexionBBDD.getConexion();

        String query = "UPDATE productos SET PRECIO = ? WHERE CODIGO_ARTICULO = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setDouble(1, 150.00); // nuevo precio
        ps.setString(2, "AR02"); // código del producto a actualizar

        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " filas afectadas.");

        ps.close();
        conn.close();
    }
}


//