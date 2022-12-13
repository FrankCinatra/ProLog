/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Grijalva
 */
public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval){
        List<Empleado> listaNueva = new ArrayList<>();
        
        for(Empleado empleado : listEmp){
            if(eval.test(empleado)){
                listaNueva.add(empleado);
            }
        }
        
        return listaNueva;
    }
    
    public List<Empleado> evaluarAlContrario(List<Empleado> listEmp, Predicate<Empleado> eval){
        List<Empleado> listaNueva = new ArrayList<>();
        
        for(Empleado empleado : listEmp){
            if(eval.negate().test(empleado)){
                listaNueva.add(empleado);
            }
        }
        
        return listaNueva;
    }
}
