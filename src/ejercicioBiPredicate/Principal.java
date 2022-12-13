package ejercicioBiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author Grijalva
 * Va en conjunto con Empleado
 * 
 * Criterios:
 * 1- 25 años en adelante y esten en ventas ó
 * 2 - 25 años en adelante y que esten en sistemas
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
                new Empleado("Nayeli",25,4000,"Ventas"),
                new Empleado("Sammy",27,4000,"Mostrador"),
                new Empleado("Francisco",19,1500,"Ventas")
        );
        
        Evaluador evaluador = new Evaluador();
        
        BiPredicate<Integer,String> primerCriterio = (edad, departamento) -> ( edad>=25 ) && ( departamento.equals("Ventas"));
        BiPredicate<Integer,String> segundoCriterio = (edad, departamento) -> ( edad>=25 ) && ( departamento.equals("Sistemas"));
        BiPredicate<Integer,String> criterio = primerCriterio.or(segundoCriterio);
        
        System.out.println("Empleados de Mostrador o Ventas mayores de 25 años");
        
        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        
        listaActualizada.forEach((empleado) -> {
            System.out.println("Nombre: " +empleado.getNombre() + " Edad: " +empleado.getEdad() +" Departamento: " +empleado.getDepartamento());
        });
    }
}
