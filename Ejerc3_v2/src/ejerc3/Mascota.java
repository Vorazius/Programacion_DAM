/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc3;

/**
 *
 * @author Jesús Pérez
 */
public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected boolean estado=true;
    protected String fechaNacimiento;
    
    //********** CONSTRUCTOR

    public Mascota(String nombre, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //********** MÉTODOS
    public void mostrar(){
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Edad   : " + this.edad);
        System.out.println("Estado : " + this.estado);
        System.out.println("Nacido : " + this.fechaNacimiento);
    }
    
    abstract void hablar();
    
    public void cumpleaños(){
        this.edad++;
    }
    
    public void morir(){
        this.estado=false;
    }
    
    //*********** GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
  
    
}//class
