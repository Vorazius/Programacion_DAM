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
public abstract class Aves extends Mascotas{
    
    private String pico;
    private boolean vuela;

    public Aves(String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, boolean estado) {
        super(nombre, edad, fechaNacimiento, estado);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
    //Metodos
    public abstract void volar();
    
}

