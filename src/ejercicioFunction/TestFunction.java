package ejercicioFunction;

import java.util.function.Function;

/**
 *
 * @author Grijalva
 */
public class TestFunction {
    public static void main(String[] args) {
//        Function<Integer, String> convertidorBase = new Function<Integer, String>(){
//            @Override
//            public String apply(Integer t){
//                throw new UnsupportedOperationException("Not Supported Yet");
//            }
//        };

        Function<Integer, String> convertidor = x -> Integer.toString(x);
        
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(30).length());
    }
}
