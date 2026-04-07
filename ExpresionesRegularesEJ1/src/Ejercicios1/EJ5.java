/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.regex.*;
import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Validar un binario, octal y hexadecimal */
/**
 *
 * @author Marta González
 */
public class EJ5 {
    public static void main(String[] args) {
        
        System.out.println(validarNumBinario("01"));
        System.out.println(validarNumOctal("77"));
        System.out.println(validarNumHexadecimal("5B"));
        
        
    } //main
    
    public static boolean validarNumBinario(String num){
        return num.matches("^[0-1]+$");
    }
    
    public static boolean validarNumOctal(String num){
        return num.matches("^[0-7]+$");
    }
    
    public static boolean validarNumHexadecimal(String num){
        return num.matches("^[0-9a-fA-F]+$");
    }
    
    
} //class
