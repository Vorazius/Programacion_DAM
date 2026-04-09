/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.Scanner;
import java.util.regex.*;


/* -----------------T-MOD-Ej------------------*/
/*Validar una dirección IP */
/**
 *
 * @author Marta González
 */
public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la IP");
        String  IP = sc.next();
        
        if (validarIP(IP) == true) {
            System.out.println("La IP es correcta");
        } else {
            System.out.println("La IP es incorrecta");
        }
        
    } //main
    
    public static boolean validarIP(String ip) {
        return ip.matches("^((25[0-5]?|2[0-4]?[0-9]?|1[0-9]?[0-9]?)\\.){3}(25[0-5]?|2[0-4]?[0-9]?|1[0-9]?[0-9]?)$");
    }
    
} //class
