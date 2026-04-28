/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Astros;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Planeta extends Astros {
    
    private double distanciaSol;
    private double orbita;
    private boolean tieneSatelites;
    private ArrayList<Satelite> Satelites = new ArrayList<>();
    
    //Constructor

    public Planeta(double distanciaSol, double orbita, boolean tieneSatelites, double masaCuerpo, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia) {
        super(masaCuerpo, diametroMedio, periodoRotacion, periodoTranslacion, distanciaMedia);
        this.distanciaSol = distanciaSol;
        this.orbita = orbita;
        this.tieneSatelites = tieneSatelites;
    }
    
    
    
    //Getter y Setter

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
    
    //Metodo
    public String muestra() {
        return "distanciaSol=" + distanciaSol + ", orbita=" + orbita + ", tieneSatelites=" + tieneSatelites;
    }
    
    
}

