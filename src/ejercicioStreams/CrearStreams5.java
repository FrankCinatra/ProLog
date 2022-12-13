/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 *
 * @author Grijalva
 */
public class CrearStreams5 {
    public static void main(String[] args) {
        Path path1 = Paths.get("Parrafo.txt");
        
        try(Stream<String> lineas = Files.lines(path1)){
            lineas.forEach( linea -> {
                System.out.println("Linea...");
                System.out.println(linea);
            });
        }catch( IOException e){
            e.printStackTrace();
        }
        
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos del proyecto %s es %n ",dir.toAbsolutePath());
        
        try(Stream<Path> paths = Files.walk(dir)){
            paths.forEach( System.out::println );
        }catch( IOException e){
            e.printStackTrace();
        }
    }
}
