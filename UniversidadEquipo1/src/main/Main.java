/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoadatos.AlumnoData;
import accesoadatos.Conexion;
import entidades.Alumno;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//     Connection con =  Conexion.getConexion();
//        Alumno carlos = new Alumno(37577100,"Nardone", "Carlos", LocalDate.of(1994, 11, 22), true);
        Alumno eduardo = new Alumno(45600100,"Fernandes", "Eduardo", LocalDate.of(1986, 12, 23), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(eduardo);
    }
    
}
