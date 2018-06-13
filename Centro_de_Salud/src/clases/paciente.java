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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author alex
 */
public class paciente 
{
    private Connection con;
    private final conexion conexion;
    public paciente()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    
    public boolean ingresarPaciente(String nombre, String apellido, String fecha,
            String telefono, String emergencia, String lugar_origen, String comunidad,
            String dpi, String tipo_sangre, int estatura, int peso, boolean sexo,
            String alergias, int edad)
    {
        try {
            String sql = "INSERT into paciente(nombres, apellidos, fecha_nacimiento,"
                + " telefono, emergencia, lugar_de_origen, comunidad, dpi,"
                + " tipo_sangre, estatura, peso, sexo, alergias, edad) VALUES"
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, fecha);
            ps.setString(4, telefono);
            ps.setString(5, emergencia);
            ps.setString(6, lugar_origen);
            ps.setString(7, comunidad);
            ps.setString(8, dpi);
            ps.setString(9, tipo_sangre);
            ps.setInt(10, estatura);
            ps.setInt(11, peso);
            ps.setBoolean(12, sexo);
            ps.setString(13, alergias);
            ps.setInt(14, edad);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public DefaultTableModel mostrarPacientes(String nombre, String apellido, TableModel table)
    {
        String titulos[] = new String[4];
        for(int i = 0; i < 4; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        try {
            String sql = "SELECT nombres, apellidos, edad, dpi from paciente where nombres LIKE '%" +
                    nombre + "%' OR apellidos LIKE '%" + apellido + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[4];
            while(rs.next())
            {
                registros[0] = rs.getString("nombres");
                registros[1] = rs.getString("apellidos");
                registros[2] = rs.getString("edad");
                registros[3] = rs.getString("dpi");
            }
            tabla.addRow(registros);
        } catch (SQLException ex) {
            Logger.getLogger(paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
}
