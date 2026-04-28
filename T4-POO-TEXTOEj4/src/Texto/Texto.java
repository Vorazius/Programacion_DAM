/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Texto;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author darkh
 */
public class Texto {

    private String cadena;
    private int longitud;
    private Date modificacion;
    private LocalDate creacion;
    
    
    private static final String VOCALES = "aeiouáéíóú";

    public Texto(int longitud) {
        this.longitud = longitud;
        cadena="";
        modificacion = null;
        creacion = LocalDate.now();
    }
    
    //Metodos
    public String añadirInicio(char caracter) {
        if (longitud > cadena.length()) {
            System.out.println("No puedes añadir mas palabras");
        } else {
            cadena = caracter + cadena;
            modificacion = new Date();
        }
        
        return cadena;
    }
    
    public String añadirFinal(char caracter) {
        if (longitud > cadena.length()) {
            System.out.println("No puedes añadir mas palabras");
        } else {
            cadena = cadena + caracter;
            modificacion = new Date();
        }
        
        return cadena;
    }
    
    public String añadirInicio(String cad) {
        if (longitud > (cadena.length() + cad.length())) {
            System.out.println("No puedes añadir mas palabras");
        } else {
            cadena = cad + cadena;
            modificacion = new Date();
        }
        
        return cadena;
    }

    public String añadirFinal(String cad) {
        if (longitud > (cadena.length() + cad.length())) {
            System.out.println("No puedes añadir mas palabras");
        } else {
            cadena = cadena + cad;
            modificacion = new Date();
        }
        
        return cadena;
    }
    
    public int vocales() {
        int num = 0;
        for (int i = 0; i < cadena.length(); i++) {
            
            if (esVocal(cadena.charAt(i))) {
                num++;
            }
            
        }
        return num;
   
    }
 
    
    private boolean esVocal(char c) {
        boolean resultado = false;
        c = Character.toLowerCase(c);
        
        if (VOCALES.indexOf(c) != -1) {
            resultado = true;
        }
        
        return resultado;
        
    }
    
    public void imprimeCadena(){
        System.out.println("\nCADENA ACTUAL: "+cadena);
        System.out.println("Creación: "+creacion);
        System.out.println("Última modificación: "+modificacion);
    }
}
