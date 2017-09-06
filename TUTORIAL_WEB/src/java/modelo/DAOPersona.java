/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uml.Persona;

/**
 *
 * @author luis
 */
public class DAOPersona implements Opraciones {

    Database bd = new Database();

    @Override
    public String insertar(Object p) {

        Persona per = (Persona) p;
        Connection conn;
        PreparedStatement pst;
        String sql = "INSERT INTO persona VALUES (?,?,?,?)";
        String respuesta = "";
        try {
            System.out.println("entrobnm la");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/colegio",
                    "root",
                    ""
            );

            pst = conn.prepareStatement(sql);
            pst.setInt(1, per.getId());
            pst.setString(2, per.getNombre());
            pst.setString(3, per.getApellidos());
            pst.setInt(4, per.getEdad());
            int filas = pst.executeUpdate();
            respuesta = "se registaron " + filas + " nuevo elemento";
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("modelo.DAOPersona.insertar()" + e);
        }
        return respuesta;
    }

    @Override
    public String elimnar(Object p) {
        Persona per = (Persona) p;
        Connection conn;
        PreparedStatement pst;
        String sql = "delete from persona where id=?";
        String respuesta = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/colegio",
                    "root",
                    ""
            );
            pst = conn.prepareStatement(sql);
           
            pst.setInt(1, per.getId());
            int filas = pst.executeUpdate();
            conn.close();
            respuesta = "se eliminaron " + filas + " nuevo elemento";

        } catch (ClassNotFoundException | SQLException e) {

        }
        return respuesta;
    }

    @Override
    public String modificar(Object p) {
        Persona per = (Persona) p;
        Connection conn;
        PreparedStatement pst;
        String sql = "update persona set nombre=?,apellidos=?,edad=? where id=?";
        String respuesta = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/colegio",
                    "root",
                    ""
            );

            pst = conn.prepareStatement(sql);
            pst.setString(1, per.getNombre());
            pst.setString(2, per.getApellidos());
            pst.setInt(3, per.getEdad());
            pst.setInt(4, per.getId());
            int filas = pst.executeUpdate();
            conn.close();
            respuesta = "se modificaron " + filas + " nuevo elemento";

        } catch (ClassNotFoundException | SQLException e) {

        }
        return respuesta;
    }

    @Override
    public List<Persona> consulta() {
        List<Persona> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from persona";

        try {
            System.out.println("entro la");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/colegio",
                    "root",
                    ""
            );

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                datos.add(new Persona(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getInt("edad")
                ));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR KL" + e);
        }
        return datos;
    }

    @Override
    public List<Persona> filtrar(String campo, String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
