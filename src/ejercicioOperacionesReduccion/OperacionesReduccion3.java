/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOperacionesReduccion;

import java.util.stream.IntStream;

/**
 *
 * @author Grijalva
 */
public class OperacionesReduccion3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 20)
            .summaryStatistics());
        
        System.out.println("Suma: " +IntStream.range(1, 20)
                .summaryStatistics().getSum());
        
        System.out.println("Promedio: " +IntStream.range(1, 20)
                .summaryStatistics().getAverage());
    }
}
