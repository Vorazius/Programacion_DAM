/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej2_astros;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
abstract class Astros {
    
    private double radio_ecuatorial;
    private double rotacion_eje;
    private double masa;
    private double temperatura;
    private double gravedad;

    public Astros(double radio_ecuatorial, double rotacion_eje, double masa, double temperatura, double gravedad) {
        this.radio_ecuatorial = radio_ecuatorial;
        this.rotacion_eje = rotacion_eje;
        this.masa = masa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

    public double getRadio_ecuatorial() {
        return radio_ecuatorial;
    }

    public void setRadio_ecuatorial(double radio_ecuatorial) {
        this.radio_ecuatorial = radio_ecuatorial;
    }

    public double getRotacion_eje() {
        return rotacion_eje;
    }

    public void setRotacion_eje(double rotacion_eje) {
        this.rotacion_eje = rotacion_eje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

     public abstract void muestra();
    
    
} //class
