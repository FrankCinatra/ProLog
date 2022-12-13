package ejercicioFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Grijalva
 */
public class DatosComensales {
    
    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(new Comensal("Javier",10,5),
                new Comensal("Montero",25.5,6),
                new Comensal("Carlos",182.2,4),
                new Comensal("Yolatl",485.6,5),
                new Comensal("Joshua",66.6,2),
                new Comensal("Tommy",729.1,1),
                new Comensal("Pickles",44.5,2));
        
        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
        
        System.out.println("La lista de nombres es la sig.: ");
        nombresComensales.forEach((nombreComensal) -> {
            System.out.println("El nombre es: " +nombreComensal);
        });
        
        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMonto_pedido());
        montosComensales.forEach((montoComensal) -> {
            System.out.println("El monto es: " +montoComensal);
        });
    }
    
    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func){
        List<Object> listaDatos = new ArrayList<>();
        
        for(Comensal comensal: listaCom){
            listaDatos.add(func.apply(comensal));
        }
        
        return listaDatos;
    }
}
