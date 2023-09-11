/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoadatos.AlumnoData;
import accesoadatos.Conexion;
import accesoadatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
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
     Connection con =  Conexion.getConexion();
//     Materia matematicas = new Materia("Matematica", 1 ,true);
//     Materia ingles = new Materia("Ingles", 2 ,true);
//     Materia informatica = new Materia("Informatica", 3, true);
//     MateriaData mat = new MateriaData();
//     mat.guardarMateria(matematicas);
//     mat.guardarMateria(ingles);
//     mat.guardarMateria(informatica);
//     Materia materiaEncontrada = mat.buscarMateria(7);
//     if (materiaEncontrada != null){
//         System.out.println("ID: " + materiaEncontrada.getIdMateria());
//         System.out.println("nombre: " + materiaEncontrada.getNombre());
//         System.out.println("año: " + materiaEncontrada.getAnioMateria());
//         
//    }
     
    
       Alumno carlos = new Alumno(37577100,"Dome", "Carlos", LocalDate.of(1994, 11, 22), true);
        Alumno eduardo = new Alumno(5, 567543553, "Rodrigues", "Juan Eduardo", LocalDate.of(1986, 12, 23), true);
        Alumno diego = new Alumno (24652571, "Bazzoni","Diego",LocalDate.of(1976, 1, 23), true);
        Alumno mauricio = new Alumno (30068183, "Avila", "Mauricio", LocalDate.of(1983,4,10), true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(mauricio);
        alu.modificarAlumno(eduardo);
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
