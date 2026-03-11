/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej3_mascotas;

import java.util.ArrayList;

public class Inventario {

    // ArrayList privado donde se guardan los animales
    private ArrayList<Mascotas> animales;

    // Constructor
    public Inventario() {
        animales = new ArrayList<>();
    }

    // Insertar animal
    public void insertarAnimal(Mascotas m) {
        animales.add(m);
    }

    // Mostrar lista de animales (tipo + nombre)
    public void mostrarListaAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            Mascotas m = animales.get(i);
            System.out.println(i + " - " + m.getClass().getSimpleName() + " : " + m.getNombre());
        }
    }

    // Mostrar todos los animales (todos sus datos)
    public void mostrarTodosAnimales() {
        for (Mascotas m : animales) {
            m.muestra();
            System.out.println("----------------------");
        }
    }

    // Eliminar animal por posición
    public void eliminarAnimal(int posicion) {

        if (posicion >= 0 && posicion < animales.size()) {
            animales.remove(posicion);
        } else {
            System.out.println("Posición no válida");
        }

    }

    // Vaciar inventario
    public void vaciarInventario() {
        animales.clear();
    }
}