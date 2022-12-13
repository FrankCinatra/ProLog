/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOperacionMutable;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Grijalva
 */
public class OpReduccion1 {
    public static void main(String[] args) {
//        List<String> nombres = Empleado.empleados().stream()
//                .map(Empleado::getNombre)
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        
//        System.out.println(nombres);

//        List<String> listNombres = Empleado.empleados().stream()
//                .map(Empleado::getNombre)
//                .collect(Collectors.toList());
//        
//        System.out.println("\n"+listNombres);

//        Set<String> setNombres = Empleado.empleados().stream()
//                .map(Empleado::getNombre)
//                .collect(Collectors.toSet());
//        System.out.println(setNombres);

        SortedSet<String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(nombres);
    }
}
