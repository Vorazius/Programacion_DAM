/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dawbank;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class CuentaBancaria {
    
    private static final int MAX_MOVIMIENTOS = 100;
    
    private final String iban;
    private final String titular;
    private double saldo;
    private int movimientos;

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        saldo = 0;
        movimientos = 0;
    }

    //Getters y setters
    public double getSaldo() {
        return saldo;
    }
    
    public int getMovimientos() {
        return movimientos;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }
    
    

    //Metodos
    
    public void ingresar(int cantidad) {
        if (cantidad > 0) {
            if (cantidad>=3000) {
                System.out.println("Notificar a hacienda");
            }
            saldo += cantidad;
            movimientos++;
        } else {
            System.err.println("La cantidad debe ser mayor a cero");
        }
    }
    
    public void retirar(int cantidad) {
        if (cantidad > 0) {
            if (saldo-cantidad<-50) {
                System.out.println("No puedes ingresar esa cantidad (Saldo menor a -50)");
            } else {
                saldo -= cantidad;
                movimientos++;
            }
        } else {
            System.err.println("La cantidad debe ser mayor a cero");
        }
        
        if (saldo<0 && saldo>-50) {
            System.out.println("Actualmente tu saldo es negativo");
        }
        
    }
    
    public void mostrar() {
        System.out.println(titular);
        System.out.println(iban);
        System.out.println(saldo);
    }
    
    
    
}

