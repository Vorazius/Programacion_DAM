/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Texto;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Main {
    public static void main(String[] args) {
        Texto tex=new Texto(15);
        tex.añadirInicio("Hola");
        tex.añadirFinal(" Mundo");
        tex.imprimeCadena();
        tex.añadirFinal('!');
        tex.imprimeCadena();
        tex.añadirInicio('¡');
        tex.imprimeCadena();
        System.out.println("\nNúmero de vocales = "+tex.vocales());
    }
}

