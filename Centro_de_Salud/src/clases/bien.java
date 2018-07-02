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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
    boolean fungible, String fecha, int departamento_id, int cuenta)
    {
        try {
            String sql = "INSERT into bien(codigo, descripcion, cantidad"
                    + ", precio_unitario, precio_total, estado, donado"
                    + ", fungible, fecha, departamento_id, cuenta_id) values(?,?,?,?,?,"
                    + "?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio_unitario);
            ps.setDouble(5, precio_total);
            ps.setBoolean(6, estado);
            ps.setBoolean(7, donado);
            ps.setBoolean(8, fungible);
            ps.setString(9, fecha);
            ps.setInt(10, departamento_id);
            ps.setInt(11, cuenta);
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
//        for(int i = 1; i < 6; i++)
//        {
//            titulos[i] = table.getColumnName(i);
//        }
        titulos[0] = "Código";
        titulos[1] = "Descripción";
        titulos[2] = "Cantidad";
        titulos[3] = "Precio Unitario";
        titulos[4] = "Fungible";
        titulos[5] = "Total";
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
//        for(int i = 0; i < 6; i++)
//        {
//            titulos[i] = table.getColumnName(i);
//        }
        titulos[0] = "Código";
        titulos[1] = "Descripción";
        titulos[2] = "Cantidad";
        titulos[3] = "Precio Unitario";
        titulos[4] = "Fungible";
        titulos[5] = "Total";
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
                    tabla.addRow(new Object[] {"", "","", dep.seleccionarNombre(rs.getInt("departamento_id")), "", "", ""});
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
                tabla.addRow(new Object[] {"Total", "", "", "", "","", rs.getString("total")});
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
    
    public double calcularDep(int anio)
    {
        double depreciacion = 0;
        try {
            String sql = "SELECT id from cuenta where nombre = 'Equipo de cómputo'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            while(rs.next())
            {
                id = rs.getInt("id");
            }
            sql = "SELECT precio_total, year(fecha) from bien where cuenta_id = " + id;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            String anio_bien;
            while(rs.next())
            {
                anio_bien = rs.getString("year(fecha)");
                int diferencia = anio - Integer.parseInt(anio_bien);
                double precio_total =0;
                if(diferencia > 0);
                {
                    precio_total = rs.getDouble("precio_total");
                    for(int i = 0; i < diferencia; i++)
                    {
                        precio_total = precio_total - (precio_total*0.3333);
                    }
                }
                depreciacion += precio_total;
            }
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depreciacion;
    }
    
    public DefaultTableModel mostrarResumen(int anio, TableModel modelo)
    {
        String titulos[ ] = new String[5];
        for(int i = 0; i  < 5; i++)
        {
            titulos[i] = modelo.getColumnName(i);
        }
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
        try {
            String sql = "SELECT year(fecha) as anios, cantidad, descripcion, precio_unitario, cuenta_id, codigo from bien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String fecha = rs.getString("anios");
                if(fecha.equals(String.valueOf(anio)))
                {
                    cuenta cu = new cuenta();
                    int cuenta = rs.getInt("cuenta_id");
                    if(cu.verificarActivo(cuenta))
                    {
                        tabla.addRow(new Object[] {rs.getInt("cantidad"), rs.getString("descripcion"),
                        rs.getDouble("precio_unitario"), "", rs.getString("codigo")});
                    }
                    else
                    {
                        tabla.addRow(new Object[] {rs.getInt("cantidad"), rs.getString("descripcion"),
                        "", rs.getDouble("precio_unitario"), rs.getString("codigo")});
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    public String[] recopilarParaEdicion(String codigo)
    {
        String[] valores = new String[10];
        try {
            String sql = "select B.codigo, B.descripcion, B.donado, B.fungible, "
                    + "B.cantidad, B.estado, B.precio_unitario, B.fecha, D.descripcion as descripcion_dep, C.nombre as nombre_cuenta "
                    + "from bien B inner join departamento D on B.departamento_id = D.id "
                    + "inner join cuenta C on B.cuenta_id = C.id where B.codigo = '" + codigo + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                valores[0] = rs.getString("B.codigo");
                valores[1] = rs.getString("B.descripcion");
                valores[2] = rs.getString("descripcion_dep");
                if(rs.getBoolean("B.donado") == true) valores[3] = "1";
                else valores[3] = "0";
                if(rs.getBoolean("B.fungible") == true) valores[4] = "1";
                else valores[4] = "0";
                valores[5] = String.valueOf(rs.getInt("B.cantidad"));
                valores[6] = String.valueOf(rs.getInt("B.precio_unitario"));
                if(rs.getBoolean("B.estado") == true) valores[7] = "1";
                else valores[7] = "0";
                valores[8] = rs.getString("nombre_cuenta");
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                valores[9] = formato.format(rs.getDate("B.fecha"));
            }
            return valores;
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valores;
    }

    public boolean actualizarBien(String codigo, String descripcion, int cantidad,
    double precio_unitario, double precio_total, boolean estado, boolean donado,
    boolean fungible, String fecha, int departamento_id, int cuenta) {
        /**
         * Este proceso actualiza los datos de algún bien
         */
        try {
            String sql = "UPDATE bien set descripcion = ?, cantidad = ?, precio_unitario = ?"
                    + ", precio_total = ?, estado = ?, donado = ?, fungible = ?"
                    + ", fecha = ?, departamento_id = ?, cuenta_id = ? where codigo = '" + codigo + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, descripcion);
            ps.setInt(2, cantidad);
            ps.setDouble(3, precio_unitario);
            ps.setDouble(4, precio_total);
            ps.setBoolean(5, estado);
            ps.setBoolean(6, donado);
            ps.setBoolean(7, fungible);
            ps.setString(8, fecha);
            ps.setInt(9, departamento_id);
            ps.setInt(10, cuenta);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(bien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
