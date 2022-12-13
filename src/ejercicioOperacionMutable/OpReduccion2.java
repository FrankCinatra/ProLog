/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOperacionMutable;

import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Grijalva
 */
public class OpReduccion2 {
    public static void main(String[] args) {
        Map<Long,String> idANombreMap = Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
        
        System.out.println(idANombreMap);
        
        System.out.println("\n");
        
        Map<Empleado.Genero,String> generoANombreMap = Empleado.empleados().stream()
                .collect(Collectors.toMap(
                        Empleado::getGenero,
                        Empleado::getNombre,
                        (nom1,nom2) -> String.join(", ", nom1,nom2)
                ));
        
        System.out.println(generoANombreMap);
    }
}
