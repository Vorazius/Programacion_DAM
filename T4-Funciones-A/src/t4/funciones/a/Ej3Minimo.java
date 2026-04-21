/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo*/
/**
 *
 * @author Marta González
 */
public class Ej3Minimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int a = sc.nextInt();
        System.out.println("Numero 2: ");
        int b = sc.nextInt();
        
        System.out.println("El minimo es: " + minimo(a, b));
    } //main
    
    public static int minimo(int a, int b) {
        if (a > b) {
            return b;
        }  else {
            return a;
        }
    }
} //class
