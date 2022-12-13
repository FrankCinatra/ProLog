/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPredicate;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Grijalva
 */
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Javier",25,7000,"Sistemas"),
                new Empleado("Carlos",25,7000,"Sistemas"),
                new Empleado("Yolatl",35,5000,"Marketing"),
                new Empleado("Joshua",30,4000,"Diseño"),
                new Empleado("Tommy",29,1500,"Ventas"),
                new Empleado("Pickles",27,4000,"Diseño"),
                new Empleado("Francisco",19,1500,"Mostrador")
        );
        
        Evaluador evaluador = new Evaluador( );
        
        System.out.println("Empleados con salario mayor a 5000");
        
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, empleado -> empleado.getSalario() > 5000);
        
        for (Empleado empleado : empSalariosAltos){
            System.out.println(empleado.getNombre());
        }
        
        System.out.println("\nEmpleados cuyo nombre inicia con J:");
        
        List<Empleado> empIniciaJ = evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("J"));
        
        for (Empleado empleado : empIniciaJ){
            System.out.println(empleado.getNombre());
        }
        
        System.out.println("\nEmpleados jóvenes:");
        
        List<Empleado> empJovenes = evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);
        
        empJovenes.forEach((empleado) -> {
            System.out.println(empleado.getNombre());
        });
        
        //incremento de salario a empleados jovenes
        Funciones func = new Funciones();
        
        empJovenes.forEach( (empleado) -> {
            double nuevoSalario = func.incrementoSalario(empleado, 10, (salario,incremento) -> salario + (salario*(incremento/100)) );
            
            empleado.setSalario(nuevoSalario);
        });
        
        System.out.println("\nSalario nuevo en empleados jóvenes:");
        
        empJovenes.forEach((empleado) -> {
            System.out.println("Nombre: " +empleado.getNombre() +". Salario: " +empleado.getSalario());
        });
        
        System.out.println("\nEmpleados mayores:");
        
        List<Empleado> empMayores = evaluador.evaluarAlContrario(listaEmpleados, empleado -> empleado.getEdad() < 25);
        
        empMayores.forEach((empleado) -> {
            System.out.println(empleado.getNombre());
        });
    }
}
