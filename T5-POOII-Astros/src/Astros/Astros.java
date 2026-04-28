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
public abstract class Astros {
    private double masaCuerpo;
    private double diametroMedio;
    private double periodoRotacion;
    private double periodoTranslacion;
    private double distanciaMedia;
    public abstract String muestra();
    
    //Constructor

    public Astros(double masaCuerpo, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia) {
        this.masaCuerpo = masaCuerpo;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTranslacion = periodoTranslacion;
        this.distanciaMedia = distanciaMedia;
    }
    
    //Getters y setters

    public double getMasaCuerpo() {
        return masaCuerpo;
    }

    public void setMasaCuerpo(double masaCuerpo) {
        this.masaCuerpo = masaCuerpo;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTranslacion() {
        return periodoTranslacion;
    }

    public void setPeriodoTranslacion(double periodoTranslacion) {
        this.periodoTranslacion = periodoTranslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }
    
    
    
}

