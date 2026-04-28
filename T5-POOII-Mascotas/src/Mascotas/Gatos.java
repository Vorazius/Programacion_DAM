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
public class Gatos extends Mascotas {
    
    private String color;
    private boolean peloLargo;

    public Gatos(String color, boolean peloLargo, String nombre, int edad, String fechaNacimiento, boolean estado) {
        super(nombre, edad, fechaNacimiento, estado);
        this.color = color;
        this.peloLargo = peloLargo;
    }

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
    
    //Metodos
    
    public void habla() {
        System.out.println("Miauu");
    }
    
    public void muestra() {
        super.muestra();
        System.out.println("Color= " + color);
        System.out.println("Pelo largo= " + peloLargo);
    }
    
}

