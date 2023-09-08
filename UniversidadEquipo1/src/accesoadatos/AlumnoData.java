/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Alumno;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class AlumnoData {
    private int idAlumno;
    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
        
    }
    
    public void guardarAlumno(Alumno alumno){
//        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) " 
//                + "VALUES (?,?,?,?,?)";
        
        try {
            
PreparedStatement ps = con.prepareStatement("INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " ha sido guardada correctamente en la BD.");
            }
            rs.close();
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        
        
        
    }
    
    
    
    
}
