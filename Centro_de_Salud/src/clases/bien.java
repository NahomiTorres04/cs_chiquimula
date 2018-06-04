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
public class bien {
    private Connection con = null;
    private final conexion conexion;
    public bien()
    {
        conexion = new conexion();
        con = conexion.getConnection();
    }
    public boolean ingresarBien(String codigo, String descripcion, int cantidad,
    double precio_unitario, double precio_total, boolean estado, boolean donado,
    boolean fungible, int departamento_id)
    {
        try {
            String sql = "INSERT into bien(codigo, descripcion, cantidad"
                    + ", precio_unitario, precio_total, estado, donado"
                    + ", fungible, departamento_id) values(?,?,?,?,?,"
                    + "?,?,?,?,)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio_unitario);
            ps.setDouble(5, precio_total);
            ps.setBoolean(6, estado);
            ps.setBoolean(7, donado);
            ps.setBoolean(8, fungible);
            ps.setInt(9, departamento_id);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
