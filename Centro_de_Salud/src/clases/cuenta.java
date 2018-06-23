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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author alex
 */
public class cuenta 
{
    private Connection con;
    private final conexion conexion;
    
    public cuenta()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    
    public DefaultComboBoxModel mostrarCuentas()
    {
        DefaultComboBoxModel lista = new DefaultComboBoxModel();
        try {
            String sql = "SELECT nombre from cuenta";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                lista.addElement(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public int encontrar_cuenta(String nombre)
    {
        try {
            String sql = "SELECT id from cuenta WHERE nombre = '" + nombre + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public boolean aumentarValor(int id, double preciot)
    {
        double precio = 0;
        try {
            String sql = "select cantidad from cuenta where id = " + id;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                precio = rs.getDouble("cantidad");
            }
            precio += preciot;
            sql = "UPDATE cuenta set cantidad = ? where id = " + id;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean aumentarSueldos(double sueldo)
    {
        double sueldoi = 0;
        try {
            String sql = "SELECT cantidad from cuenta where nombre = 'Sueldos'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                sueldoi = rs.getDouble("cantidad");
            }
            sueldoi += sueldo;
            sql = "UPDATE cuenta set cantidad = ? where nombre = 'Sueldos'";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setDouble(1, sueldoi);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
