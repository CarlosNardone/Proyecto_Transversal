/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoadatos.AlumnoData;
import accesoadatos.Conexion;
import accesoadatos.InscripcionData;
import accesoadatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.time.LocalDate;

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
        Connection con = Conexion.getConexion();

//     Materia religion = new Materia(5,"Religion", 10 ,true);
//     Materia ingles = new Materia("Ingles", 2 ,true);
//     Materia informatica = new Materia("Informatica", 4, true);
//     Materia lengua = new Materia(8,"Lengua", 3, true);
//     MateriaData mat = new MateriaData();
//     for(Materia materia: mat.listarMaterias()){
//         System.out.println("Nombre de la materia: " +materia.getNombre()); 
//         System.out.println("Año de la materia: " +materia.getAnioMateria()); 
//         System.out.println("ID: " +materia.getIdMateria()); 
//         
//     }
//     mat.guardarMateria(matematicas);
//     mat.guardarMateria(ingles);
//     mat.guardarMateria(lengua);
//      mat.modificarMateria(religion);
      
//      mat.eliminarMateria(6);
//     Materia materiaEncontrada = mat.buscarMateria(7);
//     if (materiaEncontrada != null){
//         System.out.println("ID: " + materiaEncontrada.getIdMateria());
//         System.out.println("nombre: " + materiaEncontrada.getNombre());
//         System.out.println("año: " + materiaEncontrada.getAnioMateria());
//         
//    }
//       Alumno carlos = new Alumno(37577100,"Nardone", "Carlos", LocalDate.of(1994, 11, 22), true);
        //Alumno franco = new Alumno(433132332,"Lopez", "Franco", LocalDate.of(2001, 10, 21), true);
//        Alumno eduardo = new Alumno(5, 37064864, "Rodrigues", "Juan Ariel", LocalDate.of(1986, 12, 23), true);
////        Alumno diego = new Alumno (24652571, "Bazzoni","Diego",LocalDate.of(1976, 1, 23), true);
////        Alumno mauricio = new Alumno (30068183, "Avila", "Mauricio", LocalDate.of(1983,4,10), true);
//         AlumnoData alu = new AlumnoData();
//        //alu.guardarAlumno(franco);
//        alu.modificarAlumno(eduardo);
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

//        AlumnoData aludata = new AlumnoData();
//        MateriaData mat = new MateriaData();
//        InscripcionData insc = new InscripcionData();
//
//        Alumno julio = aludata.buscarAlumnoPorDni(24652571);
//        
//        
//        Materia informatica = mat.buscarMateria(11);
//        
//        Inscripcion in = new Inscripcion(julio, informatica, 8);

//        insc.guardarInscripcion(in);
//        insc.actualizarNota(4, 8, 5);
//        insc.borrarInscripcionMateriaAlumno(4, 8);
        
//        for(Inscripcion inscripcion:insc.obtenerInscripcionesPorAlumno(4)){
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido " +inscripcion.getAlumno().getApellido());
//            System.out.println("Materia " +inscripcion.getMateria().getNombre());  
//        }
        


//        for(Materia materia:insc.obtenerMateriasNOCursadas(4)){
//            System.out.println("Nombre " + materia.getNombre());
        }
        
        
        
    }

