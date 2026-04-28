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
public class Altavoces extends Portatiles{
    
    protected String calidad;

    
    //Constructor
    public Altavoces(String calidad, String marca, double peso,  double precio, int año) {
        super(peso, marca, precio, año);
        this.calidad = calidad;
    }
    
    //getter y setter

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
    
    //Metodos
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Calidad: " + calidad);
    }
    
    public double PVP() {
        double incremento = precio*0.15;
        precio += incremento;
        return precio;
    }
    
    
}

