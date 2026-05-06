/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionficheros;

import java.util.Scanner;
import java.io.*;

/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class A1Marthza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        
        do {
            try {
                System.out.println("Introduce la ruta: ");
                ruta = sc.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error:");
                System.out.println(e);
                if (!ruta.equals("")) {
                    File rutaAbs = new File(ruta);
                    muestraInfoRuta(rutaAbs);
                }
            } catch (Exception e) {
                System.out.println("Error:");
                System.out.println(e);
            }
        } while (!ruta.equals(""));
        
    } //main
    
    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta no existe");
        }
        
        
    }
} //class
