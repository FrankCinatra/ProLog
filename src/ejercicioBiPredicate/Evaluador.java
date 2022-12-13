package ejercicioBiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author Grijalva
 * Va en conjunto con Principal
 */
public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listaEmp, BiPredicate<Integer,String> eval){
        List<Empleado> listaNueva = new ArrayList<>();
        
        for(Empleado empleado : listaEmp){
            if(eval.test(empleado.getEdad(),empleado.getDepartamento())){
                listaNueva.add(empleado);
            }
        }
        
        return listaNueva;
    }
}
