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
import java.util.List;

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

        return obtenerMateriasCursadas(id);
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
