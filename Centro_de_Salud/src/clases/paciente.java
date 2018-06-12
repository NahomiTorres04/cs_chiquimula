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
    
    public DefaultTableModel mostrarPacientes(String nombre, String apellido, TableModel table)
    {
        String titulos[] = new String[4];
        for(int i = 0; i < 4; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        try {
            String sql = "SELECT nombres, apellidos, edad, cui from paciente where nombres LIKE '%" +
                    nombre + "%' OR apellidos LIKE '%" + apellido + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[4];
            while(rs.next())
            {
                registros[0] = rs.getString("nombres");
                registros[1] = rs.getString("apellidos");
                registros[2] = rs.getString("edad");
                registros[3] = rs.getString("cui");
            }
            tabla.addRow(registros);
        } catch (SQLException ex) {
            Logger.getLogger(paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
}
