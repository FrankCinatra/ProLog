/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOperacionesReduccion;

import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Grijalva
 */
public class OperacionesReduccion1 {
    public static void main(String[] args) {
        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};
        
        //System.out.println("La suma es: "+suma);
        
        List<Empleado> empleados = Empleado.empleados();
        
        //Suma
        System.out.println("La suma es: "+IntStream.of(numeros).sum());
        
        //Promedio
        System.out.println("Promedio es: "+IntStream.of(numeros).average().getAsDouble());
        
        //Minimo y maximo
        System.out.println("Promedio es: "+IntStream.of(numeros).max().getAsInt());
        System.out.println("\nPromedio es: "+IntStream.of(numeros).min().getAsInt());
        
        //Operaciones con Empleados
        //suma de salarios
        System.out.println("Suma de salarios: " +empleados.stream().mapToDouble( Empleado::getIngresos).sum());
        
        //empleado salario max
        Empleado empMax = empleados.stream().max( (emp1,emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos())).get();
        
        System.out.println("Empleado salario maximo: " +empMax.getNombre() +" " +empMax.getIngresos());
    }
}
