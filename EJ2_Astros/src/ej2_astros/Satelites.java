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
public class Satelites extends Astros {
    
    private double distancia;
    private double orbita;
    private String planetaPertenece;

    public Satelites(double distancia, double orbita, String planetaPertenece, double radio_ecuatorial, double rotacion_eje, double masa, double temperatura, double gravedad) {
        super(radio_ecuatorial, rotacion_eje, masa, temperatura, gravedad);
        this.distancia = distancia;
        this.orbita = orbita;
        this.planetaPertenece = planetaPertenece;
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

    public String getPlanetaPertenece() {
        return planetaPertenece;
    }

    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }
    
    @Override
    public void muestra() {

        System.out.println("PLANETA");
        System.out.println("Radio ecuatorial: " + getRadio_ecuatorial());
        System.out.println("Rotacion eje: " + getRotacion_eje());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Gravedad: " + getGravedad());

        System.out.println("Distancia al planeta: " + distancia);
        System.out.println("Orbita: " + orbita);
        System.out.println("Planeta al que pertenece: " + planetaPertenece);
    }
    
    
} //class
