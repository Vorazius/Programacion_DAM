/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.*;

/**
 *
 * @author Marta
 */
/*Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array.
*/

public class Ej15ArraySumaMedia {
    public static void main(String[] args) {
        int[] array = new int[100];
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("La suma del array es: " + suma(array));
        System.out.println("La media del array es: " + media(array));

    }
    
    public static int suma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }
    
    public static double media(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return (double)suma/array.length;
    }
    
    
    
    
}

