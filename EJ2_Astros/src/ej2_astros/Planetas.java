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
public class Planetas extends Astros {
    
    private double distancia;
    private double orbita;
    private boolean tieneSatelites;

    public Planetas(double distancia, double orbita, boolean tieneSatelites, double radio_ecuatorial, double rotacion_eje, double masa, double temperatura, double gravedad) {
        super(radio_ecuatorial, rotacion_eje, masa, temperatura, gravedad);
        this.distancia = distancia;
        this.orbita = orbita;
        this.tieneSatelites = tieneSatelites;
    }

    

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
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
    
    @Override
    public void muestra() {

        System.out.println("PLANETA");
        System.out.println("Radio ecuatorial: " + getRadio_ecuatorial());
        System.out.println("Rotacion eje: " + getRotacion_eje());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Gravedad: " + getGravedad());

        System.out.println("Distancia al sol: " + distancia);
        System.out.println("Periodo de orbita: " + orbita);
        System.out.println("Tiene satelites: " + tieneSatelites);
    }
} //class
