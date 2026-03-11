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
public class Loro extends Aves {
    
    //VARIABLES INSTANCIA
    private String origen;
    private boolean habla;
    
    //CONSTRUCTOR

    public Loro(String nombre, int edad, String fechaNacimiento, String origen, boolean habla, String pico, boolean vuela) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    

    

    //GETTER Y SETTER

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
    //METODOS
    @Override
    public void muestra() {
        System.out.println("Tipo: Loro");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
        System.out.println("Origen: " + origen);
        System.out.println("Habla: " + habla);
        System.out.println("Tipo de pico: " + getPico());
        System.out.println("Vuela: " + isVuela());
    }
    
    public void saluda(){
        
    }
    
    public void volar(){
        System.out.println("Vuela");
    }
    
    public void habla(){
        
    }
} //class
