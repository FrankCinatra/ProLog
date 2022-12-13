/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Grijalva
 */
public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("John",6),
                new Estudiante("Nayeli",8),
                new Estudiante("Magda",7),
                new Estudiante("Maggy",10),
                new Estudiante("Tommy",5),
                new Estudiante("Carlos",8),
                new Estudiante("Israel",3),
                new Estudiante("Fernanda",4),
                new Estudiante("Paola",10),
                new Estudiante("James",5),
                new Estudiante("Perla",7),
                new Estudiante("Arenah",7),
                new Estudiante("Alejandra",10)
        );
        
        OperacionEstudiantes op = new OperacionEstudiantes();
        
//        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " +e.getNombre() +" Calificacion: "+e.getCalificacion());
//        System.out.println("Estudiantes sin calificacion actualizada");
//        op.aceptaTodos(estudiantes, cons1);
//        
//        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
//        
//        op.aceptaTodos(estudiantes, cons2);
//        
//        System.out.println("Estudiantes con calificacion actualizada");
//        op.aceptaTodos(estudiantes, cons1);

        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " +e.getNombre() +" Calificacion: "+e.getCalificacion());
        System.out.println("Estudiantes sin calificacion actualizada");
        op.aceptaTodos(estudiantes, cons1);
        
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        
        System.out.println("Estudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes, cons3);
    }
}
