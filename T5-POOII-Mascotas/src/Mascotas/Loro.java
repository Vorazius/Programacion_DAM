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
public class Loro extends Aves{
    
    private String origen;
    private boolean habla;

    public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, boolean estado) {
        super(pico, vuela, nombre, edad, fechaNacimiento, estado);
        this.origen = origen;
        this.habla = habla;
    }

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
    
    //Metodos
    @Override
    public void volar() {
        System.out.println("Vuela");
    }

    
    public void habla() {
        System.out.println("Lorito, lorito");
    }
    
    
    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Origen= " + origen);
        System.out.println("Habla= " + habla);
    }
}

