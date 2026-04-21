/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores*/
/**
 *
 * @author Marta González
 */
public class Ej9Mayor3Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int masGrande;
        
        System.out.println("Numero 1: ");
        int a = sc.nextInt();
        System.out.println("Numero 2: ");
        int b = sc.nextInt();
        System.out.println("Numero 3: ");
        int c = sc.nextInt();
        
        masGrande = mayor(a, b);
        masGrande = mayor(masGrande, c);
     
        System.out.println("El mayor es: " + masGrande);
    } //main
    
    public static int mayor(int num1, int num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
} //class
