/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiFunction;

/**
 *
 * @author Grijalva
 */
public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        CalculadoraBiFunction calculadora = new CalculadoraBiFunction();
        
        String resultado = calculadora.calc( (x,y) -> ": " + (x * y), 40, 20 );
        
        System.out.println("Resultado" +resultado);
        System.out.println("Resultado es " +resultado.length());
    }
}
