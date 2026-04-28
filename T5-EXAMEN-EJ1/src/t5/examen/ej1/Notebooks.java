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
public class Notebooks extends Portatiles{
    
    protected double duracionBateria;
    
    //constructor

    public Notebooks(double duracionBateria, double peso, String marca, double precio, int año) {
        super(peso, marca, precio, año);
        this.duracionBateria = duracionBateria;
    }
    
    //getter y setter

    public double getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(double duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    //Metodos
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Duracion Bateria: " + duracionBateria);
    }
    
    public double PVP() {
        double incremento = precio*0.20;
        precio += incremento;
        return precio;
    }
    
    
}

