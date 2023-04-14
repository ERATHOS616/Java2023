
/*
    Guardar el resultset de una SELECT en una colección
*/
package jdbc_06;

import jdbc_06.utils.ConexionBBDD;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/cursojava";
        String user = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, user, password);

        String query = "SELECT * FROM productos";
        PreparedStatement ps = con.prepareStatement(query);

        List<Producto> productos = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String codigo = rs.getString("CODIGO_ARTICULO");
            String seccion = rs.getString("SECCION");
            String nombre = rs.getString("NOMBRE");
            double precio = rs.getDouble("PRECIO");
            String pais = rs.getString("PAIS");
            Date fecha = rs.getDate("FECHA");
            Producto producto = new Producto(codigo, seccion, nombre, precio, pais, fecha);
            productos.add(producto);
        }

        for (Producto p : productos) {
            System.out.println(p.getCODIGO_ARTICULO() + " - " + p.getSECCION() + " - " + p.getNOMBRE() +
                    " - " + p.getPRECIO() + " - " + p.getPAIS() + " - " + p.getFECHA());
        }

        rs.close();
        ps.close();
        con.close();


    }
}


//