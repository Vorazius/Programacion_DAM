/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public abstract class Ave extends Mascota{
    protected String pico;
    protected boolean vuela;
    
    //********** CONSTRUCTOR
    public Ave(String pico, boolean vuela, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    //********** MÉTODOS
    abstract void volar();//Método propio

    @Override
    public void mostrar() {
        super.mostrar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Pico   : " + this.getPico());
        System.out.println("Vuela  : " + this.isVuela());
    }
    
    
    
    
    //********** GETTERS Y SETTERS

    public String getPico() {
        return pico;
    }

   
    public boolean isVuela() {
        return vuela;
    }

      

   
}
