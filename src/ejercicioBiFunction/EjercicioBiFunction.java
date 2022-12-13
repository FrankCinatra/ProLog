/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiFunction;

import java.util.function.BiFunction;

/**
 *
 * @author Grijalva
 */
public class EjercicioBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> bif = (x,y) -> x + y;
        
        System.out.println(bif.apply("Hola ","Mundo"));
    }
}
