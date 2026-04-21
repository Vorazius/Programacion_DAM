/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro*/
/**
 *
 * @author Marta González
 */
public class Ej7AreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ancho: ");
        double ancho = sc.nextDouble();
        System.out.println("Introduce el alto: ");
        double alto = sc.nextDouble();
        
        System.out.println("El area es: " + area(ancho, alto));
        System.out.println("El perimetro es: " + perimetro(ancho, alto));
    } //main
    
    public static double area (double ancho, double alto){
        return ancho*alto;
    }
    
    public static double perimetro (double ancho, double alto){
        return 2*(ancho*alto);
    }
} //class
