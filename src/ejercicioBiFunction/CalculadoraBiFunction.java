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
public class CalculadoraBiFunction {
    public String calc(BiFunction<Integer,Integer,String> bif, Integer i1, Integer i2){
        return bif.apply(i1,i2);
    }
}
