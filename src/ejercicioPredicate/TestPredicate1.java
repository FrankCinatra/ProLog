/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPredicate;

import java.util.function.Predicate;

/**
 *
 * @author Grijalva
 */
public class TestPredicate1 {

    public static void main(String[] args) {
        Predicate<Integer> predictate = (valor) -> valor > 0;
        System.out.println(predictate.test(2));
    }
}
