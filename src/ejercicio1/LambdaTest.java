/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Grijalva
 */
public class LambdaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FunctionTest ft = () -> System.out.println("Hola mundo con interfaces y exp lambda");
        
        //ft.saludar();
        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);
    }
    
    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
    
}
