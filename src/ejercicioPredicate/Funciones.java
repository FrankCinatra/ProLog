/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPredicate;

import java.util.function.BiFunction;

/**
 *
 * @author Grijalva
 */
public class Funciones {
    public double incrementoSalario(Empleado emp, double incremento, BiFunction<Double,Double,Double> bi){
        return bi.apply(emp.getSalario(), incremento);
    }
}
