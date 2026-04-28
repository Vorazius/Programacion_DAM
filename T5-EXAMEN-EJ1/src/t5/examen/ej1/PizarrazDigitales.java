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
public class PizarrazDigitales extends GranTamaño{
    
    protected int numHerramientas;

    
    //constructor

    public PizarrazDigitales(int numHerramientas, double resolucion, String marca, double precio, int año) {
        super(resolucion, marca, precio, año);
        this.numHerramientas = numHerramientas;
    }

    //getter y setter
    public int getNumHerramientas() {
        return numHerramientas;
    }

    public void setNumHerramientas(int numHerramientas) {
        this.numHerramientas = numHerramientas;
    }
    
    
    //Metodos
    
    public double PVP() {
        double incremento = precio*0.35;
        precio += incremento;
        return precio;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero herramientas: " + numHerramientas);
    }
    
    
}

