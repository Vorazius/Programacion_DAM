/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
*/
/**
 *
 * @author Marta González
 */
public class Ej13CalcDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        int precio = sc.nextInt();
        System.out.println("Introduce precio con descuento: ");
        int conDescuento = sc.nextInt();
        
        System.out.println("El porcentaje de descuento es: " + String.format("%.2f", descuento(precio, conDescuento)) + "%");
        
    } //main
    
    public static double descuento(double precio, double conDescuento) {
        double diferencia = precio - conDescuento;
        return (diferencia/precio)*100;
    }
} //class
