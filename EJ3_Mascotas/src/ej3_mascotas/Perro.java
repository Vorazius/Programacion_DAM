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
public class Perro extends Mascotas {
    
    //VARIABLES INSTANCIA
    private String raza;
    private boolean pulgas;
    
    //CONSTRUCTOR

    public Perro(String nombre, int edad, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    
    //GETTER Y SETTER

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    
    
    //METODOS
    @Override
    public void muestra() {
        System.out.println("Tipo: Perro");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
        System.out.println("Raza: " + raza);
        System.out.println("Pulgas: " + pulgas);
    }
    
    public void habla(){
        System.out.println("guau");
    }
} //class
