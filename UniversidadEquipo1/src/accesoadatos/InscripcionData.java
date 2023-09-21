/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc)
      {
          String sql = "INSERT INTO inscripcion(nota,idAlumno,idMateria) VALUES(?,?,?)"; 
        try {            
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1,insc.getNota());
            ps.setInt(2,insc.getAlumno().getIdAlumno());
            ps.setInt(3,insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys() ;
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Inscripcion guardada con exito");     
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion ");
            
        }
        

    }

    public List<Inscripcion> obtenerInscripciones() {
        

        return obtenerInscripciones();
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {

        return obtenerInscripciones();
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList <Materia>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria \n"
                + "AND inscripcion.idAlumno = ?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones." + ex.getMessage());
        }
        
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
         
        List<Materia> materias = new ArrayList <Materia>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in (SELECT idMateria FROM inscripcion WHERE idAlumno =?)";
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones." + ex.getMessage());
        }
        
        
        
        return obtenerMateriasCursadas(id);
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
           int filas = ps.executeUpdate();
           if(filas > 0){
               JOptionPane.showMessageDialog(null, "Incripcion eliminada con exito");
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla incripcion");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
           int filas = ps.executeUpdate();
           if(filas > 0){
               JOptionPane.showMessageDialog(null, "Nota Actualizada");
           }
           ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla incripcion");
        }
        
        
    }
    
    public List <Alumno> obtenerAlumnosXMateria(int idMateria){
       
        return obtenerAlumnosXMateria(idMateria);
    }
    
    
    
    
}
