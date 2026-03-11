/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_astros;

/**
 *
 * @author Marta González
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Crear planetas
        Planetas tierra = new Planetas(
                149600000, 365, true,
                6378, 24, 5.97E24, 15, 9.8);

        Planetas marte = new Planetas(
                227900000, 687, true,
                3396, 24.6, 6.39E23, -63, 3.7);

        // Crear satélites
        Satelites luna = new Satelites(
                384400, 27, "Tierra",
                1737, 27, 7.35E22, -20, 1.62);

        Satelites fobos = new Satelites(
                9376, 0.3, "Marte",
                11, 7.6, 1.06E16, -40, 0.0057);
        
        
    }
    
}
