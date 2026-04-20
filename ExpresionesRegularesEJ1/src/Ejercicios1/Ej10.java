/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios1;

import java.util.Scanner;
import java.util.regex.*;


/* -----------------T-MOD-Ej------------------*/
/*Se proporciona el siguiente texto:
"Febrero es un mes curioso, ya que para cuadrar el calendario, un año bisiesto debe ser
divisible entre 4, salvo que sea año secular -el último de cada siglo, terminado en 00- en
cuyo caso también ha de ser divisible entre 400. De esta manera, nunca existirá el 30/02/ de
cualquier año, pero sí el 29/02/2024. En consecuencia, este año no hay 29/02/2025, ni
existió el 29/02/1900, pero sí el 29/02/2000. Por otro lado, hay meses que no tienen 31 días,
y por eso no existe el 31/09/2025, al igual que no existió el 31/11/2024, pero sí el
30/11/2014. Adicionalmente, hay fechas que no cumplen el formato que nosotros hemos
diseñado, por ejemplo el 13-2-2025, aunque conceptualmente sea una fecha válida. Por
cierto, hoy es 13/02/2025.
Diseña un programa en Java que sea capaz de examinar el texto anterior y de mostrar por
pantalla las fechas que además de cumplir el formato, sean correctas.
*/
/**
 *
 * @author Marta González
 */
public class Ej10 {
    public static void main(String[] args) {

        System.out.println(validarFecha("31/02/1000"));
        
    } //main
    
    
    public static boolean validarFecha(String fecha){
        return fecha.matches("^([012][0-9]|3[01])/(0[1-9]|1[012])/([12][0-9][0-9][0-9])$");
    }
    
} //class
