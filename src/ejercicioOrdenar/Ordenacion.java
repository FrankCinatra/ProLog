/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOrdenar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Grijalva
 */
public class Ordenacion {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos","Nayeli","Maggy","Tommy","Loreli");
        
        System.out.println("Lista sin orden: " +nombres);
        
        Collections.sort(nombres);
        
        System.out.println("Lista ordenada: " +nombres);
        
        List<Persona> personas = new ArrayList<>();
        
        personas.add( new Persona(1,"Carlos"));
        personas.add( new Persona(2,"Nayeli"));
        personas.add( new Persona(3,"Maggy"));
        personas.add( new Persona(4,"Tommy"));
        personas.add( new Persona(5,"Loreli"));

        System.out.println("Lista ordenada: " +personas);
        
        Collections.sort(personas);
        
        System.out.println("Lista ordenada personas: " +personas);
        
        //Collections.sort(personas, new OrdenadorPersonaPorId());
        
        Collections.sort(personas, (p1,p2) -> p1.getIdPersona()-p2.getIdPersona());
        
        System.out.println("Lista ordenada personas por ID: " +personas);
    }
}
