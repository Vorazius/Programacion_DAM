/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Validar una matrícula y una fecha */
/**
 *
 * @author Marta González
 */
public class EJ7 {
    public static void main(String[] args) {

    } //main
    
    public static boolean validarMatricula(String matricula) {
        return matricula.matches("^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$");
    }
    
    public static boolean validarFecha(String fecha) {
        return fecha.matches("^$");
    }
} //class
