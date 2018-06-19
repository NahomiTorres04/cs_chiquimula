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
    
    public boolean ingresarEmpleado(String nombre, String apellido,String dpi,
             String municipio, String departamento, String tipo,
             String clasificacion, String lugar, String cargo, String renglon,
             String puesto, String fechai, String fechaf,
             double sueldo, String telefono, String alergias)
    {
        try {
            String sql = "INSERT into empleado (nombres, apellidos, dpi,"
                    + " municipio, departamento, tipo, clasificacion,"
                    + " lugar, cargo, renglon_presupuestario,"
                    + " puesto, fecha_inicio, fecha_fin,"
                    + " sueldo, telefono, alergias) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dpi);
            ps.setString(4, municipio);
            ps.setString(5, departamento);
            ps.setString(6, tipo);
            ps.setString(7, clasificacion);
            ps.setString(8, lugar);
            ps.setString(9, cargo);
            ps.setString(10, renglon);
            ps.setString(11, puesto);
            ps.setString(12, fechai);
            ps.setString(13, fechaf);
            ps.setDouble(14, sueldo);
            ps.setString(15, telefono);
            ps.setString(16, alergias);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public String getCargo(String nombre, String apellido)
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
