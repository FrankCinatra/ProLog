/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioMap;

import java.util.List;

/**
 *
 * @author Grijalva
 */
public class OperacionesMap {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1,5).map( new IntUnaryOperator() {
//            @Override
//            public int applyAsInt(int numero) {
//                return numero * numero;
//            }
//        }).forEach( System.out::println);
//        
//        
//        IntStream.rangeClosed(1,10).map( n -> n*2 )
//                .forEach( System.out::println);

        List<Empleado> empleados = Empleado.empleados();
        
        System.out.println("Promedio ingresos personal Femenino > 25 años: ");
        double suma = empleados.stream().filter( emp -> emp.esMujer() && emp.getEdad() > 25)
                .mapToDouble( emp -> emp.getIngresos()).sum();
        
        double promedio = suma / empleados.stream().filter( emp -> emp.esMujer() && emp.getEdad() > 25).count();
        
        System.out.println("El promedio es: " +promedio);
    }
}
