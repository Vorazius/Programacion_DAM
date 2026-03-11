/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej3_mascotas;

import java.util.Date;
import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Canario extends Aves {
    
    //VARIABLES INSTANCIA
    private String color;
    private boolean canta;
    
    //CONSTRUCTOR

    public Canario(String nombre, int edad, String fechaNacimiento, String color, boolean canta, String pico, boolean vuela) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    
    
    
    //GETTER Y SETTER 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    //METODOS
    public void muestra(){
        
    }
    
    public void habla(){
        
    }
    
    public void volar(){
        System.out.println("vuela");
    }
} //class
