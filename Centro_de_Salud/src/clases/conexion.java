/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author alex
 */
public class conexion {
    private String nombreBD="cs_santa_maria_chiquimula";
    private String usuario="root";
    private String password="alex123"; //cambiar por la contraseña de root (normalmente vacía)
    private String url="jdbc:mysql://localhost:3306/"+nombreBD+"?autoReconnect=true&useSSL=false";
    private Connection con = null;
    public  conexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection()
    {
        return con;
    }
}
