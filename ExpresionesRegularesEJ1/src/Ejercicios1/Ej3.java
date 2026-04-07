/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import static Ejercicios1.Ej2.validarNombre;
import java.util.Scanner;
import java.util.regex.*;

/* -----------------T-MOD-Ej------------------*/
/*Valida un DNI*/
/**
 *
 * @author Marta González
 */
public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI");
        String DNI = sc.next();
        
        if (validarExpresion(DNI) == true) {
            System.out.println("El DNI es correcto");
        } else {
            System.out.println("El DNI es incorrecto");
        }
    } //main
    
    public static boolean validarExpresion(String DNI){
        return DNI.matches("^[0-9]{7,8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$");
    }
} //class
