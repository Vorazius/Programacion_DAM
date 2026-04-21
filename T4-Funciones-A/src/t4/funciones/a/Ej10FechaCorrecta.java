/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t4.funciones.a;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.*/
/**
 *
 * @author Marta González
 */
public class Ej10FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce año: ");
        int año = sc.nextInt();
        
        if (fecha(dia, mes, año) == true) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    } //main
    
    public static boolean fecha(int dia, int mes, int año) {
        if (dia>0 && dia < 31 && mes>0 && mes<13 && año>=0 && año<3001) {
            return true;
        } else {
            return false;
        }
    }
} //class
