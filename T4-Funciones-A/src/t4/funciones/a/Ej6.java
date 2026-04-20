/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA*/
/**
 *
 * @author Marta González
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Precio " + i + ": ");
            precio = sc.nextInt();
            System.out.println("Precio " + i + "con IVA: " + precioIVA(precio));
        }
    } //main
    
    public static double precioIVA(double precio) {
        double resultado = precio*0.21;
        return resultado + precio;
    }
} //class
