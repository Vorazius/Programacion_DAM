/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4.funciones.a;

import java.util.*;
/**
 *
 * @author Marta González
 */
/*
Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos.
*/
public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce numero 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce numero 2: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Resultado: " + multiplica(num1, num2));
    }
    
    public static double multiplica(double a, double b) {
        double resultado = a * b;
        return resultado;
    }
    
}
