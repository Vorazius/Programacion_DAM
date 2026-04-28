/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Mascotas;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public abstract class Mascotas {
    
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private boolean estado;

    public Mascotas(String nombre, int edad, String fechaNacimiento, boolean estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    //Metodos
    
    
    public abstract void habla();
    
    public String cumpleaños() {
        return fechaNacimiento;
    }
    
    public boolean morir() {
        return estado;
    }
    
    public void muestra() {
        System.out.println("nombre=" + nombre);
        System.out.println("edad=" + edad);
        System.out.println("Fecha nacimiento= " + fechaNacimiento);
        System.out.println("Estado= " + estado);
    }

   
    
    
}

