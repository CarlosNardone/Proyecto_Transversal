/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Materia;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class MateriaData {
    private int idMateria;
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarMateria(Materia materia){
        
    }
    
    public Materia buscarMateria(int id){
        
        return buscarMateria(id);
    }
    
    
    
    public void modificarMateria(Materia materia){
        
    }
    
    
    
    public void eliminarMateria(int id){
        
    }
    
    
    
    
    List<Materia>listarMaterias(){
        
     
        
        
        return listarMaterias();
    }
    
}
