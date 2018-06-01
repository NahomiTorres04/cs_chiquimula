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
}
