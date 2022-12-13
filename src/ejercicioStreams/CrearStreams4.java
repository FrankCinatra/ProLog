/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioStreams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 *
 * @author Grijalva
 * Introduce cadena con el teclado (Scanner)
 * Quita espacios en blanco y digitos y solo deja las pablabras
 */
public class CrearStreams4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        
        IntStream streamChars = entrada.chars();
        
        streamChars.filter( n -> !Character.isDigit( (char)n ) && !Character.isWhitespace( (char)n ) )
                .forEach( n -> System.out.print( (char)n ) );
        
        System.out.println("\n");
        
        String str = "HTML, CSS, JAVASCRIPT, C++, C#, PHP";
        Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);
    }
}
