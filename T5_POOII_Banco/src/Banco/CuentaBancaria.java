/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Banco;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public abstract class CuentaBancaria {
    
    private final String iban;
    private double saldo;
    public static final double interesAnualBasico = 0.05;
    
    //Constructor 

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }
    
    //Getter y setters

    public double getSaldo() {
        return saldo;
    }

    
    //Metodos
    
    public void consultar() {
        System.out.println("Iban: " + iban);
        System.out.println("Saldo: " + saldo);
    }
    
    private double añadir(double dinero) {
        return saldo += dinero;
    }
    
    public void ingresar(double dinero) {
        añadir(dinero);
    }
    
    public void retirar(double dinero) {
        añadir(-dinero);
    }
    
    public void transpaso(CuentaBancaria cuenta) {
        
    }
    
    public abstract void calcularIntereses();
    
    
}

