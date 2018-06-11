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

/**
 *
 * @author alex
 */
public class empleado 
{
    private Connection con;
    private final conexion conexion;
    public empleado()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    public String getProfesion(String nombre, String apellido)
    {
        String profesion = "";
        try {
            String sql = "SELECT cargo from empleado WHERE nombres = '" + nombre + "' AND apellidos = '" + apellido + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                profesion = rs.getString("cargo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesion;
    }
}
