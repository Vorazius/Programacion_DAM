/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public class Perro extends Mascota{
    private String raza;
    private boolean pulgas;
    
    //********** CONSTRUCTOR
    public Perro(String nombre, int edad, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    //********** MÉTODOS
    @Override
    public void mostrar() {
       super.mostrar();
        System.out.println("Raza   : " + this.raza);
        System.out.println("Pulgas : " + this.pulgas);
    }

    @Override
    void hablar() {
        System.out.println("¡¡Guau, guau, guau!!");
    }
    
    //********** GETTERS Y SETTERS

    public String getRaza() {
        return raza;
    }

       public boolean isPulgas() {
        return pulgas;
    }

       
}
