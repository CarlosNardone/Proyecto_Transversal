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

    public void guardarInscripcion(Inscripcion insc) {
        

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

        return obtenerMateriasCursadas(id);
    }

    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List <Alumno> obtenerAlumnosXMateria(int idMateria){
       
        return obtenerAlumnosXMateria(idMateria);
    }
    
    
}
