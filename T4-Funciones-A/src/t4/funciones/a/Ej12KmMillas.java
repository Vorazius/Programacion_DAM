/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.*/
/**
 *
 * @author Marta González
 */
public class Ej12KmMillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de kilometros: ");
        int km = sc.nextInt();
        
        System.out.println("En millas son: " + Millas(km));
    } //main
    
    public static double Millas(int km) {
        return km/160934;
    }
} //class