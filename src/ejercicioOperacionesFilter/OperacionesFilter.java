/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioOperacionesFilter;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Grijalva
 */
public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();
        
        System.out.println("Empleados hombres: ");
        empleados.stream()
                .filter( new Predicate<Empleado>(){
                    @Override
                    public boolean test(Empleado emp){
                        return emp.esHombre();
                    }}).forEach( emp -> System.out.println(emp.getNombre() +" "+emp.getGenero()));
        
        System.out.println("\nEmpleados que son mujeres: ");
        empleados.stream().filter( Empleado::esMujer )
                .forEach( emp -> System.out.println(emp.getNombre() +" "+emp.getGenero()) );
        
        System.out.println("\nEmpleados mayores de 25 años: ");
        empleados.stream().filter( emp -> emp.getEdad() > 25 )
                .forEach( emp -> System.out.println(emp.getNombre() +" "+emp.getEdad()) );
        
        System.out.println("\nEmpleados Hombres cuyo nombre inicie con A: ");
        empleados.stream()
                .filter( Empleado::esHombre )
                .filter( emp -> emp.getNombre().startsWith("A"))
                .forEach( emp -> System.out.println(emp.getNombre()) );
        
        System.out.println("\nEmpleados Hombres cuyo ingreso sea > 1500: ");
        empleados.stream()
                .filter( emp -> emp.esHombre() && emp.getIngresos()>1500 )
                .forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getIngresos()) );
        
        System.out.println("\nEmpleados Mujer > 25 años con ingreso > 3000: ");
        
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empMayor25 = emp -> emp.getEdad()>25;
        Predicate<Empleado> empMayor3000 = emp -> emp.getIngresos()>3000;
        Predicate<Empleado> fem253000 = empFemenino.and(empMayor25).and(empMayor3000);
        
        empleados.stream().filter(fem253000)
                .forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getGenero() +" " +emp.getIngresos()));
        
        System.out.println("Cantidad total: " +empleados.stream().filter(fem253000).count());
    }
}
