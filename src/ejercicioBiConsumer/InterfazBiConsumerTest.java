/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiConsumer;

import java.util.function.BiConsumer;

/**
 *
 * @author Grijalva
 * Independiente
 */
public class InterfazBiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biconsumer = (num1,num2) -> {
            double mult = num1 * num2;
            System.out.println("La multiplicación es: " +mult);
        };
        
        biconsumer.accept(15.2, 52.25);
    }
}
