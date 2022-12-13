/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author Grijalva
 */
public class CalculadoraBiFunction2 {
    public List<Double> calc(BiFunction<Double,Double,Double> bif, List<Empleado> listaEmp, Double incremento){
        List<Double> listaSalarios = new ArrayList<>();
        
        for(Empleado empleado: listaEmp){
            listaSalarios.add(bif.apply(empleado.getSalario(),incremento));
        }
        
        return listaSalarios;
    }
}
