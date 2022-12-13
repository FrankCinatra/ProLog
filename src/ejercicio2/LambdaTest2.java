/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Grijalva
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        //instancia y set de la interfaz
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        
        //uso de la interfaz
        op.printOperacion(10, 5);
        
        //forma 2 de usar la interzas
        LambdaTest2 objeto = new LambdaTest2();
        //forma 2, metodo 1
        objeto.miMetodo(op, 10, 5);
        //forma 2, metodo 2
        objeto.miMetodo( (num1, num2) -> System.out.println( num1 * num2 ), 10, 5);
    }
    
    public void miMetodo(Operaciones op, int num1, int num2){
        op.printOperacion(num1, num2);
    }
}
