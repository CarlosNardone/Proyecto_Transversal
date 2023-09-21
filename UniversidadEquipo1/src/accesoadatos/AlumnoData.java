/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class AlumnoData {

//    private int idAlumno;
    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {
//        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) " 
//                + "VALUES (?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement ("INSERT INTO alumno"
                    + "(dni, apellido, nombre, fechaNacimiento, estado) "
                    + "VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " ha sido guardada correctamente en la BD.");
            }else{
                JOptionPane.showMessageDialog(null, "Este alumno ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
            System.err.println(ex);
        }

    }
    
    public void modificarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET  dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? "
                + "WHERE IdAlumno = ?";
        PreparedStatement ps = null;



        
        try {
//            PreparedStatement ps = con.prepareStatement("UPDATE alumno SET dni = ?, apellido = ?, "
//                    + "nombre = ? ,fechaNacimiento = ? "
//                    + "WHERE IdAlumno = ?", Statement.RETURN_GENERATED_KEYS);
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alumno Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Alumno inexistente");
            }
            
//            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
            System.err.println(ex);
        }
        
        
        
    }
    
    
    
    public void eliminarAlumnoPorDNI(int dni){
        String sql = "UPDATE alumno SET estado = 0  WHERE dni  = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
          int exito =  ps.executeUpdate();
         
           if(exito == 1){
               
               JOptionPane.showMessageDialog(null, "Alumno Dado de Baja");
           } else{
               JOptionPane.showMessageDialog(null, "Este alumno ya esta dado de baja");
           }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        
    }   

    /*
    
        public void eliminarAlumno(int id){
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
          int exito =  ps.executeUpdate();
           if(exito == 1){
               JOptionPane.showMessageDialog(null, "Alumno Dado de Baja");
           } 
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        
    }   
    */

    public Alumno buscarAlumnoporDni(int id){
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento "
                + "FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese alumno");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumno;
    }
    
        public  Alumno buscarAlumnoPorDni(int dni){
        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        Alumno alumno = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese alumno");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumno;
    }
    
                public List <Alumno> listarAlumnos(){
        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
       ArrayList <Alumno> alumnos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
                alumnos.add(alumno);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumnos;
    }
        
        
}
