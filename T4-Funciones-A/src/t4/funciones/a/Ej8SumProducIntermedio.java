/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N*/
/**
 *
 * @author Marta González
 */
public class Ej8SumProducIntermedio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int N = sc.nextInt();
        
        System.out.println("El sumatorio es: "  + sumatorio(N));
        System.out.println("El productorio es: " + productorio(N));
        System.out.println("El valor intermedio es: " + intermedio(N));
    } //main
    
    public static int sumatorio(int N) {
        int suma=0;
        for (int i = 1; i<=N; i++) {
            suma += i;
        }
        
        return suma;
    }
    
    public static int productorio(int N) {
        int producto=1;
        for (int i = 1; i<=N; i++) {
            producto *= i;
        }
        
        return producto;
    }
    
    public static double intermedio(double N) {
        double intermedio = N/2;
        return intermedio;
    }
} //class
