/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_mascotas;

/**
 *
 * @author Marta González
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos unas cuantas mascotas
        Perro p1 = new Perro("Rambo", 5, "Feb-2015", "Pastor alemán", false);
        Perro p2 = new Perro("Lassie", 7,  "Abril-2013", "Rottweiler", false);
        Gato g1 = new Gato("Doraemon", 2, "Sept-2018", "negro", false);
        Gato g2 = new Gato("Sakura", 2, "Julio-2018", "blanco", true);
        Loro l1 = new Loro("Parlanchín", 10, "Enero-2010", "Costa Rica", true, "Largo", true);
        Canario c1 = new Canario("Chico", 5,  "Dic-2015", "amarillo", true, "corto", true);
        
        // Creamos inventario
        Inventario inventario = new Inventario();
        
        // Añadimos mascotas al inventario
        inventario.insertarAnimal(p1);
        inventario.insertarAnimal(p2);
        inventario.insertarAnimal(g1);
        inventario.insertarAnimal(g2);
        inventario.insertarAnimal(l1);
        inventario.insertarAnimal(c1);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
        
        // Mostramos todos los animales
        inventario.mostrarTodosAnimales();
        
        // Eliminamos un par de mascotas
        inventario.eliminarAnimal(1);
        inventario.eliminarAnimal(2);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
    }
    
}
