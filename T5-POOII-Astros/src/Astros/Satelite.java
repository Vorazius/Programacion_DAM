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
public class Satelite extends Astros {
    private double distancia;
    private double orbita;
    private String planetaPertenece;
    
    //Constructor

    public Satelite(double distancia, double orbita, String planetaPertenece, double masaCuerpo, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia) {
        super(masaCuerpo, diametroMedio, periodoRotacion, periodoTranslacion, distanciaMedia);
        this.distancia = distancia;
        this.orbita = orbita;
        this.planetaPertenece = planetaPertenece;
    }

    
    
    
    //Getter y setter

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
    
    
    //Metodo
    
    public String muestra() {
        return "distancia=" + distancia + ", orbita=" + orbita + ", planetaPertenece=" + planetaPertenece;
    }
    
    
}

