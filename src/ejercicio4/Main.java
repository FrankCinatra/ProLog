/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Grijalva
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(4, 5));
    }
    
    private static CalculadoraLong create(){
        /**
         * Las variables de la expresion lambda son locales por lo tanto
         * no pueden haber 2 variables con el mismo nombre
         */
        long var = 201;
        
        return (x, y) -> x * y;
    }
}
