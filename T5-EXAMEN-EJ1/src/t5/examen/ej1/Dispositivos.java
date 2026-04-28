/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t5.examen.ej1;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public abstract class Dispositivos {
    
    protected static final int TENSION = 225;
    protected String marca;
    protected double precio;
    protected int año;
    
    //Constructor

    public Dispositivos(String marca, double precio, int año) {
        this.marca = marca;
        this.precio = precio;
        this.año = año;
    }
    
    //getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //Metodos
    
    public abstract double PVP();
    
    public void imprimir() {
        System.out.println("Tension: " + TENSION);
        System.out.println("Marca: " + marca);
        System.out.println("Preico: " + precio);
        System.out.println("Año: " + año);
    }
    
}

