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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    boolean fungible, int departamento_id, int cuenta)
    {
        try {
            String sql = "INSERT into bien(codigo, descripcion, cantidad"
                    + ", precio_unitario, precio_total, estado, donado"
                    + ", fungible, departamento_id, cuenta_id) values(?,?,?,?,?,"
                    + "?,?,?,?,?)";
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
            ps.setInt(10, cuenta);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public DefaultTableModel bienes(String codigo, JTable table)
    {
        String titulos[] = new String[6];
        for(int i = 0; i < 6; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        try {
            String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where codigo LIKE '%" + codigo + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String [6];
            while(rs.next())
            {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
            }
            sql = "SELECT sum(precio_total) as total from bien where codigo LIKE '%" + codigo + "%'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    public DefaultTableModel todosBienes(JTable table)
    {
        departamento dep = new departamento();
        String titulos[] = new String[6];
        for(int i = 0; i < 6; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        try {
            String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible, departamento_id from bien order by departamento_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[6];
            String departamento_actual = "0";
            while(rs.next())
            {
                if(departamento_actual.equals(rs.getString("departamento_id")) == false)
                {
                    tabla.addRow(new Object[] {"", "", "", dep.seleccionarNombre(rs.getInt("departamento_id")), "", "", ""});
                    departamento_actual = rs.getString("departamento_id");
                }
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
            }
            sql = "SELECT sum(precio_total) as total from bien";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    public DefaultTableModel bienesPorEstado(JTable table, boolean estado)
    {
        String titulos[] = new String[6];
        for(int i = 0; i < 6; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        if(estado == true)
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where estado = true";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where estado = true";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where estado = false";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                    registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where estado = false";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    public DefaultTableModel bienesDonacion(JTable table, boolean donado)
    {
        String titulos[] = new String[6];
        for(int i = 0; i < 6; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        if(donado == true)
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where donado = true";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                    registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where donado = true";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where donado = false";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                    registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where donado = false";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    public DefaultTableModel bienesFungible(JTable table, boolean fungible)
    {
        String titulos[] = new String[6];
        for(int i = 0; i < 6; i++)
        {
            titulos[i] = table.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        if(fungible == true)
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where fungible = true";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                    registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where fungible = true";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                String sql = "SELECT codigo, descripcion, cantidad, precio_unitario, estado, fungible from bien where fungible = false";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String registros[] = new String[6];
                while(rs.next())
                {
                    registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("precio_unitario");
                if(rs.getBoolean("estado") == true)
                {
                    registros[4] = "Bueno";
                } else registros[4] = "Malo";
                if(rs.getBoolean("fungible") == true)
                {
                    registros[5] = "Sí";
                } else registros[5] = "No";
                tabla.addRow(registros);
                }
                sql = "SELECT sum(precio_total) as total from bien where fungible = false";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tabla.addRow(new Object[] {"Total", "", "", "", "", rs.getString("total")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
}
