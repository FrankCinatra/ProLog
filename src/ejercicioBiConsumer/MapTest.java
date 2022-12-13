/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Grijalva
 * Independiente
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        
        String[][] arreglo = {{"Chris","USA"},{"Raju","India"},{"Lynda","Canada"}};
        
        for(int i = 0; i < arreglo.length; i++){
            map.put( arreglo[i][0], arreglo[i][1] );
        }
        
        System.out.println("Forma tradicional clave y valor");
        
        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        if(iter != null){
            while(iter.hasNext()){
                Map.Entry<String,String> entry = iter.next();
                System.out.println("Clave: "+entry.getKey() +"\tValor: " +entry.getValue());
            }
        }
        //------------------------------------------------------------------------------------------------------
        System.out.println("\nUsando BiConsumer y expresiones lambda: ");
        map.forEach( (key,value) -> {System.out.println("Clave: "+key +"\tValor: "+value);});
    }
}
