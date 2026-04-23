/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A2;

import java.util.Scanner;

/**
 *
 * @author Marta González
 */

/*
Crea un programa con una clase llamada Persona que representará los datos
principales de una persona: dni, nombre, apellidos y edad.
En el main de la clase principal instancia dos objetos de la clase Persona.
Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos).
Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje
del estilo “Azucena Luján García con DNI ... es / no es mayor de edad”.
*/
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        p1.nombre = sc.next();
        System.out.println("Introduce el apellido");
        p1.apellido = sc.next();
        System.out.println("Introduce el edad");
        p1.edad = sc.nextInt();
        System.out.println("Introduce el dni");
        p1.dni = sc.next();
        
        
        String cadena1 = p1.nombre + " " + p1.apellido + " con DNI " + p1.dni; 
        
        if (p1.edad >=18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " es menor de edad";
        }

        System.out.println(cadena1);
        
    }
    
}
