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
public class consulta 
{
    private Connection con;
    private final conexion conexion;
    
    public consulta()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    
    public boolean ingresarConsulta(String sintomas, String diagnostico,
            String tratamiento, String examenes, boolean reconsulta, boolean referido,
            String fecha_consulta, int paciente_id)
    {
        try {
            String sql = "INSERT into consulta(sintomas, diagnostico, tratamiento"
                    + ", examenes, reconsulta, referido, fecha, paciente_id)"
                    + " values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sintomas);
            ps.setString(2, diagnostico);
            ps.setString(3, tratamiento);
            ps.setString(4, examenes);
            ps.setBoolean(5, reconsulta);
            ps.setBoolean(6, referido);
            ps.setString(7, fecha_consulta);
            ps.setInt(8, paciente_id);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public double getServicios(int fecha) 
    {
        int cantidad_consultas = 0;
        try {
            String sql = "SELECT count(*) as servicios from consulta where fecha between '" +
                    fecha + "-01-01' and '" + fecha + "-12-31'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cantidad_consultas = rs.getInt("servicios");
            }
            cantidad_consultas *= 200;
        } catch (SQLException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad_consultas;
    }

    public double getCostoServicios(int fecha) 
    {
        int cantidad_consultas = 0;
        try {
            String sql = "SELECT count(*) as servicios from consulta where fecha between '" +
                    fecha + "-01-01' and '" + fecha + "-12-31'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cantidad_consultas = rs.getInt("servicios");
            }
            cantidad_consultas *= 65;
        } catch (SQLException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad_consultas;
    }
}
