/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.Scanner;
import java.util.regex.*;

/* -----------------T-MOD-Ej------------------*/
/*Validar números reales: real, real positivo, real negativo y real con x decimales.*/
/**
 *
 * @author Marta González
 */
public class EJ6 {
    public static void main(String[] args) {
        System.out.println(validarNumReal("5324.3663456"));
        
        System.out.println(validarNumRealPositivo("+4.36"));
        
        System.out.println(validarNumRealNegativo("-4.36"));
    } //main
    
    public static boolean validarNumReal(String num) {
        return num.matches("^[0-9]+[.][0-9]+$");
    }
    
    public static boolean validarNumRealPositivo(String num) {
        return num.matches("^[+]?[0-9]+[.][0-9]+$");
    }
    
    public static boolean validarNumRealNegativo(String num) {
        return num.matches("^[-]{1}[0-9]+[.][0-9]+$");
    }
    
    public static boolean  validarNumRealxDecimales(String num, int decimales) {
        if (decimales>0) {
            return num.matches("^$");
        }
    }
    
} //class
