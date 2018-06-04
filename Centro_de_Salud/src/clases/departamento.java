/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
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
public class departamento {
    private Connection con = null;
    private final conexion conexion;
    public departamento()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    public DefaultComboBoxModel mostrarDepartamentos()
    {
        DefaultComboBoxModel cmb = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * from departamento";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cmb.addElement(rs.getString("descripcion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmb;
    }
    public int seleccionarDepartamento(String descripcion)
    {
        int id = 0;
        try {
            String sql = "SELECT * from departamento where descripcion = '" + descripcion + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
               id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
