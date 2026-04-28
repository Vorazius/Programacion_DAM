/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/* Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.*/
/**
 *
 * @author Marta González
 */
public class Ej14Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracter: ");
        String caracter = sc.next();
        System.out.println("Introduce numero de lineas: ");
        int lineas = sc.nextInt();
        
        piramide(caracter, lineas);
    } //main
    
    public static void piramide(String caracter, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            for (int j = 0; j < lineas-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
} //class
