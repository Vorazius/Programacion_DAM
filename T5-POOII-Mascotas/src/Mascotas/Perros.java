/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Mascotas;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Perros extends Mascotas {
    
    private String raza;
    private int pulgas;

    public Perros(String raza, int pulgas, String nombre, int edad, String fechaNacimiento, boolean estado) {
        super(nombre, edad, fechaNacimiento, estado);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPulgas() {
        return pulgas;
    }

    public void setPulgas(int pulgas) {
        this.pulgas = pulgas;
    }
    
    //Metodos
    public void muestra(){
        super.muestra();
        System.out.println("Raza= " + raza);
        System.out.println("Pulgas= " + pulgas);
    }


    public void habla() {
        System.out.println("Guau");
    }
    
    
    
}

