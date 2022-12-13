package ejercicioBinaryOperator;

import java.util.function.BinaryOperator;

/**
 *
 * @author Grijalva
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> boperator = (num1,num2) -> num1*num2;
        
        int resultado = boperator.apply(10, 20);
        System.out.println("Resultado: " +resultado);
        
        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy( (Integer t1, Integer t2) -> t1.compareTo(t2) );
        
        resultado = bOperatorMin.apply(10, 20);
        
        System.out.println("Numero menor entre 10 y 20 es: " +resultado);
        
        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy( (Integer t1, Integer t2) -> t1.compareTo(t2) );
        
        resultado = bOperatorMax.apply(10, 20);
        System.out.println("Numero menor entre 10 y 20 es: " +resultado);
    }
}
