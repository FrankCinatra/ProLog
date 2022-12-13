/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioConsumer;

import java.util.function.Consumer;

/**
 *
 * @author Grijalva
 */
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        
        cons.accept("Asies");
    }
}
