/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/* Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
*/
/**
 *
 * @author Marta González
 */
public class Ej11TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:  ");
        int num = sc.nextInt();
        
        System.out.println("La tabla de multiplicar es: ");
        tablaMultiplicar(num);
    } //main
    
    public static void tablaMultiplicar(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + num + ": " + i*num);
        }
    }
} //class
