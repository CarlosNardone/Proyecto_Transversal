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
        Alumno carlos = new Alumno(37577100,"Nardone", "Carlos Andres", LocalDate.of(1994, 11, 22), true);
//        Alumno eduardo = new Alumno(5, 45600100, "Fernandes", "Juan Eduardo", LocalDate.of(1986, 12, 23), true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(eduardo);
        alu.modificarAlumno(carlos);
//        alu.eliminarAlumno(5);
//       Alumno alumnoEncontrado = alu.buscarAlumno(5);
//       Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(37577100);
//       if(alumnoEncontrado!=null){
//       
//        System.out.println("DNI: "+alumnoEncontrado.getDni());
//        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//        System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//        System.out.println("Fecha Nacimiento: "+alumnoEncontrado.getFechaNacimiento());
//        AlumnoData alu = new AlumnoData();
//        for(Alumno alumno:alu.listarAlumnos()){
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNacimiento());
//
//       }
       
       
       
    }

}
