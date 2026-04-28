/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;

import java.util.Scanner;

/**
 *
 * @author darkh
 */
public class DawBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Introduzca el IBAN: ");
        String iban = sc.next();
        System.out.println("Introduzca el titular: ");
        String titular = sc.next();
        
        
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        
        do {
             
            System.out.println("1.- Datos de la cuenta");
            System.out.println("2.- IBAN");
            System.out.println("3.- Titular");
            System.out.println("4.- Saldo");
            System.out.println("5.- Ingreso");
            System.out.println("6.- Retirada");
            System.out.println("7.- Movimientos");
            System.out.println("8.- Salir");
            
            opcion = sc.nextInt();
            
            
            switch(opcion) {
                
                case 1:
                    cuenta.mostrar();
                    break;
                case 2:
                    System.out.println(cuenta.getIban());
                    break;
                case 3:
                    System.out.println(cuenta.getTitular());
                    break;
                case 4:
                    System.out.println(cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("Cuento quieres ingresar: ");
                    int cantidad = sc.nextInt();
                    cuenta.ingresar(cantidad);
                    break;
                case 6:
                    System.out.println("Cuanto quieres retirar: ");
                    cantidad = sc.nextInt();
                    cuenta.retirar(cantidad);
                    break;
                case 7:
                    System.out.println(cuenta.getMovimientos());
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Parametro incorrecto");
            }
            
        } while (opcion != 8);
        
    }
    
}
