/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiFunction;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Grijalva
 */
public class EjercicioBiFunction3 {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Javier", 2563.2),
                new Empleado("Montero", 183.2),
                new Empleado("Carlos", 2648879.2),
                new Empleado("Yolatl", 2546.3),
                new Empleado("Joshua", 254.2),
                new Empleado("Tommy", 28.5),
                new Empleado("Pickles", 4891.2)
        );

        CalculadoraBiFunction2 calc = new CalculadoraBiFunction2();
        List<Double> salarios = calc.calc( (salario, incremento) -> salario + (salario*(incremento/100)) , listaEmpleados, 16.0);
        
        for (Double salario: salarios){
            System.out.println(salario);
        }
        
    }
}
