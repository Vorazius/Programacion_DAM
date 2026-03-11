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
public class Gato extends Mascotas{
    
    //VARIABLES INSTANCIA
    private String color;
    private boolean peloLargo;
    
    //CONSTRUCTOR

    public Gato(String nombre, int edad, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    

    
    
    //GETTER Y SETTER

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
    //METODOS
    @Override
    public void muestra() {
        System.out.println("Tipo: Gato");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
        System.out.println("Color: " + color);
        System.out.println("Pelo largo: " + peloLargo);
    }
    
    public void habla(){
        System.out.println("miau");
    }
} //class
