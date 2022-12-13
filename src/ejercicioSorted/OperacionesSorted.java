package ejercicioSorted;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Grijalva
 */
public class OperacionesSorted {
    public static void main(String[] args) {
//        System.out.println("Nombres ordenados: ");
//        
//        Arrays.asList("Alfredo","Maria","Daniel","Brenda").stream()
//                .sorted().forEach(System.out::println);
//        
//        System.out.println("Numeros ordenados: ");
//        Arrays.asList(1,2,4,6,5,7,6,2,7,5,5,4,1,3).stream()
//                .sorted().forEach(System.out::println);

        System.out.println("Empleados ordenados alfabeticamente: ");
        List<Empleado> empleados = Empleado.empleados();
        
        empleados.stream().sorted().forEach( emp -> System.out.println(emp.getNombre()));
        
        System.out.println("\nEmpleados ordenados por edad: ");
        empleados.stream()
                .sorted( new Comparator<Empleado>(){
                    @Override
                    public int compare(Empleado emp1, Empleado emp2){
                        return emp1.getEdad() - emp2.getEdad();
                    }
                }).forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getEdad()));
        
        System.out.println("\nEmpleados ordenados por salario: ");
        empleados.stream()
                .filter( emp -> emp.getEdad() > 25)
                .sorted( (emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()) )
                .forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getIngresos()));
    }
}
