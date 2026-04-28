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
/*Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.*/
public class Ej16ArrayAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tamaño del array: ");
        int longitud = sc.nextInt();
        
        int[] array = new int[longitud];
        aleatorio(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void aleatorio(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
    
    
}

