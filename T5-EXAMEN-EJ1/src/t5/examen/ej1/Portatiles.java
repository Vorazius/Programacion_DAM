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
public abstract class Portatiles extends Dispositivos{
    
    protected double peso;

    //constructo
    public Portatiles(double peso, String marca, double precio, int año) {
        super(marca, precio, año);
        this.peso = peso;
    }
    
    //Getter y setter

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos

    public void imprimir() {
        super.imprimir();
        System.out.println("Peso: " + peso);
    }
    
    
    
    
    
}

