/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public class Gato extends Mascota{
    private String color;
    private boolean peloLargo;
    
    //********** CONSTRUCTOR

    public Gato(String nombre, int edad, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    
    //********** MÉTODOS
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color    : " + this.getColor());
        System.out.println("PeloLargo: " + this.isPeloLargo());
    }

    @Override
    void hablar() {
        System.out.println("¡¡Miau, miau, miau!!");
    }
    
    //********** GETTERS Y SETTERS

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
        
}//class
