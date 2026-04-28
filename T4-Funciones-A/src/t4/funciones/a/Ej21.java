/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.*;

/**
 *
 * @author Marta
 */
/*Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve
Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve
Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).
Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
el programa si es elegida.*/
public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            opcion = menu();
            double r;
            
            switch (opcion) {
                
                case 1:
                    r = pideRadio();
                    System.out.println("Cicunferencia = " + circunferencia(r));
                    break;
                case 2:
                    r = pideRadio();
                    System.out.println("Area = " + area(r));
                    break;
                case 3:
                    r = pideRadio();
                    System.out.println("Volumen = " + volumen(r));
                    break;
                case 4:
                    r = pideRadio();
                    System.out.println("Cicunferencia = " + circunferencia(r));
                    System.out.println("Area = " + area(r));
                    System.out.println("Volumen = " + volumen(r));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error");
            }
        } while(opcion != 5);
    }
    
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Circunferencia");
        System.out.println("2.- Area");
        System.out.println("3.- Volumen");
        System.out.println("4.- Todas");
        System.out.println("5.- Salir");
        return sc.nextInt();
    }
    
    public static double pideRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        return sc.nextDouble();
    }
    
    public static double circunferencia(double r) {
        return 2*Math.PI*r;
    }
    
    public static double area(double r) {
        return Math.PI*(r*r);
    }
    
    public static double volumen(double r) {
        return (4/3)*Math.PI*Math.pow(r, 3);
    }
}

