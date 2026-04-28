/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DawBank;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class CuentaBancaria {
    
    String IBAN;
    String titular;
    double saldo;
    int movimientos;

    public CuentaBancaria(String IBAN, String titular) {
        this.IBAN = IBAN;
        this.titular = titular;
        saldo = 0;
        movimientos = 0;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
    
    //Metodos
    
    
    
    
} //class
