/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros*/
/**
 *
 * @author Marta González
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de millas: ");
        int millas = sc.nextInt();
        
        System.out.println("El numero de kilometros es: " + calcMillas(millas));
    } //main
    
    public static double calcMillas(int millas) {
        return millas * 160934;
    }
} //class
