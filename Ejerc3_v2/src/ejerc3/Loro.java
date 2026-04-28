/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public class Loro extends Ave{
    private String origen;
    private boolean habla;
    
    //********** CONSTRUCTOR

    public Loro(String nombre, int edad, String fechaNacimiento, String origen, boolean habla, String pico, boolean vuela) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }
    
    
    //********** MÉTODOS
    @Override
    void volar() {
        this.vuela=true;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Origen : " + this.getOrigen());
        System.out.println("Habla  : " + this.isHabla());
    }

    @Override
    void hablar() {
        System.out.println("Lorito, lorito");
    }
    
    public void saludar(){
        System.out.println("Buenos días");
    }
    
    //********** GETTERS

    public String getOrigen() {
        return origen;
    }
    
    public boolean isHabla() {
        return habla;
    }

      
}//class
