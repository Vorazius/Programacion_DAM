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
public abstract class GranTamaño extends Dispositivos {
    
    
    protected double resolucion;

    
    //constructor
    public GranTamaño(double resolucion, String marca, double precio, int año) {
        super(marca, precio, año);
        this.resolucion = resolucion;
    }
    
    //Getter y setter

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }
    
    //Metodos
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Resolucion: " + resolucion);
    }
    
    
}

