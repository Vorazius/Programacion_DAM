/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej5_empresa_empleados;

import java.util.*;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class Empresas {
    
    //VARIABLES INSTANCIA
    private final String nombre;
    private final String CIF;
    private int telefono;
    private String  direccion;
    private ArrayList<Empleados> trabajadores = new ArrayList<>();
    
    //CONSTRUCTOR

    public Empresas(String nombre, String CIF, int telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //GETTER Y SETTER

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
    public void añadirEmpleado() {
        
    }

    public void eliminarEmpleado() {
        
    }
    
} //class
