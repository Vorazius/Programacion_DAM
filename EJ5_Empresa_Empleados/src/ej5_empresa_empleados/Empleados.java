/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej5_empresa_empleados;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Empleados {
    
    //VARIABLES INSTANCIA
    private final String nombre;
    private final String DNI;
    private double sueldoBruto;
    private int edad;
    private int telefono;
    private String direccion;
    
    //CONSTRUCTOR

    public Empleados(String nombre, String DNI, double sueldoBruto) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBruto = sueldoBruto;
    }
    
    
    //GETTER Y SETTER

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", DNI=" + DNI + ", sueldoBruto=" + sueldoBruto + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    public void sueldoNeto (){
        double sueldoBrutoAnual = sueldoBruto*12;
        double sueldoNeto;
        if (sueldoBrutoAnual<12000) {
            sueldoNeto = sueldoBruto-(sueldoBruto*0.2);
        } else if (sueldoBrutoAnual>=12000 || sueldoBrutoAnual<=25000) {
            sueldoNeto = sueldoBruto-(sueldoBruto*0.3);
        } else {
            sueldoNeto = sueldoBruto-(sueldoBruto*0.4);
        }
    }
    
    
} //class
