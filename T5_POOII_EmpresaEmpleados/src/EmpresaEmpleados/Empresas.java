/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EmpresaEmpleados;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Empresas {
    
    private final String nombre;
    private final String CIF;
    private int telefono;
    private String direccion;
    ArrayList<Empleados> empleado;

    public Empresas(String nombre, String CIF, int telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
        ArrayList<Empleados> empleado = new ArrayList();
    }
    
    //Getters y setter

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

   
    
    //Metodos
    
    public void añadirEmpleados(Empleados em) {
        empleado.add(em);
    }
    
    public void eliminarEmpleados(Empleados em){
        empleado.remove(em);
    }
    
    public void mostrarEmpleados() {
        for (int i = 0; i < empleado.size() ; i++) {
            empleado.get(i).imprimir();
        }
    }
    
    
    
}

