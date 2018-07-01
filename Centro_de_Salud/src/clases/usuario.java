/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author alex
 */
public class usuario {
    private Connection con = null;
    private final conexion conexion;
    public usuario()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    public DefaultComboBoxModel mostrarU()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * from usuario";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                modelo.addElement(rs.getString("nombre_usuario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    public boolean ingresar(String nombre, String apellido, String usuario, String contrasenia)
    {
        try {
            String sql = "SELECT nombre_usuario from usuario";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            boolean existe = false;
            while(rs.next())
            {
                if(rs.getString("nombre_usuario").equals(usuario)) existe = true;
            }
            if(existe == false)
            {
                sql = "INSERT into usuario(nombre, apellido, nombre_usuario, password)"
                        + "values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setString(2, apellido);
                pst.setString(3, usuario);
                pst.setString(4, contrasenia);
                int n = pst.executeUpdate();
                return n != 0;
            }
            else return false;
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean verificarContrasenia(String pass, String us)
    {
        String p = "";
        try {
            String sql = "SELECT * from usuario where nombre_usuario = '" + us + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                p = rs.getString("password");
            }
            return pass.equals(p);
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean existeUsuario(String usuario)
    {
       try {
           String sql = "SELECT nombre_usuario from usuario";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next())
           {
               String user = rs.getString("nombre_usuario");
               if(user.equals(usuario)) return true;
           }
           return false;
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
}
