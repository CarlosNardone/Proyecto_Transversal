/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Materia;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO materia(nombre,año, estado) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Materia guardada con exito");
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }
    
    public Materia buscarMateria(int id){
        String sql = "SELECT nombre, año, estado FROM materia "
                + "WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe esta materia");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        } 
        return materia;
    }
    
    
    
    public void modificarMateria(Materia materia){
        
    }
    
    
    
    public void eliminarMateria(int id){
        
    }
    
    
    
    
    List<Materia>listarMaterias(){
        
     
        
        
        return listarMaterias();
    }
    
}
