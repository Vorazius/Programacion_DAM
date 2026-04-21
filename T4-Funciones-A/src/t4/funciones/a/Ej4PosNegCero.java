/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero*/
/**
 *
 * @author Marta González
 */
public class Ej4PosNegCero {
    public static void main(String[] args) {
        
    } //main
    
    public  static int dimeSigno(int numero) {
        int signo;
        
        if (numero > 0) {
            signo = 1;
        } else if(numero == 0) {
            signo = 0;
        } else {
            signo = -1;
        }
        
        return signo;
    } 
} //class
