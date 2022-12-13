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
public class Principal {
    public static void main(String[] args) {
        /**
         * Al existir ambiguedad en el tipo de parametro, se puede hacer un CAST o definir
         * el tipo de dato del parametro enviado, o bien, crear instancias de la interfaz y
         * mandar la instancia de la interfaz como parametro
         */
        CalculadoraInt calcI = (x, y) -> x*y;
        
        engine( calcI ); //envío de la instancia
        engine( (int x, int y) -> x+y ); //def tipo de dato
        engine( (CalculadoraLong)(x, y) -> x+y ); //CAST del parametro
    }
    
    public static void engine(CalculadoraInt calc){
        
    }
    
    public static void engine(CalculadoraLong calc){
        
    }
}
