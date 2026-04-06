/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.Scanner;
import java.util.regex.*;

/* -----------------T-MOD-Ej------------------*/
/*Analiza si un nombre propio tiene la estructura correcta*/
/**
 *
 * @author Marta González
 */
public class Ej2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = sc.next();
        
        if (validarNombre(nombre) == true) {
            System.out.println("El nombre es correcto");
        } else {
            System.out.println("El nombre es incorrecto");
        }
        
    } //main
    
    public static boolean validarNombre(String nombre){
            return nombre.matches("^[A-Z]{1}[a-z]+$");
    }
} //class
