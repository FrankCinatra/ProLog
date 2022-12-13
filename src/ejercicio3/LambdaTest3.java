/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Grijalva
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        engine( (x,y) -> x+y);
        engine( (x,y) -> x/y);
        engine( (x,y) -> x*y);
        engine( (x,y) -> x%y);
    }
    
    private static void engine(Calculadora calc){
        int x = 2, y = 4;
        
        int resul = calc.calcular(x, y);
        
        System.out.println(resul);
    }
}
