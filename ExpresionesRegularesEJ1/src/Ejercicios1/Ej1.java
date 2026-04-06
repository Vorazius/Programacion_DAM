/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios1;

/**
 *
 * @author Marta González
 */

import java.util.regex.*;

public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Busca la cadena "cena" dentro de un String*/
        int contador=0;
        String encontrado="";
        
        String texto = "La quincena para la cena";
        String regex = "cena";
        
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        while(matcher.find()) {
            encontrado = matcher.group();
            System.out.println("La coincidencia es: " + encontrado);
            contador++;
        }
        
        System.out.println("Coincidencias: "+contador);
    }
    
}
