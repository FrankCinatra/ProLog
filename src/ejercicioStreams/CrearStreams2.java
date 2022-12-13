/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioStreams;

import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author Grijalva
 */
public class CrearStreams2 {
    public static void main(String[] args) {
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n+1).limit(10);
        
        primerosDiez.forEach(System.out::println);
        
        Stream.iterate(1L, n -> n+1)
                .filter( n -> n%2==0 )
                .limit(20)
                .forEach( System.out::println);
        
        System.out.println("\nDespués de 100");
        Stream.iterate(1L, n -> n+1)
                .filter( n -> n%2==0 )
                .skip(100)
                .limit(5)
                .forEach( System.out::println);
        
        System.out.println("\nNumeros aleatorios");
        Stream.generate( Math::random ).limit(5).forEach(System.out::println);
        
        System.out.println("\nEnteros aleatorios");
        new Random().ints().limit(5).forEach(System.out::println);
    }
}
