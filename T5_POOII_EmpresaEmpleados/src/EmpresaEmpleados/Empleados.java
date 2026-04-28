/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmpresaEmpleados;

/**
 *
 * @author darkh
 */
public class Empleados {

    private final String nombre;
    private final String DNI;
    private double sueldoBruto;
    private int edad;
    private int telefono;
    private String direccion;
    
    
    //Constructor

    public Empleados(String nombre, String DNI, double sueldoBruto) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBruto = sueldoBruto;
    }

    public Empleados(String nombre, String DNI, double sueldoBruto, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //getters y setters

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
    
    
    //Metodos
    
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }
    
    public double calcularNeto() {
        
        double IRPF;
        double sueldoAnual = sueldoBruto*12;
        
        if (sueldoAnual < 12000) {
            IRPF = 0.20;
        } else if(sueldoAnual>= 12000 && sueldoAnual<25000) {
            IRPF = 0.30;
        } else {
            IRPF = 0.40;
        }
        
        double descuento = sueldoBruto*IRPF;
        double sueldoNeto = sueldoBruto - descuento;
        return sueldoNeto;
        
    }
}
