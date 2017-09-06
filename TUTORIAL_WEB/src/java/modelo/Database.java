/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luis
 */
public class Database {

    private String driver;
    private String url;
    private String Usuario;
    private String contraseña;

    public Database() {
    }

    public Database(String driver, String url, String Usuario, String contraseña) {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/colegio";
        this.Usuario = "root";
        this.contraseña = "";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

}
