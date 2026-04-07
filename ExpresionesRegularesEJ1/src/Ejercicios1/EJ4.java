/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import static Ejercicios1.Ej3.validarExpresion;
import java.util.Scanner;
import java.util.regex.*;

/* -----------------T-MOD-Ej------------------*/
/*Valida un número entero, un positivo y un negativo*/
/**
 *
 * @author Marta González
 */
public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        String num = sc.next();
        
        if (validarNumEntero(num) == true) {
            System.out.println("El DNI es correcto");
        } else {
            System.out.println("El DNI es incorrecto");
        }
    } //main
    
    public static boolean validarNumEntero(String num){
        return num.matches("^-?[0-9]+$");
    }
    
    public static boolean validarNumPositivo(String num){
        return num.matches("^[+]?[0-9]+$");
    }
    
    public static boolean validarNumNegativo(String num){
        return num.matches("^-\\d+$");
    }
} //class
