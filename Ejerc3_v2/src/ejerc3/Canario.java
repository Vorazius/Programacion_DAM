/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public class Canario extends Ave{
    private String color;
    private boolean canta;
    
    //********** CONSTRUCTOR

    public Canario(String nombre, int edad, String fechaNacimiento, String color, boolean canta, String pico, boolean vuela) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }
    
    
    //********** MÉTODOS
    @Override
    void volar() {
        this.vuela=true;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color  : " + this.getColor());
        System.out.println("Canta  : " + this.isCanta());
    }

    @Override
    void hablar() {
        System.out.println("Pío, pío, pío...");
    }
    
    //********** GETTERS 

    public String getColor() {
        return color;
    }
    
    public boolean isCanta() {
        return canta;
    }

           
}//class
