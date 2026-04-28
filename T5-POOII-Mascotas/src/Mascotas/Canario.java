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
public class Canario extends Aves {
    
    private String color;
    private boolean canta;

    public Canario(String color, boolean canta, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, boolean estado) {
        super(pico, vuela, nombre, edad, fechaNacimiento, estado);
        this.color = color;
        this.canta = canta;
    }

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
    
    //Metodo

    @Override
    public void volar() {
        System.out.println("Vuela");
    }

    @Override
    public void habla() {
        System.out.println("Pio, Pio");
    }
    
    public void muestra() {
        super.muestra();
        System.out.println("Color= " + color);
        System.out.println("Canra= " + canta);
    }
    
}

